package me.yeojoy.livebarn.detail

import me.yeojoy.mtlhouse.app.BasePresenter
import me.yeojoy.mtlhouse.app.BaseView

interface VideoContact {
    interface Presenter : BasePresenter {
        // TODO start, stop, pause
        fun closeButtonClicked()
    }

    interface View : BaseView<Presenter> {
        fun onClose()
    }
}