package com.example.whatsapp.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



abstract class BaseAdapter<T>(
    private val layoutResId: Int,
    private val items: List<T>
) : RecyclerView.Adapter<BaseAdapter<T>.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        bindData(holder.itemView, item)
    }

    override fun getItemCount(): Int = items.size

    abstract fun bindData(view: View, item: T)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
