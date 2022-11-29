package com.taskmanagment.app;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.taskmanagment.app.Fragments.ActivitesFragment;
import com.taskmanagment.app.Fragments.GoalsFragment;
import com.taskmanagment.app.Fragments.JournalFragment;
import com.taskmanagment.app.Fragments.MoreFragment;
import com.taskmanagment.app.Fragments.TodayFragment;


public class HomePagerViewAdapter extends FragmentPagerAdapter {


    int mNumOfTabs;
    Context context;

    public HomePagerViewAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment= null;

        switch (i)
        {
            case 0:
                fragment = new TodayFragment();
                break;

            case 1:
                fragment =new GoalsFragment();
//               fragment =new Fragment_Catagory();
                break;

            case 2:

                fragment = new ActivitesFragment();
                break;

            case 3:

                fragment = new JournalFragment();
                break;

                case 4:

                fragment = new MoreFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }



}
