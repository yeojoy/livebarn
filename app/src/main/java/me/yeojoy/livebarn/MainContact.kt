package me.yeojoy.livebarn

import me.yeojoy.livebarn.app.NetworkView
import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.mtlhouse.app.BasePresenter
import me.yeojoy.mtlhouse.app.BaseView

class MainContact {
    interface Presenter : BasePresenter {
        fun loadSurfaces()
    }

    interface View : BaseView<Presenter>, NetworkView {
        fun onLoadSurfaces(surfaces: HashMap<String, MutableList<LbSurface>>?)
    }
}