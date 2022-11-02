package com.example.main.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.main.Entities.User
import com.example.main.R

class UserAdapter(private val context: Context, private val dataSource: List<User>): BaseAdapter() {
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.count();
    }

    override fun getItem(position: Int): Any {
        return dataSource[position];
    }

    override fun getItemId(id: Int): Long {
        return id.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var listView = inflater.inflate(R.layout.list_item_recipe, parent, false);
        val user = getItem(position) as User;
        val titleTextView = listView.findViewById(R.id.textViewNome) as TextView
        titleTextView.text = user.name;
        return listView;
    }
}