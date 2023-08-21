package com.example.whatsapp.adapter
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.whatsapp.R
import com.example.whatsapp.repositries.GeneralModel

class ChildAdapter(private val childrenList: List<GeneralModel>)
    : BaseAdapter<GeneralModel>(R.layout.nested_card, childrenList) {

    override fun bindData(view: View, item: GeneralModel) {
        val imageView: ImageView = view.findViewById(R.id.image)
        val textView: TextView = view.findViewById(R.id.name)

        textView.text = item.name
        Glide.with(view)
            .load(item.imageUrl)
            .into(imageView)
    }
}
