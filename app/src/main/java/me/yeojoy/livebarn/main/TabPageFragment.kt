package me.yeojoy.livebarn.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_tab.*
import me.yeojoy.livebarn.R
import me.yeojoy.livebarn.model.LbSurface

class TabPageFragment : Fragment(), TabPageContract.View {

    private lateinit var presenter: TabPageContract.Presenter

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
        // TODO move To Detail Activity
        Log.i(TAG, "onClickItem : ${item.sport} / ${item.venueName} / ${item.surfaceName}")
    }

    override fun setPresenter(presenter: TabPageContract.Presenter) {
        this.presenter = presenter
    }
}