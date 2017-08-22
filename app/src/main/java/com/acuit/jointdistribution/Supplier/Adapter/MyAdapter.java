package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.OrderList_Purchase;

import java.util.List;

/**
 * 类名: MyAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/21 0021 16:33 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class MyAdapter extends BaseAdapter {
    private List<OrderList_Purchase> dataList;

    public MyAdapter(List<OrderList_Purchase> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(BaseApplication.getInstance(),R.layout.liseitem,null);
            holder = new ViewHolder();
            holder.CreateDate  = (TextView)convertView.findViewById(R.id.tv_create_date);
            holder.TotalAmount  = (TextView)convertView.findViewById(R.id.tv_total_amount);
            holder.TotalMoney  = (TextView)convertView.findViewById(R.id.tv_total_money);
            holder.PlanDate  = (TextView)convertView.findViewById(R.id.tv_pian_data);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        Object item = getItem(position);

//        holder.CreateDate.setText(item.create_date);
//        holder.TotalAmount.setText(item.TotalAmount.);
//        holder.TotalMoney.setText(item.TotalMoney.);
//        holder.PlanDate.setText(item.PlanDate.);


        return convertView;

    }

   static  class ViewHolder {

        private TextView CreateDate;
        private TextView TotalAmount;
        private TextView TotalMoney;
        private TextView PlanDate;
    }
}