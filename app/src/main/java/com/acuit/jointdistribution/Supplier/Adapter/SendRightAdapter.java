package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.SendActivity;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;

import java.util.ArrayList;

/**
 * 类名: ReceiveRightAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/19 0019 18:36 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendRightAdapter extends BaseAdapter{


    private OnlySchoolBean.DataBean.RowsBean receiveRightMenuItem;
    private final ArrayList<OnlySchoolBean.DataBean.RowsBean> gv_list;
    private final SendActivity mActivity;

    public SendRightAdapter(ArrayList<OnlySchoolBean.DataBean.RowsBean> gv_list, SendActivity mActivity) {
        this.gv_list = gv_list;
        this.mActivity = mActivity;

    }




    @Override
    public int getCount() {
        return gv_list.size();
    }


    @Override
    public Object getItem(int position) {
        return gv_list.get(position);
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
            convertView = View.inflate(BaseApplication.getContext(), R.layout.receive_right_menu_item, null);
            holder.name = (TextView) convertView.findViewById(R.id.tv_name);


            System.out.println("eee:"+holder.name);
            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
//        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);
        receiveRightMenuItem = (OnlySchoolBean.DataBean.RowsBean) getItem(position);


        holder.name.setText(receiveRightMenuItem.getBrief());

        return convertView;
    }
    static class ViewHolder {


        public TextView name;


    }
}
