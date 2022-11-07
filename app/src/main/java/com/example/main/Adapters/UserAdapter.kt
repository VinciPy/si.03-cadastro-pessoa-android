package com.example.main.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.main.Entities.User
import com.example.main.R

class UserAdapter(private val context: Context, private val dataSource: List<User>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_recipe, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount() = dataSource.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindView(dataSource[position])
    }

    class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textViewNome = itemView.findViewById<TextView>(R.id.textViewNome);
        val textViewDescription = itemView.findViewById<TextView>(R.id.textViewDescrição);
        val textViewBirthDay = itemView.findViewById<TextView>(R.id.textViewDatadenacimento);
        fun bindView(user: User) {
            textViewNome.text = user.name
            textViewDescription.text = user.description;
            textViewDescription.text = user.birthday;
        }
    }
}