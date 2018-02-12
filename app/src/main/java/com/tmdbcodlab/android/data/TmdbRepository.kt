package com.tmdbcodlab.android.data

import com.tmdbcodlab.android.data.source.TmdbDataSource
import com.tmdbcodlab.android.data.source.local.TmdbLocalDataSource
import com.tmdbcodlab.android.data.source.remote.TmdbRemoteDataSource
import com.tmdbcodlab.android.model.Movie
import com.tmdbcodlab.android.model.MovieDetails
import io.reactivex.Observable

/**
 * Created by ronelg on 12/19/17.
 */
class TmdbRepository(private val localRepository: TmdbLocalDataSource,
                     private val remoteRepository: TmdbRemoteDataSource)
    : TmdbDataSource {

    override fun getMoviesNowPlaying(): Observable<List<Movie>> {
        return localRepository.getMoviesNowPlaying()
    }

    override fun getMovieDetails(movieId: Long): Observable<MovieDetails> {
        return localRepository.getMovieDetails(movieId)
    }
}