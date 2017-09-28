package com.acuit.jointdistribution.Supplier.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedMenuInfoActivity;
import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名: ReceivedInListAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/9/28 0028 11:38 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ReceivedInListAdapter extends RecyclerView.Adapter {

    private  List<OrderListBean.DataBean.RowsBean> receiveInList;
    private  ReceivedActivity mActivity;
    private  ArrayList<Integer> selectAll;
    private ArrayList<Integer> selectedPosition;


    public ReceivedInListAdapter(List<OrderListBean.DataBean.RowsBean> receiveInList, ReceivedActivity mActivity, ArrayList<Integer> selectAll) {
        this.receiveInList = receiveInList;
        this.mActivity = mActivity;
        this.selectAll = selectAll;

        selectedPosition = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(mActivity).inflate(R.layout.listitem, parent, false);


        return new ReceivedInList_ViewHold(itemView);
//        return new StoreInList_ViewHold(itemView);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ReceivedInList_ViewHold viewHold = (ReceivedInList_ViewHold) holder;

        viewHold.getReceiveCreateDate().setText(receiveInList.get(position).getCreate_date());
        viewHold.getPlanDate().setText(receiveInList.get(position).getPlan_date());
        viewHold.getComBriefName().setText(receiveInList.get(position).getCom_brief_name());
        viewHold.getDepBriefName().setText(receiveInList.get(position).getDep_brief_name());
        viewHold.getRequestDepStrs().setText(receiveInList.get(position).getRequest_dep_strs());
//        viewHold.getTotalMoney().setText(receiveInList.get(position).getTotal_money());
        viewHold.getTotalAmount().setText(receiveInList.get(position).getTotal_amount());
//        viewHold.getRbitem().setChecked(receiveInList.get(position).);


    }


    @Override
    public int getItemCount() {
        return receiveInList.size();
    }

    class ReceivedInList_ViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView receiveCreateDate;
        private final TextView totalMoney;
        private final TextView totalAmount;
        private final TextView planDate;
        private final TextView comBriefName;
        private final TextView depBriefName;
        private final TextView requestDepStrs;
        private final RadioButton rb_item;

        public ReceivedInList_ViewHold(View itemView) {
            super(itemView);

            receiveCreateDate = (TextView) itemView.findViewById(R.id.tv_receive_create_date);
            totalMoney = (TextView) itemView.findViewById(R.id.tv_receive_totao_money);
            totalAmount = (TextView) itemView.findViewById(R.id.tv_receive_total_amount);
            planDate = (TextView) itemView.findViewById(R.id.tv_receive_plan_date);
            comBriefName = (TextView) itemView.findViewById(R.id.tv_receive_com_brief_name);
            depBriefName = (TextView) itemView.findViewById(R.id.tv_receive_dep_brief_name);
            requestDepStrs = (TextView) itemView.findViewById(R.id.tv_receive_request_dep_strs);

            rb_item = (RadioButton) itemView.findViewById(R.id.rb_item);


//            final ViewHolder finalHolder = holder;
//            ReceivedInList_ViewHold  holder = holder;
            final GlobalValue globalValue = new GlobalValue();
            rb_item.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){

                        mActivity.selectedOrder(getAdapterPosition());
                    }else {
                        mActivity.unselectedOrder(getAdapterPosition());
                    }
                    globalValue.setCheck(isChecked);
                }
            });



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            RecyclerView parent = (RecyclerView) v.getParent();
            int itemPosition = parent.getChildAdapterPosition(v) - 1;
            Intent intent = new Intent(mActivity, ReceivedMenuInfoActivity.class);
            intent.putExtra("listId", receiveInList.get(itemPosition).getId());
            mActivity.startActivity(intent);
        }


        public TextView getReceiveCreateDate() {
            return receiveCreateDate;
        }

        public TextView getTotalMoney() {
            return totalMoney;
        }

        public TextView getTotalAmount() {
            return totalAmount;
        }

        public TextView getPlanDate() {
            return planDate;
        }

        public TextView getComBriefName(){
            return comBriefName;
        }

        public TextView getDepBriefName(){
            return depBriefName;
        }
        public RadioButton getRbitem(){

            return rb_item;
        }
        public TextView getRequestDepStrs(){
            return requestDepStrs;
        }
    }


}
