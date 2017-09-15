package com.acuit.jointdistribution.Supplier.Acitivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Domain.PickingOrderInfoBean;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;

public class PickingActivity extends BaseActivity {

    private TextView picking_create_date;
    private TextView picking_make_date;
    private TextView picking_total_amount;
    private TextView picking_dep_brief_name;
    private PickingOrderInfoBean pickingInfo;
    private ArrayList<PickingOrderInfoBean.DataBean.StockListBean> pickingList;
    private ListView picking_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);
        picking_dep_brief_name = (TextView) findViewById(R.id.tv_picking_dep_brief_name);
        picking_create_date = (TextView) findViewById(R.id.tv_picking_create_date);
        picking_make_date = (TextView) findViewById(R.id.tv_picking_make_date);
        picking_total_amount = (TextView) findViewById(R.id.tv_picking_total_amount);
        picking_List = (ListView) findViewById(R.id.lv_pickingList);


        inntData();
    }

    private void inntData() {
        getDataFromServer();
    }

    public void getDataFromServer() {


        HttpUtils hp = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("id",5+"");
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        hp.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_DETAIL, params, new RequestCallBack<String>() {


            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {

                String result = responseInfo.result;
                System.out.println("mmmm result:"+result);
                System.out.println("mmmm url:"+GlobalContants.URL_BUY_ORDER_DETAIL);
                Gson gson = new Gson();

                pickingInfo = gson.fromJson(result, PickingOrderInfoBean.class);


                picking_dep_brief_name.setText(pickingInfo.getData().getOrder_info().getDep_brief_name());
                picking_create_date.setText(pickingInfo.getData().getOrder_info().getCreate_date());
                picking_make_date.setText(pickingInfo.getData().getOrder_info().getPlan_date());
                picking_total_amount.setText(pickingInfo.getData().getOrder_info().getTotal_amount());


                pickingList = new ArrayList<>();
                pickingList.clear();
                pickingList.add((PickingOrderInfoBean.DataBean.StockListBean) pickingInfo.getData().getStock_list());
                //适配

            }

            @Override
            public void onFailure(HttpException error, String msg) {
                Toast.makeText(BaseApplication.getContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
