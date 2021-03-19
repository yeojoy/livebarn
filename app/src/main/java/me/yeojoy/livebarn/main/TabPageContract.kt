package me.yeojoy.livebarn.main;

import me.yeojoy.livebarn.model.LbSurface;
import me.yeojoy.mtlhouse.app.BasePresenter
import me.yeojoy.mtlhouse.app.BaseView;

interface TabPageContract {
    interface Presenter : BasePresenter {
        fun surfaceClicked(position: Int)
        fun numberOfSurfaces(): Int
        fun surfaceAt(position: Int): LbSurface
    }

    interface View : BaseView<Presenter> {
        fun onClickItem(item: LbSurface)
    }
}
