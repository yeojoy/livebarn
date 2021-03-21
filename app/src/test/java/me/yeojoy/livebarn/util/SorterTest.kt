package me.yeojoy.livebarn.util

import me.yeojoy.livebarn.DummyMaker
import me.yeojoy.livebarn.model.LbSurface
import org.junit.Test

class SorterTest {
    @Test
    fun sort_test() {
        val rawData = DummyMaker().getDummyData()
        val sorter = Sorter()
        val resultData = sorter.sortByTwoFactor(rawData)

        for ((index, item) in resultData.withIndex()) {
            val rawItem = rawData[index]
            println("SORTED $index > ${item.venueName} / ${item.surfaceName}")
            println("RAW    $index > ${rawItem.venueName} / ${rawItem.surfaceName}")
        }

        assert(resultData[rawData.size - 1].surfaceName.equals("Gray Rink"))
        assert(resultData[rawData.size - 1].venueName.equals("Worcester Ice Center"))
        assert(resultData[0].surfaceName.equals("Rink #1"))
        assert(resultData[0].venueName.equals("Bellerive Ice Center"))
    }
}