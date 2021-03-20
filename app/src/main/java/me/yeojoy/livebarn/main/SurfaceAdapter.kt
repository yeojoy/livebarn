package me.yeojoy.livebarn.main

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.*
import me.yeojoy.livebarn.R
import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.livebarn.network.NetworkConstants
import java.net.URL

class SurfaceAdapter(private val presenter: TabPageContract.Presenter)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_VENUE = 1
        private const val VIEW_TYPE_SURFACE = 2
    }

    private var itemSizeInSameVenue: Int = 0

    private val parentJob = Job()

    private val coroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            coroutineScope.launch(Dispatchers.Main) {
                // TODO show error
            }

            GlobalScope.launch { println("Caught $throwable") }
        }

    private val coroutineScope = CoroutineScope(
        Dispatchers.Main + parentJob +
                coroutineExceptionHandler
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_VENUE -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.row_title, parent, false)
                VenueViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.row_surface, parent, false)
                SurfaceViewHolder(view, presenter::surfaceClicked)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val surface = presenter.surfaceAt(position)

        when (holder) {
            is SurfaceViewHolder -> bindSurfaceViewHolder(holder as SurfaceViewHolder, surface)
            else -> bindVenuViewHolder(holder as VenueViewHolder, surface)
        }
    }

    private fun bindVenuViewHolder(viewHolder: VenueViewHolder, surface: LbSurface) {
        viewHolder.textViewVenueName.text = surface.venueName
        itemSizeInSameVenue = 0
    }

    private fun bindSurfaceViewHolder(viewHolder: SurfaceViewHolder, surface: LbSurface) {
        itemSizeInSameVenue++
        viewHolder.textViewSurfaceName.text = surface.surfaceName
        viewHolder.textViewIp.text = surface.server?.ip4

        coroutineScope.launch(Dispatchers.Main) {
            val url = when (itemSizeInSameVenue % 2 == 1) {
                true -> NetworkConstants.ODD_IMAGE_URL
                else -> NetworkConstants.EVEN_IMAGE_URL
            }

            // TODO Caching image
            val bitmap = getImage(url)
            viewHolder.imageViewSurface.setImageBitmap(bitmap)
        }
    }

    override fun getItemCount(): Int {
        return presenter.numberOfSurfaces()
    }

    override fun getItemViewType(position: Int): Int {
        return if (presenter.surfaceAt(position).isTitle) VIEW_TYPE_VENUE
            else VIEW_TYPE_SURFACE
    }

    inner class SurfaceViewHolder(itemView: View, val itemClickListener : (position: Int) -> Unit)
        : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        val imageViewSurface: ImageView = itemView.findViewById(R.id.imageViewSurface)
        val textViewSurfaceName: TextView = itemView.findViewById(R.id.textViewSurfaceName)
        val textViewIp: TextView = itemView.findViewById(R.id.textViewIp)

        override fun onClick(v: View?) {
            itemClickListener(adapterPosition)
        }
    }

    inner class VenueViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewVenueName: TextView = itemView.findViewById(R.id.textViewVenueName)
    }

    private suspend fun getImage(urlAddress: String): Bitmap =
        withContext(Dispatchers.IO) {
            URL(urlAddress).openStream().use {
                return@withContext BitmapFactory.decodeStream(it)
            }
        }
}