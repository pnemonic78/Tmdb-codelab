package com.tmdbcodlab.android.ui.moviedetails

import com.tikalk.mobileevent.mobileevent.BasePresenter
import com.tikalk.mobileevent.mobileevent.BaseView

/**
 * Created by ronelg on 12/19/17.
 */
interface MovieDetailsContract {

    interface View : BaseView<Presenter> {
    }

    interface Presenter : BasePresenter {

        fun loadMovies(forceUpdate: Boolean)
    }
}