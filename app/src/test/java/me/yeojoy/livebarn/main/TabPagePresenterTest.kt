package me.yeojoy.livebarn.main

import me.yeojoy.livebarn.DummyMaker
import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.livebarn.network.NetworkConstants
import me.yeojoy.livebarn.util.Sorter
import org.junit.Test

class TabPagePresenterTest {
    @Test
    fun initDataTest() {
        val dummySize = 100 // Max value is 273
        val sorter = Sorter()
        val dummyData = sorter.sortByTwoFactor(DummyMaker().getDummyDataWithSize(dummySize))
        assert(dummyData.size == dummySize)

        val presenter = TabPagePresenter(object: TabPageContract.View {
            override fun onClickItem(item: LbSurface) {}

            override fun setPresenter(presenter: TabPageContract.Presenter) {}

        }, dummyData)

        val initializedDataInTabPagePresenter = presenter.getLbSurfaces()

        println("Initialized Surfaces with title surface : ${presenter.numberOfSurfaces()}")
        assert(initializedDataInTabPagePresenter.size == presenter.numberOfSurfaces())

        // title's maximum value is dummySize
        assert((presenter.numberOfSurfaces() - dummyData.size) <= dummySize)
        // title's minimum value is 1
        assert((presenter.numberOfSurfaces() - dummyData.size) >= 1)

        var index = 0
        var titleSize = 0
        for (surface in initializedDataInTabPagePresenter) {
            if (surface.isTitle) {
                index = 0
                titleSize++
                println("venue : ${surface.venueName}")
                continue
            }

            if (index % 2 == 1) {
                // ODD
                assert(surface.imageUrl.equals(NetworkConstants.ODD_IMAGE_URL))
            } else {
                // EVEN
                assert(surface.imageUrl.equals(NetworkConstants.EVEN_IMAGE_URL))
            }
            index++
        }

        println("Title size : $titleSize")
    }
}