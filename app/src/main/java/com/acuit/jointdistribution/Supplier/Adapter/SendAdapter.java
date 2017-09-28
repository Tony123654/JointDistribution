package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.SendActivity;
import com.acuit.jointdistribution.Supplier.Domain.StoreInfoListBean;

import java.util.ArrayList;

/**
 * 类名: SendAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/1 0001 16:05 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SendAdapter extends BaseAdapter {
    private ArrayList sendList;
    private View convertView;
    public SendActivity mActivity;

    public SendAdapter(ArrayList<StoreInfoListBean.DataBean.StoreInListBean> sendList, SendActivity mActivity, ArrayList<Integer> selectAlls) {
        this.sendList = sendList;
        this.mActivity=mActivity;
    }


    @Override
    public int getCount() {
        return sendList.size();
    }


    @Override
    public Object getItem(int position) {
        return sendList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {

            convertView = View.inflate(BaseApplication.getContext(), R.layout.send_item_list, null);

            holder = new ViewHolder();

            holder.create_date = (TextView) convertView.findViewById(R.id.tv_create_date);
            holder.plan_date = (TextView) convertView.findViewById(R.id.tv_plan_date);
            holder.total_amount = (TextView) convertView.findViewById(R.id.tv_total_amount);
            holder.contact_person = (TextView) convertView.findViewById(R.id.tv_contact_person);
            holder.contact_number = (TextView) convertView.findViewById(R.id.tv_contact_number);
            holder.request_dep_str = (TextView) convertView.findViewById(R.id.tv_dep_name2);
            holder.com_brief_name = (TextView) convertView.findViewById(R.id.tv_dep2_name);
//            holder.dep_root_name = (TextView) convertView.findViewById(R.id.tv_dep_root_name);


//            holder.rb_send.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                    if (isChecked) {
//                        mActivity.selectedOrder(position);
//
//                    } else {
//                        mActivity.unselectedOrder(position);
//                    }
//                }
//            });



            convertView.setTag(holder);
        } else {


            holder = (ViewHolder) convertView.getTag();

        }

//        SendOrderBean.DataBean.RowsBean item = (SendOrderBean.DataBean.RowsBean) getItem(position);

        StoreInfoListBean.DataBean.StoreInListBean item = (StoreInfoListBean.DataBean.StoreInListBean) getItem(position);

        holder.create_date.setText(item.getCreate_date());
//        holder.plan_date.setText(item.getPlan_date_str());
        holder.request_dep_str.setText(item.getDep_name2());
        holder.com_brief_name.setText("("+item.getDep_name());
//        holder.dep_root_name.setText("-"+item.getDep_brief_name()+")");
        holder.total_amount.setText(item.getStatis_num());
        holder.contact_person.setText(item.getPhone().getContact_person());

        holder.contact_number.setText("("+item.getPhone().getContact_number()+")");

        return convertView;
    }

    static class ViewHolder {

        public TextView create_date;
        public TextView plan_date;
        public TextView total_amount;
        public TextView contact_person;
        public TextView contact_number;
        public TextView request_dep_str;
        public TextView com_brief_name;
        public TextView dep_root_name;
        public RadioButton rb_send;


    }
}
