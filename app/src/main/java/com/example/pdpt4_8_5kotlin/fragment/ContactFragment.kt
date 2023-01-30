package com.example.pdpt4_8_5kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pdpt4_8_5kotlin.adapter.ContactAdapter
import com.example.pdpt4_8_5kotlin.databinding.FragmentContactBinding
import com.example.pdpt4_8_5kotlin.model.ContactList

class ContactFragment : Fragment() {

    private var _binding:FragmentContactBinding?=null
    private val binding get() = _binding!!
    lateinit var contactList: List<ContactList>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactBinding.inflate(inflater, container, false)
       val view = binding.root
       loadContactList()

        val contactAdapter = ContactAdapter(contactList)
        binding.rvContact.adapter = contactAdapter


        return view
    }

    private fun loadContactList() {
        contactList=ArrayList()
        for (i in 0..39) {
            (contactList as ArrayList<ContactList>).add(ContactList("Sarvar", "+998 90 400 00 04"))
            (contactList as ArrayList<ContactList>).add(ContactList("Jasur", "+998 91 200 40 40"))
            (contactList as ArrayList<ContactList>).add(ContactList("Anvar", "+998 99 599 09 99"))
            (contactList as ArrayList<ContactList>).add(ContactList("Bekzod", "+998 97 777 00 00"))
        }
    }


}