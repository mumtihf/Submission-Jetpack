package com.mumti.jetpacksubmission.ui.movie.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mumti.jetpacksubmission.R
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.databinding.FragmentFavMovieBinding
import com.mumti.jetpacksubmission.databinding.FragmentMovieBinding
import com.mumti.jetpacksubmission.ui.movie.MovieAdapter
import com.mumti.jetpacksubmission.ui.movie.MovieViewModel
import com.mumti.jetpacksubmission.viewmodel.ViewModelFactory
import com.mumti.jetpacksubmission.vo.Status

class FavMovieFragment : Fragment(), MovieAdapter.MovieFragmentCallback {

    private lateinit var favFragmentMovieBinding: FragmentFavMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        favFragmentMovieBinding = FragmentFavMovieBinding.inflate(layoutInflater, container, false)
        return favFragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            val moviesAdapter = MovieAdapter(this)
            viewModel.getFavMovies().observe(viewLifecycleOwner, { movies ->
                favFragmentMovieBinding.progressBar.visibility = View.VISIBLE
                if (movies != null) {
                    favFragmentMovieBinding.progressBar.visibility = View.GONE
                    moviesAdapter.submitList(movies)
                }
            })

            with(favFragmentMovieBinding.rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
            }
        }
    }

    override fun onShareClick(movies: MovieEntity) {
        if (activity != null) {
            val mimeType = "plain/text"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan Movies sekarang.")
                .setText(resources.getString(R.string.share_text, movies.title))
                .startChooser()
        }
    }
}