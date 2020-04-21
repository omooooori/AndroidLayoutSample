package com.omori.custom_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Model>()
        items.add(Model("Kotlin", "JetBrains, 2011", R.drawable.kotlin_logo))
        items.add(Model("C++", "ISO/ITEX JTC1, SC22, WG21, 1985", R.drawable.cpp_logo))
        items.add(Model("Python", "Guido van Rossum, 1990", R.drawable.python_logo))
        items.add(Model("Javascript", "Brendan Eich, 1995", R.drawable.javascript_logo))

        val adapter = MyCustomAdapter(this, R.layout.custom_item_layout, items)
        my_lv.adapter = adapter

        my_lv.setOnItemClickListener { adapter, view, i, l ->
            Toast.makeText(this, "you have clicked ${items[i]}", Toast.LENGTH_SHORT).show()
        }
    }

}
