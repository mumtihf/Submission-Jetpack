package com.mumti.jetpacksubmission.ui.detail

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.mumti.jetpacksubmission.R
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.databinding.ActivityDetailFilmBinding
import com.mumti.jetpacksubmission.databinding.ContentDetailFilmBinding
import com.mumti.jetpacksubmission.viewmodel.ViewModelFactory
import com.mumti.jetpacksubmission.vo.Status

class DetailFilmActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TV = "extra_tv"
    }

    private lateinit var activityDetailFilmBinding: ActivityDetailFilmBinding
    private lateinit var detailFilmBinding: ContentDetailFilmBinding

    private lateinit var viewModel: DetailFilmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityDetailFilmBinding = ActivityDetailFilmBinding.inflate(layoutInflater)
        detailFilmBinding = activityDetailFilmBinding.detailContent

        setContentView(activityDetailFilmBinding.root)

        setSupportActionBar(activityDetailFilmBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailFilmViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val moviesId = extras.getString(EXTRA_MOVIE)
            val tvId = extras.getString(EXTRA_TV)

            if (moviesId != null) {
                viewModel.setSelectedMovies(moviesId)

                viewModel.detailMovie.observe(this, { movies ->
                    when (movies.status) {
                        Status.LOADING -> activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> if (movies.data != null) {
                            activityDetailFilmBinding.progressBar.visibility = View.GONE
                            populateMovies(movies.data)
                        }
                        Status.ERROR -> {
                            activityDetailFilmBinding.progressBar.visibility = View.GONE
                            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }

            if (tvId != null) {
                viewModel.setSelectedTvShows(tvId)

                viewModel.detailTvShow.observe(this, { tv ->
                    when (tv.status) {
                        Status.LOADING -> activityDetailFilmBinding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> if (tv.data != null) {
                            activityDetailFilmBinding.progressBar.visibility = View.GONE
                            populateTv(tv.data)
                        }
                        Status.ERROR -> {
                            activityDetailFilmBinding.progressBar.visibility = View.GONE
                            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
        }

        detailFilmBinding.fabFav.setOnClickListener {
            viewModel.setFavoritedMovie()
            viewModel.setFavoritedTvShow()
        }
    }

    private fun populateMovies(movies: MovieEntity) {
        detailFilmBinding.txtTitle.text = movies.title
        detailFilmBinding.txtType.text = movies.type
        detailFilmBinding.txtOverview.text = movies.overview
        detailFilmBinding.txtDuration.text = movies.duration
        detailFilmBinding.txtSlogan.text = movies.slogan

        val favorited = movies.favorited
        setFavoriteState(favorited)

        Glide.with(this)
            .load(movies.imagePath)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(detailFilmBinding.imagePoster)
    }

    private fun populateTv(tv: TvEntity) {
        detailFilmBinding.txtTitle.text = tv.title
        detailFilmBinding.txtType.text = tv.type
        detailFilmBinding.txtOverview.text = tv.overview
        detailFilmBinding.txtDuration.text = tv.duration
        detailFilmBinding.txtSlogan.text = tv.slogan

        val favorited = tv.favorited
        setFavoriteState(favorited)

        Glide.with(this)
            .load(tv.imagePath)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(detailFilmBinding.imagePoster)
    }

    private fun setFavoriteState(state: Boolean) {
        if (state) {
            detailFilmBinding.fabFav.setImageResource(R.drawable.ic_favorited)
        } else {
            detailFilmBinding.fabFav.setImageResource(R.drawable.ic_favorite)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return true
    }
}