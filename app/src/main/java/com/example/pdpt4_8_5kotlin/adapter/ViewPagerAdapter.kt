package com.example.pdpt4_8_5kotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter (fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager){

    private  var fragments: List<Fragment> = ArrayList()
    private var fragmentTitle: List<String> = ArrayList()

    override fun getCount(): Int {
    return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle.get(position)
    }
    fun add (titleName:String, fragment: Fragment ){
        (fragments as ArrayList<Fragment>).add(fragment)
        (fragmentTitle as ArrayList<String>).add(titleName)
    }

}