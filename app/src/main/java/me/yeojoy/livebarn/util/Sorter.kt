package me.yeojoy.livebarn.util

import me.yeojoy.livebarn.model.LbSurface

class Sorter {
    companion object {
        private val TAG = Sorter::class.simpleName
    }

    /**
     * Sort response data with venue name and surface name
     * First venue name and then surface name
     */
    fun sortByTwoFactor(data: List<LbSurface>): List<LbSurface> {
        return data.sortedWith(compareBy({ it.venueName }, { it.surfaceName }))
    }
}