package com.tmdbcodlab.android.ui.moviedetails

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tmdbcodlab.android.R
import com.tmdbcodlab.android.ui.movies.MoviesContract

/**
 * Created by ronelg on 12/19/17.
 */
class MovieDetailFragment: Fragment(), MovieDetailsContract.View {

    override var presenter: MovieDetailsContract.Presenter?
        get() = TODO(
                "not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }
}