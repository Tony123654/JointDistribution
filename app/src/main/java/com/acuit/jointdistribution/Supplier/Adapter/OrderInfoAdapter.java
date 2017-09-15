package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderInfoBean;

import java.util.ArrayList;

/**
 * 类名: OrderInfoAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/31 0031 10:54 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class OrderInfoAdapter extends BaseAdapter {
    private ArrayList mListInfo;

    public OrderInfoAdapter(ArrayList<BuyOrderInfoBean> mListInfo) {
        this.mListInfo = mListInfo;
    }


    @Override
    public int getCount() {
        return mListInfo.size();
    }


    @Override
    public Object getItem(int position) {
        return mListInfo.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(BaseApplication.getContext(), R.layout.buy_order_info_item, null);
            holder = new ViewHolder();
            holder.stock_name = (TextView) convertView.findViewById(R.id.tv_receive_info_list_stock_name);
            holder.count = (TextView) convertView.findViewById(R.id.tv_receive_info_list_count);
            holder.price = (TextView) convertView.findViewById(R.id.tv_receive_info_list_price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


//        BuyOrderInfoBean.DataBean.StockListBean item = (BuyOrderInfoBean.DataBean.StockListBean) getItem(position);
        BuyOrderInfoBean.DataBean.StockListAppBean   item = (BuyOrderInfoBean.DataBean.StockListAppBean)getItem(position);

          holder.stock_name.setText(item.getStock_name());
        holder.count.setText(item.getCount()+"kg");
        holder.price.setText("¥"+item.getPrice());

        System.out.println("aaa item:"+item.toString());

        return convertView;

    }

    static class ViewHolder {

        public TextView count;
        public TextView stock_name;
        public TextView price;
    }
}

