package me.yeojoy.livebarn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.yeojoy.livebarn.model.LbSurface

class MainActivity : AppCompatActivity(), MainContact.View {

    private lateinit var presenter: MainContact.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPresenter(MainPresenter(this))
        presenter.onViewCreated()

        presenter.loadSurfaces()
    }

    override fun onDestroy() {
        presenter.onViewDestroyed()
        super.onDestroy()
    }

    override fun onLoadSurfaces(surfaces: HashMap<String, LbSurface>?) {

    }

    override fun setPresenter(presenter: MainContact.Presenter) {
        this.presenter = presenter
    }

    override fun onSuccessCall() {

    }

    override fun onFailCall() {

    }
}