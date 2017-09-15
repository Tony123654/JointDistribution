package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.PickingActivity;
import com.acuit.jointdistribution.Supplier.Domain.PickingOrderInfoBean;

import java.util.ArrayList;

/**
 * 类名: PickingAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/14 0014 18:46 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PickingAdapter extends BaseAdapter {

    private  ArrayList<PickingOrderInfoBean.DataBean.StockListBean> pickingList;
    private  PickingActivity mActivity;

    public PickingAdapter(ArrayList<PickingOrderInfoBean.DataBean.StockListBean> pickingList, PickingActivity mActivity) {
        this.pickingList = pickingList;
        this.mActivity = mActivity;

    }

    @Override
    public int getCount() {
        return pickingList.size();
    }

    @Override
    public Object getItem(int position) {
        return pickingList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {

            convertView = View.inflate(BaseApplication.getContext(), R.layout.picking_item, null);

            holder = new ViewHolder();

            holder.stock_name = (TextView) convertView.findViewById(R.id.tv_picking_stock_name);
            holder.price = (TextView) convertView.findViewById(R.id.tv_picking_price);
            holder.unit_name = (TextView) convertView.findViewById(R.id.tv_picking_unit_name);

            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();

        }

        PickingOrderInfoBean.DataBean.StockListBean picking_item = (PickingOrderInfoBean.DataBean.StockListBean) getItem(position);

//        holder.stock_name.setText(picking_item.getStock_name());
//        holder.price.setText(picking_item.getPrice());
//        holder.unit_name.setText(picking_item.getUnit_name());

        holder.stock_name.setText(picking_item.get_$30().getStock_name());
        holder.unit_name.setText(picking_item.get_$30().getUnit_name());
        holder.price.setText(picking_item.get_$30().getPrice());


        return convertView;
    }

    static class ViewHolder {

        public TextView stock_name;
        public TextView price;
        public TextView unit_name;


    }

}
