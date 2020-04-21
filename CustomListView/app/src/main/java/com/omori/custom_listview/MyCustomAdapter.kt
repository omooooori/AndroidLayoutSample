package com.omori.custom_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter (var ctx: Context, var resource: Int, var items: ArrayList<Model>)
    : ArrayAdapter<Model>(ctx, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(resource, null)

        val logoName = view.findViewById<TextView>(R.id.logo_name)
        val description = view.findViewById<TextView>(R.id.logo_description)
        val img = view.findViewById<ImageView>(R.id.logo_image)

        logoName.text = items[position].logoName
        description.text = items[position].description
        img.setImageDrawable(ctx.resources.getDrawable(items[position].img))

        return view

    }

    override fun getItem(position: Int): Model? {
        return super.getItem(position)
    }

}