package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;

import java.util.ArrayList;

/**
 * 类名: ChooseAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/14 0014 15:05 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ChooseAdapter extends BaseAdapter {

    private final ReceivedActivity mActivity;
    private final ArrayList<OnlySchoolBean.DataBean> chooseList;

    public ChooseAdapter(ArrayList<OnlySchoolBean.DataBean> chooseList, ReceivedActivity mActivity) {

        this.mActivity = mActivity;
        this.chooseList = chooseList;
    }

    @Override
    public int getCount() {
        return chooseList.size();
    }


    @Override
    public Object getItem(int position) {
        return chooseList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


//        View.inflate(BaseApplication.getContext(), R.id.)
        return null;
    }

}
