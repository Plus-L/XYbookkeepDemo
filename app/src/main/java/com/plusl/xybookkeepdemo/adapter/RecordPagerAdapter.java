package com.plusl.xybookkeepdemo.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Author LJH
 * @create 2021/12/2 15:43
 */

/*
*  记账页页面信息适配器 ，有收入和支出两页
* */
public class RecordPagerAdapter extends FragmentPagerAdapter {

    List<Fragment>fragmentList;
    String[] titles = {"支出", "收入"};

    public RecordPagerAdapter(@NonNull FragmentManager fm, List<Fragment>fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
