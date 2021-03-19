package me.yeojoy.livebarn.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LbSurface(
    var id: Int,
    var surfaceName: String?,
    var venueName: String?,
    var sport: String?,
    var status: String?,
    var server: LbServer?
) : Parcelable