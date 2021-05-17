package com.mumti.jetpacksubmission.ui.tv.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mumti.jetpacksubmission.R
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.databinding.FragmentFavMovieBinding
import com.mumti.jetpacksubmission.databinding.FragmentFavTvBinding
import com.mumti.jetpacksubmission.ui.movie.MovieAdapter
import com.mumti.jetpacksubmission.ui.movie.MovieViewModel
import com.mumti.jetpacksubmission.ui.tv.TvAdapter
import com.mumti.jetpacksubmission.ui.tv.TvViewModel
import com.mumti.jetpacksubmission.viewmodel.ViewModelFactory

class FavTvFragment : Fragment(), TvAdapter.TvFragmentCallback {

    private lateinit var favFragmentTvBinding: FragmentFavTvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        favFragmentTvBinding = FragmentFavTvBinding.inflate(layoutInflater, container, false)
        return favFragmentTvBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvViewModel::class.java]

            val tvAdapter = TvAdapter(this)
            viewModel.getFavTvShows().observe(viewLifecycleOwner, { tv ->
                favFragmentTvBinding.progressBar.visibility = View.VISIBLE
                if (tv != null) {
                    favFragmentTvBinding.progressBar.visibility = View.GONE
                    tvAdapter.submitList(tv)
                }
            })

            with(favFragmentTvBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvAdapter
            }
        }
    }

    override fun onShareClick(tv: TvEntity) {
        if (activity != null) {
            val mimeType = "plain/text"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan Tv Show sekarang.")
                .setText(resources.getString(R.string.share_text, tv.title))
                .startChooser()
        }
    }
}