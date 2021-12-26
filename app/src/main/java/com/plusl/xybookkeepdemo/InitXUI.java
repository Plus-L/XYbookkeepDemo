package com.plusl.xybookkeepdemo;

import android.app.Application;

import com.xuexiang.xui.XUI;

/**
 * @Author LJH
 * @create 2021/12/2 10:48
 */
public class InitXUI extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        XUI.init(this);
        XUI.debug(true);
    }
}
