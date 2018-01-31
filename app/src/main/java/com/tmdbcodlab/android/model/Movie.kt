package com.tmdbcodlab.android.model

import com.google.gson.annotations.SerializedName

/**
 * Created by ronelg on 12/19/17.
 */
data class Movie(@SerializedName("id") val id: Long,
                 @SerializedName("poster_path") val posterPath: String?,
                 @SerializedName("adult") val adult: Boolean,
                 @SerializedName("overview") val overview: String,
                 @SerializedName("release_date") val releaseDate: String,
                 @SerializedName("genre_ids") val genreIds: Array<Long>,
                 @SerializedName("original_title") val original_title: String,
                 @SerializedName("original_language") val originalLanguage: String,
                 @SerializedName("title") val title: String,
                 @SerializedName("backdrop_path") val backdropPath: String?,
                 @SerializedName("popularity") val popularity: Float,
                 @SerializedName("vote_count") val voteCount: Integer,
                 @SerializedName("video") val video: Boolean,
                 @SerializedName("vote_average") val voteAverage: Float)