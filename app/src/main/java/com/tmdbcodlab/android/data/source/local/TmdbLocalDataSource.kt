package com.tmdbcodlab.android.data.source.local

import android.content.Context
import com.tmdbcodlab.android.data.source.TmdbDataSource
import com.tmdbcodlab.android.model.Movie
import io.reactivex.Observable

/**
 * Created by ronelg on 12/19/17.
 */
class TmdbLocalDataSource(val context: Context): TmdbDataSource {
    override fun getMoviesNowPlaying(): Observable<List<Movie>> {
        return Observable.empty()
    }
}