package com.tmdbcodlab.android.model

import com.google.gson.annotations.SerializedName

/**
 * Dates.
 */
class Dates(
        @SerializedName("maximum") val maximum: String,
        @SerializedName("minimum") val minimum: String)