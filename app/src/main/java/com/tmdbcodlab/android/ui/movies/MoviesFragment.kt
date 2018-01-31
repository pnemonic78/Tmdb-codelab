package com.tmdbcodlab.android.ui.movies

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tmdbcodlab.android.R

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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }
}