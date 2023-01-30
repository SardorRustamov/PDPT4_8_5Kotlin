package com.example.pdpt4_8_5kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pdpt4_8_5kotlin.databinding.ItemUserBinding
import com.example.pdpt4_8_5kotlin.model.UserList

 class UserAdapter(val userList: List<UserList>): RecyclerView.Adapter<UserAdapter.VH> (){

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
         return VH(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
     }

     override fun onBindViewHolder(holder: VH, position: Int) {
         holder.binding.userName.setText(userList.get(position).userName)
         holder.binding.userImg.setImageResource(userList.get(position).image)
     }

     override fun getItemCount(): Int {
         return userList.size
     }

      class VH(binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
         var binding: ItemUserBinding
         init {
             this.binding = binding
         }
     }
 }