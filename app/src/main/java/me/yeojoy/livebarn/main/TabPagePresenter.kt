package me.yeojoy.livebarn.main

import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.livebarn.network.NetworkConstants

class TabPagePresenter(private val view: TabPageContract.View, rawSurfaces: List<LbSurface>)
    : TabPageContract.Presenter {

    private var surfaces: MutableList<LbSurface> = mutableListOf()

    init {
        for ((index, surface) in rawSurfaces.withIndex()) {
            if (index == 0) {
                surfaces.add(LbSurface(-1, "", surface.venueName, "", "", null, "",true))
                surface.imageUrl = NetworkConstants.EVEN_IMAGE_URL
                surfaces.add(surface)
            } else {
                val preSurface = rawSurfaces[index - 1]
                if (!surface.venueName.equals(preSurface.venueName)) {
                    surfaces.add(LbSurface(-1, "", surface.venueName, "", "", null, "",true))
                    surface.imageUrl = NetworkConstants.EVEN_IMAGE_URL
                    surfaces.add(surface)
                } else {
                    if (preSurface.imageUrl.equals(NetworkConstants.EVEN_IMAGE_URL)) {
                        surface.imageUrl = NetworkConstants.ODD_IMAGE_URL
                    } else {
                        surface.imageUrl = NetworkConstants.EVEN_IMAGE_URL
                    }
                    surfaces.add(surface)
                }
            }
        }
    }

    override fun surfaceClicked(position: Int) {
        view.onClickItem(surfaceAt(position))
    }

    override fun numberOfSurfaces(): Int {
        return surfaces.size
    }

    override fun surfaceAt(position: Int): LbSurface {
        return surfaces[position]
    }

    override fun getLbSurfaces(): List<LbSurface> {
        return surfaces
    }

    override fun onViewCreated() {
    }

    override fun onViewDestroyed() {

    }
}