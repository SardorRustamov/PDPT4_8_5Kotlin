package com.example.pdpt4_8_5kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pdpt4_8_5kotlin.databinding.ItemContactBinding
import com.example.pdpt4_8_5kotlin.model.ContactList

class ContactAdapter(val contactList: List<ContactList>) : RecyclerView.Adapter<ContactAdapter.VH>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.nameContact.setText(contactList.get(position).name)
        holder.binding.contPhone.setText(contactList.get(position).phone)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class VH(binding: ItemContactBinding) :RecyclerView.ViewHolder(binding.root){
        var binding:ItemContactBinding
        init {
            this.binding=binding
        }
    }

}