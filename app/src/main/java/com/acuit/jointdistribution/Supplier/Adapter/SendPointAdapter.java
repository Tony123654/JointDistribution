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
 * 类名: SendPointAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/10/9 0009 15:29 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 *
 */

public class SendPointAdapter extends BaseAdapter {

    private final ArrayList<AeraBean.DataBean> pointList;
    private final SendActivity mActivity;

    public SendPointAdapter(ArrayList<AeraBean.DataBean> pointList, SendActivity mActivity) {
        this.pointList = pointList;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return 0;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(BaseApplication.getContext(), R.layout.receive_rught_point_item, null);
            holder.name = (TextView) convertView.findViewById(R.id.tv_point_name);


//            System.out.println("yyy:"+holder.name);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
//        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);
//        receiveRightMenuItem = (OnlySchoolBean.DataBean)getItem(position);

        AeraBean.DataBean areaItem = (AeraBean.DataBean) getItem(position);

        holder.name.setText(areaItem.getLk_option()
        );

        return convertView;
    }

    static class ViewHolder {


        public TextView name;


    }
}
