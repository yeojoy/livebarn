package me.yeojoy.livebarn.main

import me.yeojoy.livebarn.DummyMaker
import me.yeojoy.livebarn.model.LbSurface
import org.junit.Test

class TabPagePresenterTest {
    @Test
    fun initDataTest() {
        val dummySize = 10
        val dummyData = DummyMaker().getDummyDataWithSize(dummySize)
        assert(dummyData.size == dummySize)

        val presenter = TabPagePresenter(object: TabPageContract.View {
            override fun onClickItem(item: LbSurface) {}

            override fun setPresenter(presenter: TabPageContract.Presenter) {}

        }, dummyData)

        println("Initialized Surfaces with title surface : ${presenter.numberOfSurfaces()}")

        // title's maximum value is 10
        assert((presenter.numberOfSurfaces() - dummyData.size) <= dummySize)
        // title's minimum value is 1
        assert((presenter.numberOfSurfaces() - dummyData.size) >= 1)
    }
}