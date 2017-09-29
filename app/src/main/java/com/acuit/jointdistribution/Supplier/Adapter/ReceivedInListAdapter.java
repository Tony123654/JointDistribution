package com.acuit.jointdistribution.Supplier.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    //    private final int position;
    private List<OrderListBean.DataBean.RowsBean> receiveInList;
    private ReceivedActivity mActivity;
    private ArrayList<Integer> selectedPosition;
    private boolean selectAll = false;

    public ReceivedInListAdapter(List<OrderListBean.DataBean.RowsBean> receiveInList, ReceivedActivity mActivity) {
        this.receiveInList = receiveInList;
        this.mActivity = mActivity;
        selectedPosition = new ArrayList<>();
//        selectedPosition = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int position) {

        View itemView = LayoutInflater.from(mActivity).inflate(R.layout.listitem, parent, false);

//        System.out.println("aaa position:"+position);
        return new ReceivedInList_ViewHold(itemView, position);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ReceivedInList_ViewHold viewHold = (ReceivedInList_ViewHold) holder;

        viewHold.getReceiveCreateDate().setText(receiveInList.get(position).getCreate_date());
        viewHold.getPlanDate().setText(receiveInList.get(position).getPlan_date());
        viewHold.getComBriefName().setText(receiveInList.get(position).getCom_brief_name());
        viewHold.getDepBriefName().setText(receiveInList.get(position).getDep_brief_name());
        viewHold.getRequestDepStrs().setText(receiveInList.get(position).getRequest_dep_strs());
        viewHold.getTotalMoney().setText(receiveInList.get(position).getTotal_money() + "");
        viewHold.getTotalAmount().setText(receiveInList.get(position).getTotal_amount());
        viewHold.setItemPosition(position);
        if (selectAll) {
            viewHold.getRbitem().setChecked(true);
        } else {
            viewHold.getRbitem().setChecked(false);
        }

    }


    @Override
    public int getItemCount() {
        return receiveInList.size();
    }

    public void selectAll() {
        selectAll = true;
        selectedPosition.clear();
        for (int i = 0; i < receiveInList.size(); i++) {
            selectedPosition.add(new Integer(i));
        }
        notifyDataSetChanged();
    }

    public void disSelectAll() {
        selectAll = false;
        selectedPosition.clear();
        notifyDataSetChanged();
    }


    class ReceivedInList_ViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView receiveCreateDate;
        private TextView totalMoney;
        private TextView totalAmount;
        private TextView planDate;
        private TextView comBriefName;
        private TextView depBriefName;
        private TextView requestDepStrs;
        private RadioButton rb_item;
        private int itemPosition = -1;
        private GlobalValue globalValue;

        public ReceivedInList_ViewHold(View itemView, final int position) {


            super(itemView);
            itemPosition = position;
            receiveCreateDate = (TextView) itemView.findViewById(R.id.tv_receive_create_date);
            totalMoney = (TextView) itemView.findViewById(R.id.tv_receive_total_money);
            totalAmount = (TextView) itemView.findViewById(R.id.tv_receive_total_amount);
            planDate = (TextView) itemView.findViewById(R.id.tv_receive_plan_date);
            comBriefName = (TextView) itemView.findViewById(R.id.tv_receive_com_brief_name);
            depBriefName = (TextView) itemView.findViewById(R.id.tv_receive_dep_brief_name);
            requestDepStrs = (TextView) itemView.findViewById(R.id.tv_receive_request_dep_strs);

            globalValue = new GlobalValue();
            rb_item = (RadioButton) itemView.findViewById(R.id.rb_item);

//状态改变
//
//            rb_item.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                    if (isChecked) {
//                        if (itemPosition!=-1)
//
//                            if (!selectedPosition.contains(itemPosition)) {
//                                rb_item.setChecked(false);
//                            } else {
//                                rb_item.setChecked(true);
//                            }
//                        mActivity.selectedOrder(itemPosition);
//                    } else {
//                        mActivity.unselectedOrder(itemPosition);
//                    }
//                    globalValue.setCheck(isChecked);
//                }
//            });


            itemView.setOnClickListener(this);


            rb_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (selectAll) {
                        globalValue.setCheck(true);
                    }
                    boolean isCheck = globalValue.isCheck();

                    System.out.println("kkk globalValueisCheck" + isCheck + "     "


                            + position);

                    if (isCheck) {
                        if (v.getId() == rb_item.getId()) {
                            rb_item.setChecked(false);
                            selectedPosition.remove(new Integer(itemPosition));
                            ReceivedInListAdapter.this.mActivity.unselectedOrder(itemPosition);
                            globalValue.setCheck(false);
                            selectAll = false;
                        }
                    } else {
                        if (v.getId() == rb_item.getId()) {
                            rb_item.setChecked(true);
                            globalValue.setCheck(true);
                            selectedPosition.add(new Integer(itemPosition));
                            ReceivedInListAdapter.this.mActivity.selectedOrder(itemPosition);
                        }
                    }
                }
            });

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

        public TextView getComBriefName() {
            return comBriefName;
        }

        public TextView getDepBriefName() {
            return depBriefName;
        }

        public RadioButton getRbitem() {

            return rb_item;
        }

        public TextView getRequestDepStrs() {
            return requestDepStrs;
        }

        public RadioButton getRb_item() {
            return rb_item;
        }

        public int getItemPosition() {
            return itemPosition;
        }

        public void setItemPosition(int itemPosition) {
            this.itemPosition = itemPosition;
        }
    }


}
