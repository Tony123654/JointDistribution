package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.SendInfoActivity;
import com.acuit.jointdistribution.Supplier.Domain.StoreSendInfoBean;

import java.util.ArrayList;

/**
 * 类名: SendInfoAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/10/9 0009 10:44 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendInfoAdapter extends BaseAdapter{

    private final ArrayList<StoreSendInfoBean.DataBean.ListBean> sendListInfo;
    private final SendInfoActivity mActivity;
    private StoreSendInfoBean.DataBean.ListBean sendInfoItem;

    public SendInfoAdapter(ArrayList<StoreSendInfoBean.DataBean.ListBean> sendListInfo, SendInfoActivity mActivity) {
        this.sendListInfo = sendListInfo;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return sendListInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return sendListInfo.get(position);
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
            convertView = View.inflate(BaseApplication.getContext(), R.layout.send_info, null);
            holder.stock_name = (TextView) convertView.findViewById(R.id.tv_stock_name);
            holder.in_price = (TextView) convertView.findViewById(R.id.tv_in_price);
            holder.unit = (TextView) convertView.findViewById(R.id.tv_unit);


//            System.out.println("eee:"+holder.name);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
//        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);
        sendInfoItem = (StoreSendInfoBean.DataBean.ListBean) getItem(position);


        holder.stock_name.setText(sendInfoItem.getStock_name());
        holder.in_price.setText(sendInfoItem.getIn_price());
        holder.unit.setText(sendInfoItem.getUnit());

        return convertView;
    }
    static class ViewHolder {


        public TextView stock_name;
        public TextView in_price;
        public TextView unit;


    }
}
