package com.plusl.xybookkeepdemo.account_frag;

/**
 * @Author LJH
 * @create 2021/12/2 16:22
 */

import com.plusl.xybookkeepdemo.DataBase.DBManager;
import com.plusl.xybookkeepdemo.DataBase.TypeBean;
import com.plusl.xybookkeepdemo.R;

import java.util.List;

/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {

    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.shouru_lan_qita);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
