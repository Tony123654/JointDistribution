package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.PickingAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.PickingRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
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
    private TextView picking_dep_brief_name;
    private PickingOrderInfoBean pickingOrderInfo;
    private ArrayList<PickingOrderInfoBean.DataBean.StockListAppBean> pickingList;
    private ListView picking_List;
    private ImageView ib_picking_back;
    private ImageView picking_choose;
    private DrawerLayout drawerLayout;
    private GridView rightMenuView;
    private ArrayList<OnlySchoolBean.DataBean.RowsBean> gv_list;
    private TextView pickingReset;
    private TextView pickingComplate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);
        picking_dep_brief_name = (TextView) findViewById(R.id.tv_picking_dep_brief_name);
        picking_create_date = (TextView) findViewById(R.id.tv_picking_create_date);
        picking_make_date = (TextView) findViewById(R.id.tv_picking_make_date);
//        picking_total_amount = (TextView) findViewById(R.id.tv_picking_total_amount);
        picking_List = (ListView) findViewById(R.id.lv_pickingList);

        ib_picking_back = (ImageView) findViewById(R.id.ib_back_picking_menu);
        ib_picking_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PickingActivity.this, HomeActivity.class));
                finish();
            }
        });

        pickingReset = (TextView) findViewById(R.id.tv_reset);
        pickingComplate = (TextView) findViewById(R.id.tv_complate);

        pickingReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PickingActivity.this);
                builder.setMessage("请重新筛选");
                builder.create().show();
            }
        });
        pickingComplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PickingActivity.this);
                builder.setMessage("筛选完成");
                builder.create().show();

            }
        });



        picking_choose = (ImageView) findViewById(R.id.ib_icon_picking_choose);

        picking_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDrawerLayout();
                toggleRightSliding();
            }
        });
        inntData();
        initSchoolData();

        rightMenuView = (GridView) findViewById(R.id.gv_right_menu);
        gv_list = new ArrayList<>();

    }

    private void initSchoolData() {
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());

        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_VIEW_BUY, params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();

                        OnlySchoolBean onlySchoolInfo= gson.fromJson(result, OnlySchoolBean.class);

                        System.out.println("hhh:"+result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData().getRows());

                        if (gv_list!=null){

                            rightMenuView.setAdapter(new PickingRightAdapter(gv_list,PickingActivity.this));
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(),"获取数据失败",Toast.LENGTH_SHORT).show();

                    }
                });


    }


    private void inntData() {
        getDataFromServer();
    }

    public void getDataFromServer() {


        HttpUtils hp = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("id",2+"");
        params.addBodyParameter("from_app","1");
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        hp.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_DETAIL, params, new RequestCallBack<String>() {


            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {

                String result = responseInfo.result;
                System.out.println("mmmm result:"+result);
//                System.out.println("mmmm url:"+GlobalContants.URL_BUY_ORDER_DETAIL);
                Gson gson = new Gson();

//                pickingInfo = gson.fromJson(result, PickingOrderInfoBean.class);
                 pickingOrderInfo = gson.fromJson(result, PickingOrderInfoBean.class);


                picking_dep_brief_name.setText(pickingOrderInfo.getData().getOrder_info().getDep_brief_name());
                picking_create_date.setText(pickingOrderInfo.getData().getOrder_info().getCreate_date());
                picking_make_date.setText(pickingOrderInfo.getData().getOrder_info().getPlan_date());
//                picking_total_amount.setText(pickingOrderInfo.getData().getOrder_info().getTotal_amount());


                pickingList = new ArrayList<>();
                pickingList.clear();
                pickingList.addAll(pickingOrderInfo.getData().getStock_list_app());

                PickingAdapter   pickingAdapter = new PickingAdapter(pickingList,PickingActivity.this);
                picking_List.setAdapter(pickingAdapter);


            }

            @Override
            public void onFailure(HttpException error, String msg) {
                Toast.makeText(BaseApplication.getContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });

    }
    private void initDrawerLayout() {

        drawerLayout = (DrawerLayout) super.findViewById(R.id.drawer_layout);

    }

    private void toggleRightSliding() {
        if (drawerLayout.isDrawerOpen(Gravity.END)) {
            drawerLayout.closeDrawer(Gravity.END);
        } else {
            drawerLayout.openDrawer(Gravity.END);
        }
    }

}
