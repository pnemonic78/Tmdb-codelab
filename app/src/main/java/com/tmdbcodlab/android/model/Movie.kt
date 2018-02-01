package com.tmdbcodlab.android.model

/**
 * Created by ronelg on 12/19/17.
 */
data class Movie(override var id: Long,
                 override var adult: Boolean,
                 override var backdropPath: String?,
                 override var genreIds: Array<Long>,
                 override var originalLanguage: String,
                 override var originalTitle: String,
                 override var overview: String?,
                 override var popularity: Float,
                 override var posterPath: String?,
                 override var releaseDate: String,
                 override var title: String,
                 override var video: Boolean,
                 override var voteAverage: Float,
                 override var voteCount: Int) :
        MovieBase(id,
                adult,
                backdropPath,
                genreIds,
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