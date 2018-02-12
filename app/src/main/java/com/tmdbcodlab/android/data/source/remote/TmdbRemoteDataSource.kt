package com.tmdbcodlab.android.data.source.remote

import com.tmdbcodlab.android.data.source.TmdbDataSource
import com.tmdbcodlab.android.model.Movie
import com.tmdbcodlab.android.model.MovieDetails
import io.reactivex.Observable

/**
 * Created by ronelg on 12/19/17.
 */
class TmdbRemoteDataSource: TmdbDataSource {
    override fun getMoviesNowPlaying(): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMovieDetails(movieId: Long): Observable<MovieDetails> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}