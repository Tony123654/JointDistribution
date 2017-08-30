package com.acuit.jointdistribution.Storeman.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.SuppliersListBean;
import com.acuit.jointdistribution.Storeman.View.SupplierListActivity;

import java.util.List;

/**
 * 类名: SuppliersListAdapter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 10:29 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SuppliersListAdapter extends RecyclerView.Adapter {

    private List<SuppliersListBean.DataBean.StoreInListBean> dataList;
    private SupplierListActivity mActivity;

    public SuppliersListAdapter(List<SuppliersListBean.DataBean.StoreInListBean> dataList, SupplierListActivity mActivity) {
        this.dataList = dataList;
        this.mActivity = mActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(mActivity).inflate(R.layout.item_suppliers_list, parent, false);

        return new SuppliersList_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        SuppliersList_ViewHolder viewHolder = (SuppliersList_ViewHolder) holder;
        viewHolder.getTvSupplierName().setText(dataList.get(position).getSupply_name());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    class SuppliersList_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView tvSupplierName;

        public SuppliersList_ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvSupplierName = (TextView) itemView.findViewById(R.id.tv_supplierName);
        }

        public TextView getTvSupplierName() {
            return tvSupplierName;
        }

        public void setTvSupplierName(TextView tvSupplierName) {
            this.tvSupplierName = tvSupplierName;
        }

        @Override
        public void onClick(View v) {
            RecyclerView parent = (RecyclerView) v.getParent();
            int position = parent.getChildAdapterPosition(v);
            Intent intent;
            if (1 == dataList.get(position).getCount()) {
//                intent = new Intent(mActivity, StoreInDetilsActivity.class);
            } else {
//                intent = new Intent(mActivity, StoreInListActivity.class);
            }
//<<<<<<< Updated upstream
//            intent.putExtra("SupplierId", dataList.get(position));
//            mActivity.startActivity(intent);
//=======
//            intent.putExtra("SupplierId", dataList.get(position).getSupply_id());
//            mActivity.startActivity(intent);
//>>>>>>> Stashed changes
        }
    }
}
