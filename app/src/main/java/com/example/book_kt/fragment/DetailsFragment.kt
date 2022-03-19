package com.example.book_kt.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.book_kt.R
import com.example.book_kt.base.Base
import com.example.book_kt.client.ClientBooks
import com.example.book_kt.databinding.FragmentDetailsBinding
import com.example.book_kt.model.NameModel
import kotlinx.coroutines.launch

class DetailsFragment: Base<FragmentDetailsBinding>(
R.layout.fragment_details
) {
    override val binding: FragmentDetailsBinding by viewBinding(FragmentDetailsBinding::bind)
    private val sharedViewModel: BooksViewModel by activityViewModels()

    override fun setupViews() {
        viewLifecycleOwner.lifecycleScope.launch {
            sharedViewModel.description.observe(viewLifecycleOwner) { description ->
                binding.tvDescription.text = description.toString()

            }


        }
    }


}