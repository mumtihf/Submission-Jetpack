package com.mumti.jetpacksubmission.ui.tv

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.mumti.jetpacksubmission.data.FilmRepository
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvViewModelTest {

    private lateinit var viewModel: TvViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<TvEntity>>>

    @Mock
    private lateinit var favObserver: Observer<PagedList<TvEntity>>

    @Mock
    private lateinit var pagedList: PagedList<TvEntity>

    @Before
    fun setUp() {
        viewModel = TvViewModel(filmRepository)
    }

    @Test
    fun getTvShows() {
        val dummyTvShow = Resource.success(pagedList)
        Mockito.`when`(dummyTvShow.data?.size).thenReturn(17)
        val tv = MutableLiveData<Resource<PagedList<TvEntity>>>()
        tv.value = dummyTvShow

        Mockito.`when`(filmRepository.getAllTvShows()).thenReturn(tv)
        val tvEntities = viewModel.getTvShows().value?.data
        verify(filmRepository).getAllTvShows()
        assertNotNull(tvEntities)
        assertEquals(17, tvEntities?.size)

        viewModel.getTvShows().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }

    @Test
    fun getFavTvShows() {
        val dummyFavTvShows = pagedList
        Mockito.`when`(dummyFavTvShows.size).thenReturn(17)
        val tv = MutableLiveData<PagedList<TvEntity>>()
        tv.value = dummyFavTvShows

        Mockito.`when`(filmRepository.getFavoritedTvShows()).thenReturn(tv)
        val tvEntities = viewModel.getFavTvShows().value
        Mockito.verify(filmRepository).getFavoritedTvShows()
        assertNotNull(tvEntities)
        assertEquals(17, tvEntities?.size)
        viewModel.getFavTvShows().observeForever(favObserver)
        Mockito.verify(favObserver).onChanged(dummyFavTvShows)
    }
}