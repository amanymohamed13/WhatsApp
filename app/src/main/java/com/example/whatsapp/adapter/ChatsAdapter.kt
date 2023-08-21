package com.example.whatsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.whatsapp.R
import com.example.whatsapp.repositries.Chats

class ChatsAdapter(private val itemList: List<Chats>) : BaseAdapter<Chats>(R.layout.chat_card, itemList) {

    override fun bindData(view: View, item: Chats) {
        val coverImage: ImageView = view.findViewById(R.id.profile_image)
        val name: TextView = view.findViewById(R.id.name)
        val massage: TextView = view.findViewById(R.id.massage)
        val date: TextView = view.findViewById(R.id.phone_number)

        coverImage.setImageResource(item.imageCover)
        name.text = item.name
        massage.text = item.message
        date.text = item.date
    }
}
