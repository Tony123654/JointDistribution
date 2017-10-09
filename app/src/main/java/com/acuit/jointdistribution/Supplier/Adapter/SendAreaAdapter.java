package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.SendActivity;
import com.acuit.jointdistribution.Supplier.Domain.AeraBean;

import java.util.ArrayList;

/**
 * 类名: SendAreaAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/10/9 0009 15:23 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendAreaAdapter extends BaseAdapter {

    private final ArrayList<AeraBean.DataBean> areaList;
    private final SendActivity mActivity;

    public SendAreaAdapter(ArrayList<AeraBean.DataBean> areaList, SendActivity mActivity) {
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

        holder.name.setText(areaItem.getLk_brief());

        return convertView;
    }
    static class ViewHolder {


        public TextView name;


    }
}
