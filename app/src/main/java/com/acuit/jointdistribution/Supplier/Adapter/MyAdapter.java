package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.OrderList;

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

    public MyAdapter(List<OrderList> dataList) {
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
//        OrderList_Purchase item = (OrderList_Purchase) getItem(position);

        OrderList item = (OrderList) getItem(position);
        holder.CreateDate.setText(item.getData().getRows().size());
        holder.TotalMoney.setText(item.getData().getTotal_money());
        holder.TotalAmount.setText(item.getData().getTotal_amount());
//        holder.PlanDate.setText(item.getData().getRows().indexOf(plan_date));


//        item.getData().getUser_info().getMobile_interface().get_$1856().

//           holder.CreateDate.setText(item.getData().getUser_info().getDep_info().getCreate_date());
//           holder.TotalAmount.setText(item.getData().getUser_info().getDep_info().getTotal);
//        holder.CreateDate.setText(item.getData());
//        holder.TotalAmount.setText(item.getData().getPriv().getBuy().getBuy_order_list().);
//        holder.TotalMoney.setText();
//        holder.PlanDate.setText();


        return convertView;

    }

   static  class ViewHolder {

        private TextView CreateDate;
        private TextView TotalAmount;
        private TextView TotalMoney;
        private TextView PlanDate;
    }
}