package com.example.whatsapp.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.repositries.ParentModelClass

class ParentAdapter(private val parents : List<ParentModelClass>)
    : RecyclerView.Adapter<ParentAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout
            ,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val parentRecycler = parents[position]
        holder.textView.text = parentRecycler.title
        holder.recyclerView.apply {
            layoutManager = LinearLayoutManager(holder.recyclerView.context,
                RecyclerView.HORIZONTAL, false)
            adapter = ChildAdapter(parentRecycler.childModelClassList)
        }
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val recyclerView : RecyclerView = itemView.findViewById(R.id.recyclerview_child)
        val textView:TextView = itemView.findViewById(R.id.title)
    }
}