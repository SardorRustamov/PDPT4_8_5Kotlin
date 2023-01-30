package com.example.pdpt4_8_5kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pdpt4_8_5kotlin.adapter.ViewPagerAdapter
import com.example.pdpt4_8_5kotlin.databinding.ActivityMainBinding
import com.example.pdpt4_8_5kotlin.fragment.ContactFragment
import com.example.pdpt4_8_5kotlin.fragment.PostFragment
import com.example.pdpt4_8_5kotlin.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.add("Contact", ContactFragment())
        viewPagerAdapter.add("User", UserFragment())
        viewPagerAdapter.add("Post", PostFragment())

        binding.viewPager.adapter = viewPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }
}