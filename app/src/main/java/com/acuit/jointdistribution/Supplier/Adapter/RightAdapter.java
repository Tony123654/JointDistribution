package com.acuit.jointdistribution.Supplier.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.PurchaseChangedActivity;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;

import java.util.ArrayList;

/**
 * 类名: RightAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/19 0019 16:52 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class RightAdapter extends BaseAdapter {

    private final ArrayList<Object> rightMenuList;
    private final PurchaseChangedActivity mActivity;

    private OnlySchoolBean.DataBean rightMenuItem;
    public RightAdapter(ArrayList<Object> rightMenuList, PurchaseChangedActivity mActivity) {
        this.rightMenuList = rightMenuList;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return rightMenuList.size();
    }


    @Override
    public Object getItem(int position) {
        return rightMenuList.get(position);
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
            convertView = View.inflate(BaseApplication.getContext(), R.layout.right_menu_item, null);
            holder.FirstText = (TextView) convertView.findViewById(R.id.FirstText);
            holder.SecondText = (TextView) convertView.findViewById(R.id.SecondText);
            holder.ThirdText = (TextView) convertView.findViewById(R.id.ThirdText);
            holder.FourText = (TextView) convertView.findViewById(R.id.FourText);
            holder.FiveText = (TextView) convertView.findViewById(R.id.FiveText);
            holder.SixText = (TextView) convertView.findViewById(R.id.SixText);


            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }
//        alterItem = (AlterOrderInfoBean.DataBean.ListBean) getItem(position);
         rightMenuItem = (OnlySchoolBean.DataBean)getItem(position);


        holder.FirstText.setText(rightMenuItem.getName());
        holder.SecondText.setText(rightMenuItem.getName());
        holder.ThirdText.setText(rightMenuItem.getName());
        holder.FourText.setText(rightMenuItem.getName());
        holder.FiveText.setText(rightMenuItem.getName());
        holder.SixText.setText(rightMenuItem.getName());

        return convertView;

    }
    static class ViewHolder {

        public TextView FirstText;
        public TextView SecondText;
        public TextView ThirdText;
        public TextView FourText;
        public TextView FiveText;
        public TextView SixText;


    }
}
