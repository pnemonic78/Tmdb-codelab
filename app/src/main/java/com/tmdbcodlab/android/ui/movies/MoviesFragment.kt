package com.tmdbcodlab.android.ui.movies

import android.support.v4.app.Fragment

/**
 * Created by ronelg on 12/19/17.
 */
class MoviesFragment : Fragment(), MoviesContract.View {

    override var presenter: MoviesContract.Presenter?
        get() = TODO(
                "not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun setLoadingIndicator(active: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}