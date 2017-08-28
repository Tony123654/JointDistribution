package com.acuit.jointdistribution.Supplier.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.OrderList;

import java.util.ArrayList;
import java.util.List;

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
    private List<OrderList> dataList;
    private Activity mActivity;
    private ArrayList<OrderList> mList;
    private ListView lv_List;

    public MyAdapter(Activity mActivity, List<OrderList> dataList, ListView lv_list) {
        this.dataList = dataList;
        this.mActivity = mActivity;
        this.lv_List=lv_list;
    }

    public MyAdapter(ArrayList<OrderList> mList) {
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
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(BaseApplication.getContext(), R.layout.listitem, null);
            holder = new ViewHolder();
            holder.create_date = (TextView) convertView.findViewById(R.id.tv_create_date);
            holder.total_amount = (TextView) convertView.findViewById(R.id.tv_total_amount);
            holder.total_money = (TextView) convertView.findViewById(R.id.tv_total_money);
            holder.plan_date = (TextView) convertView.findViewById(R.id.tv_pian_data);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }




        OrderList item = (OrderList) getItem(position);
        holder.create_date.setText(item.getData().getRows().get(0).getCreate_date());
        holder.total_money.setText(item.getData().getTotal_money());
        holder.total_amount.setText(item.getData().getTotal_amount());
        holder.plan_date.setText(item.getData().getRows().get(0).getPlan_date());


        return convertView;

    }

    static class ViewHolder {
        private TextView total_amount;
        private TextView total_money;
        private TextView plan_date;
        private TextView create_date;
    }
}