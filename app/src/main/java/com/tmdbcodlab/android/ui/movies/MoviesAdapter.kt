package com.tmdbcodlab.android.ui.movies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.tmdbcodlab.android.R
import com.tmdbcodlab.android.model.Movie

/**
 * @author moshe on 2018/02/11.
 */
class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    var data: List<Movie> = emptyList()

    fun setItems(items: List<Movie>) {
        this.data = items
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val source = data[position]

        holder.bind(source)
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(android.R.id.title)
        private val summary: TextView = itemView.findViewById(android.R.id.summary)
        private val popularity: ProgressBar = itemView.findViewById(android.R.id.progress)
        private val poster: ImageView = itemView.findViewById(R.id.poster)
        private val date: TextView = itemView.findViewById(R.id.date)

        fun bind(movie: Movie) {
            title.text = movie.title
            summary.text = movie.overview
            popularity.progress = (movie.voteAverage * 10f).toInt()
            date.text = movie.releaseDate

//            val context = itemView.context
//        holder.sourceName.text = source.name
//        holder.sourceDescription.text = source.description
//        Glide.with(context)
//                .load(source.logo)
//                .into(holder.sourceImage)
//
//        holder.itemView.setOnClickListener {
//            val i = Intent(context, ArticlesActivity::class.java)
//            i.putExtra("id", source.id)
//            context.startActivity(i)
//        }
        }
    }
}