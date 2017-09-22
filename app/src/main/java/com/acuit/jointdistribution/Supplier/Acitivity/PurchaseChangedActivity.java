package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.PurchaseAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.PurchaseRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.AlterOrderBean;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseChangedActivity extends BaseActivity {

    private TextView paCount;
    private TextView paSelectAll;
    private TextView paConfirm;
    private ListView paView;
    private ImageView backPurchase;
    private ImageView purchaseChoose;
    private Button purchaseConfirm;
    private RadioButton purchaseSelectAll;
    private TextView purchaseCount;
    private ListView purchaseInfoList;
    private AlterOrderBean alterOrder;
    private PurchaseAdapter purchaseAdapter;
    private ArrayList<AlterOrderBean.DataBean.AlterBean> purchaseList;
    private ArrayList<String> selectedOrders = new ArrayList<>();
    private ArrayList<Integer> selectAll = new ArrayList<>();
    private DrawerLayout drawerLayout;
    private ArrayList<OnlySchoolBean.DataBean> gv_list;
    private GridView rightMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_changed);

        backPurchase = (ImageView) findViewById(R.id.ib_back_purchase);
        purchaseChoose = (ImageView) findViewById(R.id.ib_purchase_choose);
        purchaseConfirm = (Button) findViewById(R.id.btn_purchase_confirm);
        purchaseSelectAll = (RadioButton) findViewById(R.id.rb_purchase_select_all);
        purchaseCount = (TextView) findViewById(R.id.tv_purchase_total);
        purchaseInfoList = (ListView) findViewById(R.id.lv_purchaseInfoList);

        backPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(PurchaseChangedActivity.this, HomeActivity.class));
            }
        });


        TextView complate = (TextView) findViewById(R.id.tv_complate);
        TextView reset = (TextView) findViewById(R.id.tv_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedActivity.this);
                builder.setMessage("请重新筛选");
                builder.create().show();
            }
        });
        complate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedActivity.this);
                builder.setMessage("筛选完成");
                builder.create().show();

            }
        });


        //筛选————侧边栏

//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);


        purchaseChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                initDrawerLayout();
                toggleRightSliding();
            }
        });


        purchaseConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedActivity.this);
                builder.setMessage("变更单已确认");
                builder.create().show();
            }
        });

        purchaseSelectAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO  实现流程同接单雷同
                Toast.makeText(BaseApplication.getContext(), "全选功能", Toast.LENGTH_LONG).show();
            }
        });

        // 订单数  purchaseCount 由选择的变更单来决定

        initDataSchool();
        initData();
        rightMenu = (GridView) findViewById(R.id.gv_right_menu);
        gv_list = new ArrayList<>();


    }

    //学校数据
    private void initDataSchool() {
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());

        utils.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=com_list", params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        OnlySchoolBean onlySchoolInfo = gson.fromJson(result, OnlySchoolBean.class);

                        System.out.println("hhh:" + result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData());

                        if (gv_list != null) {
                            rightMenu.setAdapter(new PurchaseRightAdapter(gv_list, PurchaseChangedActivity.this));
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();

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


    private void initData() {

        HttpUtils httpUtils = new HttpUtils();

        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
        params.addBodyParameter("end_dat_date", System.currentTimeMillis() / 1000 + "");
        params.addBodyParameter("status", "2");

        httpUtils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_ALTER,
                params, new RequestCallBack<String>() {


                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {


                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        alterOrder = gson.fromJson(result, AlterOrderBean.class);
                        purchaseList = new ArrayList<>();
                        purchaseList.clear();
                        purchaseList.addAll(alterOrder.getData().getAlter());
                        if (purchaseList.size() == 0) {
                            Toast.makeText(BaseApplication.getContext(), "obtain the data failure", Toast.LENGTH_SHORT).show();
                        } else {
                            purchaseAdapter = new PurchaseAdapter(purchaseList, PurchaseChangedActivity.this);
                            purchaseInfoList.setAdapter(purchaseAdapter);

                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {

                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();
                    }
                });
        purchaseInfoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String alter_id = purchaseList.get(position).getAlter_id();
                Intent intent = new Intent(PurchaseChangedActivity.this, PurchaseChangedInfoActivity.class);
                intent.putExtra("alter_id", alter_id);
                startActivity(intent);
                finish();


            }
        });

        //全选
        final GlobalValue globalValue = new GlobalValue();
        purchaseSelectAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isCheck = globalValue.isCheck();
                if (isCheck) {
                    if (v == purchaseSelectAll) purchaseSelectAll.setChecked(false);
                    selectAll.clear();
                    selectedOrders.clear();
                } else {
                    if (v == purchaseSelectAll) purchaseSelectAll.setChecked(true);
                    selectAll.add(purchaseList.size());
                    selectedOrders.clear();
                    for (int i = 0; i < purchaseList.size(); i++) {
                        selectedOrders.add(i + "");
                    }

                }
                purchaseAdapter.notifyDataSetChanged();

                globalValue.setCheck(!isCheck);
//                calculate();
            }
        });
    }


    public void selectedOrder(int position) {
        selectedOrders.add(position + "");
//        calculate();
        if (selectedOrders.size() == purchaseList.size()) {
            purchaseSelectAll.setChecked(true);
        }
    }

    public void unselectedOrder(int position) {
        System.out.println("aaa unselected:" + position + "  seletctedOrders.size():" + selectedOrders.size());
        if (selectedOrders.size() != 0) {
            selectedOrders.remove(selectedOrders.indexOf(position + ""));
//            calculate();
            purchaseSelectAll.setChecked(false);
        }

    }

//    private void calculate() {
//
//        float purchase_Count = 0;
//
//        if (selectedOrders.size() == 0) {
//            for (int i = 0; i < purchaseList.size(); i++) {
////                purchase_Count = purchase_Count + Float.valueOf(valueOf(purchaseList.get(i)));
//            }
//        } else {
//            for (String position : selectedOrders) {
////                purchase_Count = purchase_Count + Float.valueOf(String.valueOf(purchaseList.get(Integer.parseInt(position))));
////                totalMoney = totalMoney + Float.valueOf(purchaseList.get(Integer.parseInt(position)).getTotal_money());
//            }
//        }
//
////        purchaseCount.setText(purchaseCount);
//
////        purchaseCount.setText((int) purchase_Count);
////        tvTotalAmount.setText(totalAmount + "");
//
//    }
}