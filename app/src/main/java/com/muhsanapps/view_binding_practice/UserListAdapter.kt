package com.muhsanapps.view_binding_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muhsanapps.view_binding_practice.databinding.UserItemsBinding

class UserListAdapter(private val userList: List<User>) :
    RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = UserItemsBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val view = layoutInflater.inflate(R.layout.user_items, parent, false)
//        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.itemBinding.tvUserItem1.text = user.username
        holder.itemBinding.tvUserItem2.text = user.age.toString()
//        holder.tvUsername.text = user.username
//        holder.tvAge.text = user.age.toString()
    }

    override fun getItemCount(): Int = userList.size

    class ViewHolder(val itemBinding: UserItemsBinding): RecyclerView.ViewHolder(itemBinding.root)

}