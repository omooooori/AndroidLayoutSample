package com.omori.recycler_view_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var newsItems: ArrayList<NewsItem> = ArrayList()

        for (i in 1..15) {
            newsItems.add(NewsItem("News Item $i", resources.getString(R.string.dummy_news_text)))
        }

        news_recycler_view.adapter = NewsItemAdapter(newsItems)
    }
}
