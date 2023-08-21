package com.example.whatsapp.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.adapter.ChatsAdapter
import com.example.whatsapp.databinding.FragmentChatBinding
import com.example.whatsapp.repositries.chats_container

class ChatFragment : BaseFragment<FragmentChatBinding>() {

    override val LOG: String = "ChatFragment"

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentChatBinding =
        FragmentChatBinding::inflate

    private lateinit var adapter: ChatsAdapter

    override fun addCallbacks() {
    }

    override fun setup() {
       binding.recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = ChatsAdapter(chats_container)
        binding.recyclerView.adapter = adapter
    }
}
