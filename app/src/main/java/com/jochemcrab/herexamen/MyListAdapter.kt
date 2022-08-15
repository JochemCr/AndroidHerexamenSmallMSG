package com.jochemcrab.herexamen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyListAdapter(private val context: Context, private val myList: ArrayList<String>): RecyclerView.Adapter<MyListAdapter. ViewHolder>() {
    override fun onCreateViewHolder (viewGroup: ViewGroup, position: Int): ViewHolder {
        val myListItem = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, attachToRoot: false)
        return ViewHolder (myListItem)
    }
}
override fun getItemCount(): Int {
    return myList.count()
}
override fun onBindViewHolder (viewHolder: ViewHolder, position: Int) {
    viewHolder.bind(myList [position])
}
inner class ViewHolder (itemView: View): RecyclerView.ViewHolder (itemView) {
    fun bind (myItem: String) {
        itemView.tv_title.text = myItem
        itemView.setOnClickListener {
            Toast.makeText(context, myItem, Toast.LENGTH_LONG).show()
        }
    }
}
}