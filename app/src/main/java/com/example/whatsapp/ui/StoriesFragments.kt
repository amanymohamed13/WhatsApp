package com.example.whatsapp.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.adapter.ContactsAdapter
import com.example.whatsapp.databinding.FragmentStoriesFragmentsBinding
import com.example.whatsapp.repositries.Stories_container

class StoriesFragments : BaseFragment<FragmentStoriesFragmentsBinding>() {

    override val LOG: String = "StoriesFragments"

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentStoriesFragmentsBinding =
        FragmentStoriesFragmentsBinding::inflate

    private lateinit var adapter: ContactsAdapter

    override fun addCallbacks() {
    }

    override fun setup() {
       binding.recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = ContactsAdapter(Stories_container)
        binding.recyclerView.adapter = adapter
    }
}
