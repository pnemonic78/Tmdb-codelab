package com.tmdbcodlab.android.data.source

import com.tmdbcodlab.android.model.Movie
import io.reactivex.Observable

/**
 * Created by ronelg on 12/19/17.
 */
interface TmdbDataSource {
    fun getMoviesNowPlaying(): Observable<List<Movie>>
}