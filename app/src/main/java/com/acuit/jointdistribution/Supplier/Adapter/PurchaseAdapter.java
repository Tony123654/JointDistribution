package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.PurchaseChangedActivity;
import com.acuit.jointdistribution.Supplier.Domain.AlterOrderBean;

import java.util.ArrayList;

/**
 * 类名: PurchaseAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/31 0031 17:56 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PurchaseAdapter extends BaseAdapter {

    private final PurchaseChangedActivity mActivity;
    private final ArrayList<AlterOrderBean.DataBean.AlterBean> purchaseList;

    public PurchaseAdapter(ArrayList<AlterOrderBean.DataBean.AlterBean> purchaseList, PurchaseChangedActivity mActivity) {
        this.mActivity = mActivity;
        this.purchaseList = purchaseList;
    }


    @Override
    public int getCount() {
        return purchaseList.size();
    }


    @Override
    public Object getItem(int position) {
        return purchaseList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {

            holder = new ViewHolder();
            convertView = View.inflate(BaseApplication.getContext(), R.layout.purchase_item, null);
            holder.createDate = (TextView) convertView.findViewById(R.id.tv_purchase_create_date);
            holder.planDate = (TextView) convertView.findViewById(R.id.tv_plan_date);
            holder.depRootName = (TextView) convertView.findViewById(R.id.tv_purchase_dep_root_name);
            holder.purchaseItem=(RadioButton)convertView.findViewById(R.id.rb_item);
            holder.purchaseItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        mActivity.selectedOrder(position);
                    } else {
                        mActivity.unselectedOrder(position);
                    }
                }
            });





            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();


        }
        AlterOrderBean.DataBean.AlterBean purchaseItem = (AlterOrderBean.DataBean.AlterBean) getItem(position);

        System.out.println("jieci:" + purchaseItem);
        holder.createDate.setText(purchaseItem.getCreate_date());
//        holder.comNmae.setText(purchaseItem.getCom_name());
        holder.depRootName.setText(purchaseItem.getDep_root_name());
        holder.planDate.setText(purchaseItem.getPlan_date());


        return convertView;
    }

    class ViewHolder {

        public TextView createDate;
        public TextView planDate;
        public TextView depRootName;
        public TextView s_amount;
        public TextView e_amount;
        public RadioButton purchaseItem;
    }
}
