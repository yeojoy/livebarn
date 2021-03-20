package me.yeojoy.livebarn.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * This is a principal model. Surface is a certain field in venues.
 *
 * Android already has Surface class for android view
 * So add prefix "Lb(LiveBarn)" to divide them to use.
 */
@Parcelize
data class LbSurface(
    var id: Int,
    var surfaceName: String?,
    var venueName: String?,
    var sport: String?,
    var status: String?,
    var server: LbServer?
) : Parcelable