package com.acuit.jointdistribution.Storeman.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.acuit.jointdistribution.Storeman.View.StoreInDetilsActivity;

import java.util.List;

/**
 * 类名: StoreInGoodsAdapter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/30 11:15 <p>
 * 描述:  入库单详情界面 物品列表适配器
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInGoodsAdapter extends RecyclerView.Adapter {

    private StoreInDetilsActivity mActivity;
    private List<StoreInDetailBean.DataBean.ListBean> dataList;

    public StoreInGoodsAdapter(List<StoreInDetailBean.DataBean.ListBean> dataList, StoreInDetilsActivity storeInDetilsActivity) {
        this.dataList = dataList;
        this.mActivity = storeInDetilsActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.item_storein_goods, parent, false);

        return new Goods_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Goods_ViewHolder viewHolder = (Goods_ViewHolder) holder;
        StoreInDetailBean.DataBean.ListBean itemBean = dataList.get(position);

        viewHolder.getTvGoodsName().setText(itemBean.getStock_name());
        viewHolder.getTvGoodsWeight().setText(itemBean.getOrder_amount() + itemBean.getUnit());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    class Goods_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvGoodsWeight;
        private TextView tvGoodsName;

        public Goods_ViewHolder(View itemView) {
            super(itemView);

            tvGoodsName = (TextView) itemView.findViewById(R.id.tv_goodsName);
            tvGoodsWeight = (TextView) itemView.findViewById(R.id.tv_goodsWeight);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }


        public TextView getTvGoodsWeight() {
            return tvGoodsWeight;
        }

        public TextView getTvGoodsName() {
            return tvGoodsName;
        }
    }

}
