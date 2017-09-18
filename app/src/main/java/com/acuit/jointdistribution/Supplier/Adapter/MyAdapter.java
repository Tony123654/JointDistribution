package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;

import java.util.ArrayList;

import static com.acuit.jointdistribution.R.id.rb_item;

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

    private ReceivedActivity mActivty;
    private ArrayList<Integer> selectAll;
    private ArrayList<OrderListBean.DataBean.RowsBean> mList;

    public

    MyAdapter(ArrayList<OrderListBean.DataBean.RowsBean> mList, ReceivedActivity mActivty, ArrayList<Integer> selectAll) {
        this.mList = mList;
        this.mActivty = mActivty;
        this.selectAll = selectAll;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            convertView = View.inflate(BaseApplication.getContext(), R.layout.listitem, null);
            holder = new ViewHolder();
            holder.receive_create_date = (TextView) convertView.findViewById(R.id.tv_receive_create_date);
            holder.total_amount = (TextView) convertView.findViewById(R.id.tv_total_amount);
            holder.total_money = (TextView) convertView.findViewById(R.id.tv_total_money);
            holder.plan_date = (TextView) convertView.findViewById(R.id.tv_plan_date);

            holder.rb_item = (RadioButton) convertView.findViewById(rb_item);
//            holder.dep_name = (TextView) convertView.findViewById(R.id.tv_dep_name);
            holder.com_brief_name = (TextView) convertView.findViewById(R.id.tv_combrief_name);
            holder.brief_name = (TextView) convertView.findViewById(R.id.tv_brief_name);


            holder.rb_item.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if (isChecked) {
                        mActivty.selectedOrder(position);
                    } else {
                        mActivty.unselectedOrder(position);
                    }
                }
            });

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        OrderListBean.DataBean.RowsBean item = (OrderListBean.DataBean.RowsBean) getItem(position);
//        System.out.println("item:"+item);

        holder.receive_create_date.setText(item.getCreate_date());
//        holder.total_money.setText(item.getTotal_money());
//        holder.total_amount.setText(item.getTotal_amount());
        holder.plan_date.setText(item.getPlan_date());

//        System.out.println("aaa selectAll" + position + ":" + selectAll);
        if (selectAll.size() > 0) {
//            System.out.println("aaa selectAll:true");
            holder.rb_item.setChecked(true);

        } else {
//            System.out.println("aaa selectAll:false");
            holder.rb_item.setChecked(false);
        }

        final GlobalValue globalValue = new GlobalValue();
        final ViewHolder finalHolder = holder;
        holder.rb_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isCheck = globalValue.isCheck();
                if (isCheck) {
                    if (v == finalHolder.rb_item) finalHolder.rb_item.setChecked(false);
                    mActivty.unselectedOrder(position);
                } else {
                    if (v == finalHolder.rb_item) finalHolder.rb_item.setChecked(true);
                }
                globalValue.setCheck(!isCheck);
            }
        });

//        holder.dep_name.setText(item.getDep_name);
        holder.com_brief_name.setText("(" + item.getCom_brief_name());
        holder.brief_name.setText("—" + item.getDep_brief_name() + ")");


        return convertView;

    }

    static class ViewHolder {
        public TextView total_amount;
        public TextView total_money;
        public TextView plan_date;
        public TextView receive_create_date;
        public TextView com_brief_name;
        public TextView brief_name;
        public RadioButton rb_item;
    }
}