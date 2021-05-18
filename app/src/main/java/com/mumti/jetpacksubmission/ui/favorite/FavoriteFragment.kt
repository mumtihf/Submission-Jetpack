package com.mumti.jetpacksubmission.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mumti.jetpacksubmission.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {

    private lateinit var favoriteBinding: FragmentFavoriteBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        favoriteBinding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return favoriteBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sectionPagerAdapter =
            context?.let { FavoriteSectionPagerAdapter(it, childFragmentManager) }
        favoriteBinding.viewPager.adapter = sectionPagerAdapter
        favoriteBinding.tabs.setupWithViewPager(favoriteBinding.viewPager)
    }
}