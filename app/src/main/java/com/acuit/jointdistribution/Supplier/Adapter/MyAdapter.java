//package com.acuit.jointdistribution.Supplier.Adapter;
//
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.RadioButton;
//import android.widget.TextView;
//
//import com.acuit.jointdistribution.Common.Base.BaseApplication;
//import com.acuit.jointdistribution.R;
//import com.acuit.jointdistribution.Supplier.Acitivity.ReceivedActivity;
//import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
//import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;
//
//import java.util.ArrayList;
//
//import static com.acuit.jointdistribution.R.id.rb_item;
//
///**
// * 类名: MyAdapter <p>
// * 创建人: Mwb <p>
// * 创建时间: 2017/8/21 0021 16>:33 <p
// * 描述:
// * <p>
// * 更新人: <p>
// * 更新时间: <p>
// * 更新描述: <p>
// */
//
//public class MyAdapter extends BaseAdapter {
//
//    private ReceivedActivity mActivty;
////    private ArrayList<Integer> selectAll;
//    private ArrayList<Integer> selectedPosition;
//    private ArrayList<OrderListBean.DataBean.RowsBean> dataList;
//    private boolean selectAll = false;
//
//    public MyAdapter(ArrayList<OrderListBean.DataBean.RowsBean> dataList, ReceivedActivity mActivty, ArrayList<Integer> selectAll) {
//        this.dataList = dataList;
//        this.mActivty = mActivty;
////        this.selectAll = selectAll;
//        selectedPosition = new ArrayList<>();
//    }
//
////    @Override
////    public void notifyDataSetChanged() {
////        if (dataList.size()>0) {
////            selectedPosition.clear();
////        }
////        super.notifyDataSetChanged();
////    }
//
//    @Override
//    public int getCount() {
//        return dataList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return dataList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(final int position, View convertView, ViewGroup parent) {
//        ViewHolder holder = null;
//        final GlobalValue globalValue = new GlobalValue();
//
//        if (convertView == null) {
//            convertView = View.inflate(BaseApplication.getContext(), R.layout.listitem, null);
//            holder = new ViewHolder();
//            holder.receive_create_date = (TextView) convertView.findViewById(R.id.tv_receive_create_date);
//            holder.total_amount = (TextView) convertView.findViewById(R.id.tv_total_amount);
//            holder.total_money = (TextView) convertView.findViewById(R.id.tv_total_money);
//            holder.plan_date = (TextView) convertView.findViewById(R.id.tv_plan_date);
//
//            holder.rb_item = (RadioButton) convertView.findViewById(rb_item);
//            holder.com_brief_name = (TextView) convertView.findViewById(R.id.tv_combrief_name);
//            holder.brief_name = (TextView) convertView.findViewById(R.id.tv_brief_name);
//
//
////            holder.rb_item.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////                @Override
////                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
////
////                    System.out.println("aaa setOnCheckedChangeListener is run");
////                    if (isChecked) {
////                        mActivty.selectedOrder(position);
////                    } else {
////                        mActivty.unselectedOrder(position);
////                    }
////                    globalValue.setCheck(isChecked);
////                }
////            });
//
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//
//        OrderListBean.DataBean.RowsBean item = (OrderListBean.DataBean.RowsBean) getItem(position);
//
//        holder.receive_create_date.setText(item.getCreate_date());
//        holder.plan_date.setText(item.getPlan_date());
////
////        if (selectAll.size() > 0) {
////            holder.rb_item.setChecked(true);
////        } else {
//        if (!selectedPosition.contains(position)) {
//            holder.rb_item.setChecked(false);
//        } else {
//            holder.rb_item.setChecked(true);
//        }
////        }
//        holder.total_amount.setText(item.getTotal_amount());
//        holder.total_money.setText(item.getTotal_money());
//
//
//        final ViewHolder finalHolder = holder;
//        holder.rb_item.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (selectAll) {
//                    globalValue.setCheck(true);
//                }
//                boolean isCheck = globalValue.isCheck();
//
//                if (isCheck) {
//                    if (v.getId() == finalHolder.rb_item.getId()) {
//                        finalHolder.rb_item.setChecked(false);
//                        selectedPosition.remove(new Integer(position));
//                        mActivty.unselectedOrder(position);
//                    }
//                } else {
//                    if (v.getId() == finalHolder.rb_item.getId()) {
//                        finalHolder.rb_item.setChecked(true);
//                        selectedPosition.add(new Integer(position));
//                        mActivty.selectedOrder(position);
//                    }
//                }
//
//

////        holder.dep_name.setText(item.getDep_name);
//        holder.com_brief_name.setText("(" + item.getCom_brief_name());
//        holder.brief_name.setText("—" + item.getDep_brief_name() + ")");
//
//
//        return convertView;
//
//    }
//
//    public void selectAll() {
//        selectAll = true;
//        selectedPosition.clear();
//        for (int i = 0; i < dataList.size(); i++) {
//            selectedPosition.add(new Integer(i));
//        }
//        notifyDataSetChanged();
//    }
//
//    public void disSelectAll() {
//        selectAll = false;
//        selectedPosition.clear();
//        notifyDataSetChanged();
//    }
//
//    static class ViewHolder {
//        public TextView total_amount;
//        public TextView total_money;
//        public TextView plan_date;
//        public TextView receive_create_date;
//        public TextView com_brief_name;
//        public TextView brief_name;
//        public RadioButton rb_item;
//    }
//}