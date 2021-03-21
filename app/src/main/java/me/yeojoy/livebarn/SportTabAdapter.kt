package me.yeojoy.livebarn

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import me.yeojoy.livebarn.main.TabPageFragment
import me.yeojoy.livebarn.model.LbSurface

class SportTabAdapter(activity: AppCompatActivity, private val presenter: MainContact.Presenter)
    : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return presenter.numberOfSports()
    }

    override fun createFragment(position: Int): Fragment {
        val key = presenter.getKeys()[position]
        val surfaces: List<LbSurface>? = presenter.getLbSurfacesByKey(key)
        surfaces?.let {
            return TabPageFragment.newInstance(key, it)
        }
        return TabPageFragment.newInstance("LiveBarn", emptyList())
    }
}