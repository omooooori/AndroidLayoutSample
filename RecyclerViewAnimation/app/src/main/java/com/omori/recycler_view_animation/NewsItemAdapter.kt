package com.omori.recycler_view_animation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsItemAdapter(private val newsItems: ArrayList<NewsItem>) : RecyclerView.Adapter<NewsItemAdapter.NewsItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.news_item_container,
            parent,
            false
        )

        return NewsItemViewHolder(view)

    }

    override fun getItemCount(): Int {
        return newsItems.size
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        holder.textTitle.text = newsItems[position].title
        holder.textDescription.text = newsItems[position].description
    }

    class NewsItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textTitle: TextView = view.findViewById(R.id.textTitle)
        val textDescription: TextView = view.findViewById(R.id.textDescription)
    }

}