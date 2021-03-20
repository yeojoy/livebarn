package me.yeojoy.livebarn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import me.yeojoy.livebarn.model.LbSurface

class MainActivity : AppCompatActivity(), MainContact.View {

    private lateinit var presenter: MainContact.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPresenter(MainPresenter(this))
        presenter.onViewCreated()
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.title_main_activity)

        presenter.loadSurfaces()
    }

    override fun onDestroy() {
        presenter.onViewDestroyed()
        super.onDestroy()
    }

    override fun onLoadSurfaces() {
        viewPagerSport.adapter = SportTabAdapter(this, presenter)
        TabLayoutMediator(tabLayout, viewPagerSport) { tab, position ->
            tab.text = presenter.getKeys()[position]
        }.attach()
    }

    override fun setPresenter(presenter: MainContact.Presenter) {
        this.presenter = presenter
    }
}