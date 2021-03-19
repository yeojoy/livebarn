package me.yeojoy.livebarn.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LbServer(
    var id: Int,
    var ip4: String?,
    var dns: String?
) : Parcelable
