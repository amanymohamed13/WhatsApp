package com.example.whatsapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.whatsapp.R
import com.example.whatsapp.repositries.Stories

class ContactsAdapter(private val itemList: ArrayList<Stories>) :
    BaseAdapter<Stories>(R.layout.story_card, itemList) {

    override fun bindData(view: View, item: Stories) {
        val coverImage: ImageView = view.findViewById(R.id.profile_image)
        val name: TextView = view.findViewById(R.id.name)
        val phoneNumber: TextView = view.findViewById(R.id.phone_number)

        coverImage.setImageResource(item.imageCover)
        name.text = item.name
        phoneNumber.text = item.phone_number
    }
}