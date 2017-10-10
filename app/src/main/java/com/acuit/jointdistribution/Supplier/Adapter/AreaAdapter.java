package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Domain.AeraBean;

import java.util.ArrayList;




public class AreaAdapter extends BaseAdapter {


    private final ArrayList<AeraBean.DataBean> areaList;
    private final ReceivedActivity mActivity;

    public AreaAdapter(ArrayList<AeraBean.DataBean> areaList, ReceivedActivity mActivity) {
        this.areaList = areaList;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return areaList.size();
    }

    @Override
    public Object getItem(int position) {
        return areaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(BaseApplication.getContext(), R.layout.receive_rught_area_item, null);
            holder.name = (TextView) convertView.findViewById(R.id.tv_area_name);


//            System.out.println("yyy:"+holder.name);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
//        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);
//        receiveRightMenuItem = (OnlySchoolBean.DataBean)getItem(position);

        AeraBean.DataBean areaItem = (AeraBean.DataBean) getItem(position);

//        holder.name.setText(areaItem.getLk_brief());

        holder.name.setText(areaItem.getLk_brief());

        return convertView;
    }
    static class ViewHolder {


        public TextView name;


    }
    }

