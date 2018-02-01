package com.tmdbcodlab.android.model

import com.google.gson.annotations.SerializedName

/**
 * Created by ronelg on 12/19/17.
 */
data class MovieDetails(override var id: Long,
                        override var adult: Boolean,
                        override var backdropPath: String?,
                        @SerializedName("budget") var budget: Int,
                        @SerializedName("genres") var genres: Array<Genre>,
                        @SerializedName("homepage") var homepage: String?,
                        @SerializedName("imdb_id") var imdbId: String?,
                        override var originalLanguage: String,
                        override var originalTitle: String,
                        override var overview: String?,
                        override var popularity: Float,
                        override var posterPath: String?,
                        @SerializedName("production_companies") var productionCompanies: Array<ProductionCompany>,
                        @SerializedName("production_countries") var productionCountries: Array<ProductionCountry>,
                        override var releaseDate: String,
                        @SerializedName("revenue") var revenue: Int?,
                        @SerializedName("runtime") var runtime: Int?,
                        @SerializedName("spoken_languages") var spokenLanguages: Array<SpokenLanguage>,
                        @SerializedName("status") var status: String,
                        @SerializedName("tagline") var tagline: String?,
                        override var title: String,
                        override var video: Boolean,
                        override var voteAverage: Float,
                        override var voteCount: Int) :
        MovieBase(id,
                adult,
                backdropPath,
                genres?.map { it.id }.toTypedArray(),
                originalLanguage,
                originalTitle,
                overview,
                popularity,
                posterPath,
                releaseDate,
                title,
                video,
                voteAverage,
                voteCount)

data class Genre(@SerializedName("id") var id: Long, @SerializedName("name") var name: String)

data class ProductionCompany(@SerializedName("id") var id: Long, @SerializedName("name") var name: String)

data class ProductionCountry(@SerializedName("iso_3166_1") var id: String, @SerializedName("name") var name: String)

data class SpokenLanguage(@SerializedName("iso_639_1") var id: String, @SerializedName("name") var name: String)