package com.acuit.jointdistribution.Storeman.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInListBySupplierBean;
import com.acuit.jointdistribution.Storeman.View.StoreInDetilsActivity;
import com.acuit.jointdistribution.Storeman.View.StoreInListActivity;

import java.util.List;

/**
 * 类名: StoreInListAdapter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 14:56 <p>
 * 描述:  入库单列表(某供应商)适配器
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInListAdapter extends RecyclerView.Adapter {
//public class StoreInListAdapter extends XRecyclerView.Adapter {

    private StoreInListActivity mActivity;
    private List<StoreInListBySupplierBean.DataBean.StoreInListBean> dataList;

    public StoreInListAdapter(List<StoreInListBySupplierBean.DataBean.StoreInListBean> dataList, StoreInListActivity mActivity) {
        this.dataList = dataList;
        this.mActivity = mActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mActivity).inflate(R.layout.item_storein_list_by_supplier, parent, false);

        return new StoreInList_ViewHold(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        StoreInList_ViewHold viewHold = (StoreInList_ViewHold) holder;
        viewHold.getTvOrderId().setText(dataList.get(position).getCode());
        viewHold.getTvPlanDate().setText(dataList.get(position).getPlan_date_str());
        viewHold.getTvTotalAmount().setText(dataList.get(position).getStatis_num());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class StoreInList_ViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {


        private final TextView tvStoreIn;
        private final TextView tvPlanDate;
        private final TextView tvTotalAmount;
        private final TextView tvOrderId;

        public StoreInList_ViewHold(View itemView) {
            super(itemView);
            tvOrderId = (TextView) itemView.findViewById(R.id.tv_orderId);
            tvTotalAmount = (TextView) itemView.findViewById(R.id.tv_total_amount);
            tvPlanDate = (TextView) itemView.findViewById(R.id.tv_planDate);
            tvStoreIn = (TextView) itemView.findViewById(R.id.tv_storeIn);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            RecyclerView parent = (RecyclerView) v.getParent();
            int itemPosition = parent.getChildAdapterPosition(v)-1;
            Intent intent = new Intent(mActivity, StoreInDetilsActivity.class);
            intent.putExtra("StoreInId", dataList.get(itemPosition).getId());
            mActivity.startActivity(intent);
        }


        public TextView getTvStoreIn() {
            return tvStoreIn;
        }

        public TextView getTvPlanDate() {
            return tvPlanDate;
        }

        public TextView getTvTotalAmount() {
            return tvTotalAmount;
        }

        public TextView getTvOrderId() {
            return tvOrderId;
        }

    }


}
