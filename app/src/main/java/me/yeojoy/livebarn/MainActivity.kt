package me.yeojoy.livebarn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), MainContact.View {

    private lateinit var presenter: MainContact.Presenter
    private lateinit var viewPagerSport: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPresenter(MainPresenter(this))
        presenter.onViewCreated()
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.title_main_activity)

        viewPagerSport = findViewById(R.id.viewPagerSport)
        tabLayout = findViewById(R.id.tabLayout)
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