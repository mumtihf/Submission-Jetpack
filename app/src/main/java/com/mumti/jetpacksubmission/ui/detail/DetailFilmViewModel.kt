package com.mumti.jetpacksubmission.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.mumti.jetpacksubmission.data.FilmRepository
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.vo.Resource

class DetailFilmViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    val filmId = MutableLiveData<String>()

    fun setSelectedMovies(moviesId: String) {
        this.filmId.value = moviesId
    }

    fun setSelectedTvShows(tvId: String) {
        this.filmId.value = tvId
    }

    var detailMovie: LiveData<Resource<MovieEntity>> = Transformations.switchMap(filmId) { mFilmId ->
        filmRepository.getDetailMovies(mFilmId)
    }

    var detailTvShow: LiveData<Resource<TvEntity>> = Transformations.switchMap(filmId) { mFilmId ->
        filmRepository.getDetailTvShows(mFilmId)
    }

    fun setFavoritedMovie() {
        val movieResource = detailMovie.value
        if (movieResource != null) {
            val movies = movieResource.data

            val newState = !movies?.favorited!!
            filmRepository.setFavoritedMovies(movies, newState)
        }
    }

    fun setFavoritedTvShow() {
        val tvResource = detailTvShow.value
        if (tvResource != null) {
            val tv = tvResource.data

            val newState = !tv?.favorited!!
            filmRepository.setFavoritedTvShows(tv, newState)
        }
    }
}