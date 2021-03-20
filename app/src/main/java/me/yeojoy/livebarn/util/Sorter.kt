package me.yeojoy.livebarn.util

import android.util.Log
import me.yeojoy.livebarn.model.LbSurface

class Sorter {
    companion object {
        private val TAG = Sorter::class.simpleName
    }

    fun sortByTwoFactor(data: List<LbSurface>): List<LbSurface> {

        val sortedData = data.sortedWith(compareBy({ it.venueName }, { it.surfaceName }))

        for ((index, item) in data.withIndex()) {
            val sortedItem = sortedData[index]

            Log.d(TAG, "item / soretedItem venue : ${item.venueName} / ${sortedItem.venueName} " +
                    "::: surface : ${item.surfaceName} / ${sortedItem.surfaceName} ")
        }
        return sortedData
    }
}