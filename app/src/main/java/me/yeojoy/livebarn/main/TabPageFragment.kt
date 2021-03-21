package me.yeojoy.livebarn.main

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.yeojoy.livebarn.R
import me.yeojoy.livebarn.app.Constants
import me.yeojoy.livebarn.detail.VideoActivity
import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.livebarn.network.NetworkConstants

class TabPageFragment : Fragment(), TabPageContract.View {

    private lateinit var presenter: TabPageContract.Presenter
    private lateinit var recyclerViewSurfaces: RecyclerView

    companion object {
        private val TAG = TabPageFragment::class.simpleName
        private const val KEY_TITLE = "title"
        private const val KEY_LIST_SURFACES = "surfaces"

        fun newInstance(title: String, surfaces: List<LbSurface>): TabPageFragment {
            val args = Bundle()
            args.putString(KEY_TITLE, title)
            args.putParcelableArrayList(KEY_LIST_SURFACES, surfaces as ArrayList)

            val fragment = TabPageFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val surfaces = arguments?.getParcelableArrayList<LbSurface>(KEY_LIST_SURFACES)
        surfaces?.let {
            setPresenter(TabPagePresenter(this, it))
        }

        recyclerViewSurfaces = view.findViewById(R.id.recyclerViewSurfaces)
        recyclerViewSurfaces.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL, false)
        recyclerViewSurfaces.adapter = SurfaceAdapter(presenter)
        recyclerViewSurfaces.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
    }

    override fun onDestroyView() {
        (recyclerViewSurfaces.adapter as SurfaceAdapter).closeCoroutine()
        super.onDestroyView()
    }

    override fun onClickItem(item: LbSurface) {
        val alertDialog = AlertDialog.Builder(requireContext()).setTitle(item.surfaceName)
            .setMessage(item.venueName)
            .setPositiveButton(android.R.string.ok) { dialog, which ->
                val intent = Intent(requireContext(), VideoActivity::class.java)
                intent.putExtra(Constants.KEY_VIDEO_URL, NetworkConstants.VIDEO_URL)
                startActivity(intent)
            }
            .setNegativeButton(android.R.string.cancel) { dialog, which ->
                dialog.dismiss()
            }.create()

        alertDialog.show()
    }

    override fun setPresenter(presenter: TabPageContract.Presenter) {
        this.presenter = presenter
    }
}