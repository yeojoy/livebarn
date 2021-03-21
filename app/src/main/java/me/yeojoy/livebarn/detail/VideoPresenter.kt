package me.yeojoy.livebarn.detail

class VideoPresenter(private val view: VideoContact.View) : VideoContact.Presenter {

    override fun closeButtonClicked() {
        view.onClose()
    }

    override fun onViewCreated() {

    }

    override fun onViewDestroyed() {

    }
}