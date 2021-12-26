package com.plusl.xybookkeepdemo.account_frag;

/**
 * @Author LJH
 * @create 2021/12/2 16:20
 */


import com.plusl.xybookkeepdemo.DataBase.DBManager;
import com.plusl.xybookkeepdemo.DataBase.TypeBean;
import com.plusl.xybookkeepdemo.R;

import java.util.List;


public class OutcomeFragment extends BaseRecordFragment {

    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        List<TypeBean> outlist = DBManager.getTypeList(0);
        typeList.addAll(outlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.qita_light);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(0);
        DBManager.insertItemToAccounttb(accountBean);
    }

}