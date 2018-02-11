package com.tmdbcodlab.android.ui.movies

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ronelg on 12/19/17.
 */
class MoviesPresenter(private val view: MoviesContract.View): MoviesContract.Presenter {

    init {
        view.presenter = this
    }

    private val disposables: CompositeDisposable = CompositeDisposable()

    override fun subscribe() {
        view.setLoadingIndicator(true)
    }

    override fun unsubscribe() {
        disposables.clear()
    }

    override fun loadMovies(forceUpdate: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}