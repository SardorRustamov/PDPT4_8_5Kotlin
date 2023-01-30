package com.example.pdpt4_8_5kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pdpt4_8_5kotlin.adapter.PostAdapter
import com.example.pdpt4_8_5kotlin.databinding.FragmentPostBinding
import com.example.pdpt4_8_5kotlin.model.PostList

class PostFragment : Fragment() {

    private var _binding: FragmentPostBinding? = null
    private val binding get() = _binding!!
    lateinit var postList: List<PostList>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPostBinding.inflate(inflater, container, false)
        val view = binding.root
        loadListPost()

        val postAdapter = PostAdapter(postList)
        binding.rvPost.adapter = postAdapter

        return view
    }

    private fun loadListPost() {
        postList = ArrayList()
        for (i in 0..19) {
            (postList as ArrayList<PostList>).add(PostList("Bu yerda text bo'lishi kerak edi"))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}