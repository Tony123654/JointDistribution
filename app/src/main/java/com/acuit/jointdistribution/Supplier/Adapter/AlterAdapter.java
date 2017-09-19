package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.PurchaseChangedInfoActivity;
import com.acuit.jointdistribution.Supplier.Domain.AlterOrderInfoBean;

import java.util.ArrayList;

/**
 * 类名: AlterAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/18 0018 12:36 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class AlterAdapter extends BaseAdapter {

    private final ArrayList<AlterOrderInfoBean.DataBean.ListBean> alterList;
    private final PurchaseChangedInfoActivity mActivity;
    private View inflate;
    private AlterOrderInfoBean.DataBean.ListBean alterItem;

    public AlterAdapter(ArrayList alterList, PurchaseChangedInfoActivity mActivity) {
        this.alterList = alterList;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return alterList.size();
    }

    @Override
    public Object getItem(int position) {
        return alterList.get(position);
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
            convertView = View.inflate(BaseApplication.getContext(), R.layout.alter_info_item, null);
            holder.stockName = (TextView) convertView.findViewById(R.id.tv_alter_stock_name);
            holder.price = (TextView) convertView.findViewById(R.id.tv_alter_price);
            holder.s_amount = (TextView) convertView.findViewById(R.id.tv_alert_info_s_amount);
            holder.e_amount = (TextView) convertView.findViewById(R.id.tv_alert_info_e_amount);

            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);

        holder.stockName.setText(alterItem.getStock_name());
        holder.price.setText("¥"+alterItem.getPrice());
        holder.s_amount.setText(alterItem.getS_amount()+"kg");
        holder.e_amount.setText(alterItem.getE_amount()+"kg");

        return convertView;
    }

    static class ViewHolder {

        public TextView stockName;
        public TextView price;
        public TextView s_amount;
        public TextView e_amount;

    }


}