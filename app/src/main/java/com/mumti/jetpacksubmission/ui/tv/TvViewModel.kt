package com.mumti.jetpacksubmission.ui.tv

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.mumti.jetpacksubmission.data.FilmRepository
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.vo.Resource

class TvViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getTvShows(): LiveData<Resource<PagedList<TvEntity>>> = filmRepository.getAllTvShows()

    fun getFavTvShows(): LiveData<PagedList<TvEntity>> = filmRepository.getFavoritedTvShows()
}