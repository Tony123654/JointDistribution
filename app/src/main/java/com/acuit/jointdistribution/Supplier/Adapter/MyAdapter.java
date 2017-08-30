package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderBean;

import java.util.ArrayList;

/**
 * 类名: MyAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/21 0021 16>:33 <p
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class MyAdapter extends BaseAdapter {

    private ArrayList<BuyOrderBean.DataBean.RowsBean> mList;

    public MyAdapter(ArrayList<BuyOrderBean.DataBean.RowsBean> mList) {
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView == null) {
            convertView = View.inflate(BaseApplication.getContext(), R.layout.listitem, null);
            holder = new ViewHolder();
            holder.create_date = (TextView) convertView.findViewById(R.id.tv_create_date);
            holder.total_amount = (TextView) convertView.findViewById(R.id.tv_total_amount);
            holder.total_money = (TextView) convertView.findViewById(R.id.tv_total_money);
            holder.plan_date = (TextView) convertView.findViewById(R.id.tv_plan_date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }



        BuyOrderBean.DataBean.RowsBean item = (BuyOrderBean.DataBean.RowsBean) getItem(position);
//        System.out.println("item:"+item);

        holder.create_date.setText(item.getCreate_date());
        holder.total_money.setText(item.getTotal_money());
        holder.total_amount.setText(item.getTotal_amount());
        holder.plan_date.setText(item.getPlan_date());


        return convertView;

    }

    static class ViewHolder {
        public TextView total_amount;
        public TextView total_money;
        public TextView plan_date;
        public TextView create_date;
    }
}