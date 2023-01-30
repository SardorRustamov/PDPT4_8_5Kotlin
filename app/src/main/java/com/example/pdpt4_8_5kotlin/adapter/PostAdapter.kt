package com.example.pdpt4_8_5kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pdpt4_8_5kotlin.databinding.ItemPostBinding
import com.example.pdpt4_8_5kotlin.model.PostList

class PostAdapter(val postList: List<PostList>) :RecyclerView.Adapter<PostAdapter.VH>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.postText.setText(postList.get(position).text)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    class VH(binding: ItemPostBinding):RecyclerView.ViewHolder(binding.root){
        var binding: ItemPostBinding
        init {
            this.binding=binding
        }
    }
}