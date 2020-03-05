package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return FragCalls.newInstance();
            case 1:
                return FragChats.newInstance();
            case 2:
                return FragContacts.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    public CharSequence gerPageTitle(int position){
        switch(position){
            case 0:
                return "CALLS";
            case 1:
                return "CHATS";
            case 2:
                return "CONTACTS";
            default:
                return null;
        }
    }
}
