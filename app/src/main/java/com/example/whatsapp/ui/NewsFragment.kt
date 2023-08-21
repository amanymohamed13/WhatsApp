package com.example.whatsapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.adapter.ParentAdapter
import com.example.whatsapp.databinding.NewsFragmentBinding
import com.example.whatsapp.repositries.parent_List

class NewsFragment() : BaseFragment<NewsFragmentBinding>() {
    override val LOG: String = "HomeFragment"
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> NewsFragmentBinding =
        NewsFragmentBinding::inflate

    override fun addCallbacks() {
    }

    override fun setup() {
        binding.parentRecyclerView.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.parentRecyclerView.adapter = ParentAdapter(parent_List)
    }
}
