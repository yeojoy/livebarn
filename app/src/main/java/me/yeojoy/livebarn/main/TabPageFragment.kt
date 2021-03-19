package me.yeojoy.livebarn.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.yeojoy.livebarn.model.LbSurface

class TabPageFragment : Fragment(), TabPageContract.View {
    companion object {
        private val TAG = TabPageFragment::class.simpleName
        fun newInstance(surfaces: List<LbSurface>): TabPageFragment {
            val args = Bundle()
            args.putParcelableArrayList(TAG, surfaces as ArrayList)

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
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onClickItem(item: LbSurface) {

    }

    override fun setPresenter(presenter: TabPageContract.Presenter) {

    }
}