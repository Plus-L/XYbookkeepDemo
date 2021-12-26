package com.plusl.xybookkeepdemo;

import android.app.Application;

import com.plusl.xybookkeepdemo.DataBase.DBManager;
import com.xuexiang.xui.XUI;

/**
 * @Author LJH
 * @create 2021/12/2 17:01
 */
/* 表示全局应用的类*/
public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化数据库
        DBManager.initDB(getApplicationContext());

        XUI.init(this);
        XUI.debug(true);
    }
}
