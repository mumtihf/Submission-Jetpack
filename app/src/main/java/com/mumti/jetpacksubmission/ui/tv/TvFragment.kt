package com.mumti.jetpacksubmission.ui.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mumti.jetpacksubmission.R
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.databinding.FragmentTvBinding
import com.mumti.jetpacksubmission.viewmodel.ViewModelFactory
import com.mumti.jetpacksubmission.vo.Status

class TvFragment : Fragment(), TvAdapter.TvFragmentCallback {

    lateinit var fragmentTvBinding: FragmentTvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTvBinding = FragmentTvBinding.inflate(layoutInflater, container, false)
        return fragmentTvBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvViewModel::class.java]

            val adapter = TvAdapter(this)
            viewModel.getTvShows().observe(viewLifecycleOwner, { tv ->
                if (tv != null) {
                    when (tv.status) {
                        Status.LOADING -> fragmentTvBinding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            fragmentTvBinding.progressBar.visibility = View.GONE
                            adapter.submitList(tv.data)
                        }
                        Status.ERROR -> {
                            fragmentTvBinding.progressBar.visibility = View.GONE
                            Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(fragmentTvBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    override fun onShareClick(tv: TvEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan Tv Show sekarang.")
                .setText(resources.getString(R.string.share_text, tv.title))
                .startChooser()
        }
    }
}