package com.tmdbcodlab.android.data.source.local

import com.tmdbcodlab.android.data.source.TmdbDataSource
import com.tmdbcodlab.android.model.Movie
import io.reactivex.Observable

/**
 * Created by ronelg on 12/19/17.
 */
class TmdbLocalDataSource: TmdbDataSource {
    override fun getMoviesNowPlaying(): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}