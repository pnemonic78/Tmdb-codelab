package com.tmdbcodlab.android.ui.moviedetails

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tmdbcodlab.android.R
import com.tmdbcodlab.android.inject.components.DaggerApplicationComponent
import com.tmdbcodlab.android.inject.modules.ApplicationModule

/**
 * Created by ronelg on 12/19/17.
 */
class MovieDetailFragment : Fragment(), MovieDetailsContract.View {

    override var presenter: MovieDetailsContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(context!!)).build().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onResume() {
        super.onResume()
        presenter?.subscribe()
    }

    override fun onPause() {
        super.onPause()
        presenter?.unsubscribe()
    }

    companion object {
        fun newInstance(): MovieDetailFragment {
            return MovieDetailFragment()
        }
    }
}