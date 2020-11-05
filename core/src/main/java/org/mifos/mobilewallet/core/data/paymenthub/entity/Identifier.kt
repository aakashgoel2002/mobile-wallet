package org.mifos.mobilewallet.core.data.paymenthub.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Identifier(
        @SerializedName("idType")
        var idType: IdentifierType? = null,
        @SerializedName("idValue")
        var idValue: String? = null) : Parcelable