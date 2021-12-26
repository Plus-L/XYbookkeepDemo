package com.plusl.xybookkeepdemo.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.plusl.xybookkeepdemo.R;

/**
 * @Author LJH
 * @create 2021/12/2 16:44
 */
public class DBOpenHelper extends SQLiteOpenHelper {

    public DBOpenHelper(@Nullable Context context) {
        super(context,"xybookkeep.db" , null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //创建type表
        String sql = "create table typetb(" +
                    "id integer primary key autoincrement," +
                    "typename varchar(10)," +
                    "imageId integer," +
                    "sImageId integer," +
                    "kind integer)";
        db.execSQL(sql);
        insertType(db);
        //创建记账表
        sql = "create table accounttb(" +
                    "id integer primary key autoincrement," +
                    "typename varchar(10)," +
                    "sImageId integer," +
                    "beizhu varchar(80)," +
                    "money float," +
                    "time varchar(60)," +
                    "year integer," +
                    "month integer," +
                    "day integer," +
                    "kind integer)";
        db.execSQL(sql);
    }

    private void insertType(SQLiteDatabase db) {
        /*
        *  支出type类型 , 最后一位 0 代表支出
        * */
        String sql = "insert into typetb (typename,imageId,sImageId,kind) values (?,?,?,?)";
        db.execSQL(sql,new Object[]{"其他", R.mipmap.qita,R.mipmap.qita_light,0});
        db.execSQL(sql,new Object[]{"餐饮", R.mipmap.canyin,R.mipmap.canyin_light,0});
        db.execSQL(sql,new Object[]{"交通", R.mipmap.jiaotong,R.mipmap.jiaotong_light,0});
        db.execSQL(sql,new Object[]{"购物", R.mipmap.shouye,R.mipmap.shouye_light,0});
        db.execSQL(sql,new Object[]{"服饰", R.mipmap.chongwufushi,R.mipmap.chongwufushi_light,0});
        db.execSQL(sql,new Object[]{"日用品", R.mipmap.riyongpin,R.mipmap.riyongpin_light,0});
        db.execSQL(sql,new Object[]{"娱乐", R.mipmap.yule,R.mipmap.yule_light,0});
        db.execSQL(sql,new Object[]{"零食", R.mipmap.lingshi,R.mipmap.lingshi_light,0});
        db.execSQL(sql,new Object[]{"烟酒茶", R.mipmap.yanjiu,R.mipmap.yanjiu_light,0});
        db.execSQL(sql,new Object[]{"学习", R.mipmap.xuexi,R.mipmap.xuexi_light,0});
        db.execSQL(sql,new Object[]{"医疗", R.mipmap.yiliao,R.mipmap.yiliao_light,0});
        db.execSQL(sql,new Object[]{"住宅", R.mipmap.zhuzhai,R.mipmap.zhuzhai_light,0});
        db.execSQL(sql,new Object[]{"水电煤", R.mipmap.suidian,R.mipmap.shuidian_light,0});
        db.execSQL(sql,new Object[]{"通讯", R.mipmap.tonxun,R.mipmap.tonxun_light,0});
        db.execSQL(sql,new Object[]{"人情往来", R.mipmap.renqingwanglai,R.mipmap.renqingwanglai_light,0});


        /*
        *  收入type类型 ， 最后一位 1 代表支出
        * */
        db.execSQL(sql,new Object[]{"其他", R.mipmap.shouru_hui_qita,R.mipmap.shouru_lan_qita,1});
        db.execSQL(sql,new Object[]{"薪资", R.mipmap.xinzi,R.mipmap.xinzi_light,1});
        db.execSQL(sql,new Object[]{"奖金", R.mipmap.ziyuan,R.mipmap.ziyuan_light,1});
        db.execSQL(sql,new Object[]{"借入", R.mipmap.borrow,R.mipmap.borrow_light,1});
        db.execSQL(sql,new Object[]{"收债", R.mipmap.shouzhai,R.mipmap.shouzhai_light,1});
        db.execSQL(sql,new Object[]{"利息收入", R.mipmap.lixi,R.mipmap.lixi_light,1});
        db.execSQL(sql,new Object[]{"投资回报", R.mipmap.touzi,R.mipmap.touzi_light,1});
        db.execSQL(sql,new Object[]{"二手交易", R.mipmap.ershoushebei,R.mipmap.ershoushebei_light,1});
        db.execSQL(sql,new Object[]{"意外所得", R.mipmap.yiwaisuode,R.mipmap.yiwaisuode_light,1});
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
