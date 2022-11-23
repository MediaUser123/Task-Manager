package com.taskmanagment.app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.tabs.TabLayout
import com.taskmanagment.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var tab_label: TextView
    lateinit var tab_icon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.setOffscreenPageLimit(4)
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(R.layout.custom_tab).setIcon(R.drawable.today_ic))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(R.layout.custom_tab).setIcon(R.drawable.goals_ic))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(R.layout.custom_tab).setIcon(R.drawable.activites_ic))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(R.layout.custom_tab).setIcon(R.drawable.file_ic))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setCustomView(R.layout.custom_tab).setIcon(R.drawable.more_ic))
        for (i in 0..3) {
            val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(i)!! // fourth tab
            val tabView: View = tabb.getCustomView()!!
            tab_icon = tabView.findViewById(R.id.tabicon)
            tab_label = tabView.findViewById(R.id.tablabel)

            if (i == 0) {
                tab_icon.setImageResource(R.drawable.today_ic)
                tab_label.setText("Today")
                tab_label.setTextColor(Color.parseColor("#000000"))
            }
            if (i == 1) {
                tab_icon.setImageResource(R.drawable.goals_ic)
                tab_label.setText("Goals")
                tab_label.setTextColor(Color.parseColor("#000000"))
            }
            if (i == 2) {
                tab_icon.setImageResource(R.drawable.activites_ic)
                tab_label.setText("Activites")
                tab_label.setTextColor(Color.parseColor("#000000"))

            }
            if (i == 3) {
                tab_icon.setImageResource(R.drawable.file_ic)
                tab_label.setText("Journal")
                tab_label.setTextColor(Color.parseColor("#000000"))

            }
            if (i == 4) {
                tab_icon.setImageResource(R.drawable.more_ic)
                tab_label.setText("More")
                tab_label.setTextColor(Color.parseColor("#000000"))
            }
        }

        var homePagerViewAdapter = HomePagerViewAdapter(supportFragmentManager, binding.tabLayout.getTabCount())
        binding.pager.setAdapter(homePagerViewAdapter)
        binding.tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.pager.setCurrentItem(tab.position)
                val pos = tab.position
                if (pos == 0) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(pos)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.today_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))
                }
                if (pos == 1) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(pos)!!
                    val tabView = tabb.customView
                    tab_label = tabView!!.findViewById(R.id.tablabel)
                    tab_icon = tabView.findViewById(R.id.tabicon)
                    tab_icon.setImageResource(R.drawable.goals_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))
                }
                if (pos == 2) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(pos)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_icon.setImageResource(R.drawable.activites_ic)

                }

                if (pos == 3) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(pos)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.file_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))

//                    tab_label.setTextColor(Color.parseColor("#00A859"));
                }
                if (pos == 4) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(pos)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.more_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                val pos = tab.position
                if (tab.position === 0) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(tab.position)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_icon.setImageResource(R.drawable.today_ic)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_label.setTextColor(Color.parseColor("#000000"))
                }
                if (tab.position === 1) {
//                    tab.setIcon(R.drawable.search_gray);
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(tab.position)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.goals_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))
                }
                if (tab.position === 2) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(tab.position)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.activites_ic)

                }
                if (tab.position === 3) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(tab.position)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_icon.setImageResource(R.drawable.file_ic)
                    tab_label.setTextColor(Color.parseColor("#000000"))

                }
                if (tab.position === 4) {
                    val tabb: TabLayout.Tab = binding.tabLayout.getTabAt(tab.position)!!
                    val tabView = tabb.customView
                    tab_icon = tabView!!.findViewById(R.id.tabicon)
                    tab_icon.setImageResource(R.drawable.more_ic)
                    tab_label = tabView.findViewById(R.id.tablabel)
                    tab_label.setTextColor(Color.parseColor("#000000"))

                }

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })


    }

}