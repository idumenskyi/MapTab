package com.example.mytablayoutapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mytablayoutapplication.fragments.HomeFragment;
import com.example.mytablayoutapplication.fragments.NotificationFragment;
import com.example.mytablayoutapplication.fragments.SettingsFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter{
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int postion){
        switch (postion){
            case 0:
                return new HomeFragment();
            case 1:
                return new NotificationFragment();
            case 2:
                return new SettingsFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount(){
        return 3;
    }

}
