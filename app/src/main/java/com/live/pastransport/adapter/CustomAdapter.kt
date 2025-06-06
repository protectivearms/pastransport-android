package com.live.pastransport.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.ArrayList

class CustomAdapter (
    val items: ArrayList<Fragment>, activity: AppCompatActivity): FragmentStateAdapter(activity) {

    class ViewHolder {

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun createFragment(position: Int): Fragment {
        return items[position]
    }

}
