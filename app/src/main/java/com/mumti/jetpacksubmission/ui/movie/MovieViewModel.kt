package com.mumti.jetpacksubmission.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.mumti.jetpacksubmission.data.FilmRepository
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.vo.Resource

class MovieViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> = filmRepository.getAllMovies()

    fun getFavMovies(): LiveData<PagedList<MovieEntity>> = filmRepository.getFavoritedMovies()
}