package com.acuit.jointdistribution.Storeman.Adapter;

import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInListBySupplierBean;
import com.acuit.jointdistribution.Storeman.Bean.SuppliersListBean;
import com.acuit.jointdistribution.Storeman.View.StoreInDetilsActivity;
import com.acuit.jointdistribution.Storeman.View.ReceivedActivity;
import com.acuit.jointdistribution.Storeman.View.SupplierListActivity;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 类名: SuppliersListAdapter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 10:29 <p>
 * 描述: 采购单供应商列表 适配器
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
        viewHolder.getBtnSupplierName().setText(dataList.get(position).getSupply_name());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    class SuppliersList_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private Button btnSupplierName;

        public SuppliersList_ViewHolder(View itemView) {
            super(itemView);
            btnSupplierName = (Button) itemView.findViewById(R.id.btn_supplierName);
            btnSupplierName.setOnClickListener(this);
        }

        public Button getBtnSupplierName() {
            return btnSupplierName;
        }

        public void setBtnSupplierName(Button btnSupplierName) {
            this.btnSupplierName = btnSupplierName;
        }

        @Override
        public void onClick(View v) {
            RecyclerView parent = (RecyclerView) (v.getParent()).getParent();
            int position = parent.getChildAdapterPosition((View) v.getParent()) - 1;
            if (1 == dataList.get(position).getCount()) {
                getSingleStoreIn(dataList.get(position));
            } else {
                Intent intent = new Intent(mActivity, ReceivedActivity.class);
                intent.putExtra("SupplierBean", dataList.get(position));
                mActivity.startActivity(intent);
            }

        }
    }

    /**
     * 获取某供应商————单个订单的信息，用于直接进入订单详情页面
     *
     * @param supplier 供应商对象
     */
    private void getSingleStoreIn(final SuppliersListBean.DataBean.StoreInListBean supplier) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STORE_IN_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                StoreInListBySupplierBean storeInListBySupplierBean = gson.fromJson(response, StoreInListBySupplierBean.class);
                if (200 == storeInListBySupplierBean.getCode()) {
                    Intent intent = new Intent(mActivity, StoreInDetilsActivity.class);
                    intent.putExtra("StoreInId", storeInListBySupplierBean.getData().getStore_in_list().get(0).getId());
                    mActivity.startActivity(intent);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(mActivity, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("start_date", (new Date(0)).getTime() / 1000 + "");
                params.put("end_date", System.currentTimeMillis() / 1000 + "");
                params.put("rows", "20");
                params.put("page", 1 + "");
                params.put("status", "2");
                params.put("supply_id", supplier.getSupply_id());

                return params;
            }
        };

        stringRequest.setTag("ReceivedActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }


}
