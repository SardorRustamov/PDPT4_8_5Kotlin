package com.example.pdpt4_8_5kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pdpt4_8_5kotlin.R
import com.example.pdpt4_8_5kotlin.adapter.UserAdapter
import com.example.pdpt4_8_5kotlin.databinding.FragmentUserBinding
import com.example.pdpt4_8_5kotlin.model.UserList

class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    private val binding get() = _binding!!
    lateinit var userList: List<UserList>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        val view = binding.root

        loadListUser()

        val userAdapter = UserAdapter(userList)

        binding.rvUser.adapter = userAdapter

        return view
    }

    private fun loadListUser() {
        userList = ArrayList()

        for (i in 0..49) {
            (userList as ArrayList<UserList>).add(UserList("Alisher", R.drawable.ic_baseline_hide_image_24))
            (userList as ArrayList<UserList>).add(UserList("Sarvar", R.drawable.ic_baseline_hide_image_24))
            (userList as ArrayList<UserList>).add(UserList("Ravshan", R.drawable.ic_baseline_hide_image_24))
            (userList as ArrayList<UserList>).add(UserList("Sanjar", R.drawable.ic_baseline_hide_image_24))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}