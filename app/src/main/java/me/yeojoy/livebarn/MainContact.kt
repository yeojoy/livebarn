package me.yeojoy.livebarn

import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.mtlhouse.app.BasePresenter
import me.yeojoy.mtlhouse.app.BaseView

interface MainContact {
    interface Presenter : BasePresenter {
        fun loadSurfaces()
        fun numberOfSports(): Int
        fun getLbSurfacesByKey(key: String): MutableList<LbSurface>?
        fun getKeys(): List<String>
    }

    interface View : BaseView<Presenter> {
        fun onLoadSurfaces()
    }
}