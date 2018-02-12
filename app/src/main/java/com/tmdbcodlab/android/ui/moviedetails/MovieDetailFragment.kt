package com.tmdbcodlab.android.ui.moviedetails

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tmdbcodlab.android.R
import com.tmdbcodlab.android.data.TmdbRepository
import com.tmdbcodlab.android.inject.components.DaggerApplicationComponent
import com.tmdbcodlab.android.inject.modules.ApplicationModule
import com.tmdbcodlab.android.model.MovieDetails
import javax.inject.Inject

/**
 * Created by ronelg on 12/19/17.
 */
class MovieDetailFragment : Fragment(), MovieDetailsContract.View {

    @Inject
    lateinit var repository: TmdbRepository

    override var presenter: MovieDetailsContract.Presenter? = null
    private var movieId: Long? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(context!!)).build().inject(this)
        presenter = MovieDetailsPresenter(repository, this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //TODO butterknife
    }

    override fun onStart() {
        super.onStart()
        presenter?.subscribe()
    }

    override fun onStop() {
        super.onStop()
        presenter?.unsubscribe()
    }

    fun setMovieId(movieId: Long) {
        this.movieId = movieId
        presenter?.loadMovie(movieId)
    }

    override fun showLoadingIndicator(active: Boolean) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMovie(movie: MovieDetails) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun newInstance(movieId: Long): MovieDetailFragment {
            val instance = MovieDetailFragment()
            instance.setMovieId(movieId)
            return instance
        }
    }
}