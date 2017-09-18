package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
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
import com.acuit.jointdistribution.Supplier.Domain.AlterOrderBean;
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

import static java.lang.String.valueOf;

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
    private DrawerLayout mDrawerLayout = null;
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


        //筛选————侧边栏

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        purchaseChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO  使用SlidingMenu来实现，弹出一个弹窗
                mDrawerLayout.openDrawer(Gravity.RIGHT);

            }
        });
        mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {

            @Override
            public void onDrawerStateChanged(int arg0) {
                Log.i("drawer", "drawer的状态：" + arg0);
            }


            @Override
            public void onDrawerSlide(View arg0, float arg1) {
                Log.i("drawer", arg1 + "");
            }


            @Override
            public void onDrawerOpened(View arg0) {
                Log.i("drawer", "抽屉被完全打开了！");
            }


            @Override
            public void onDrawerClosed(View arg0) {
                Log.i("drawer", "抽屉被完全关闭了！");
            }
        });
//解决穿透问题
        mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                drawerView.setClickable(true);
            }
            @Override
            public void onDrawerClosed(View drawerView) {
            }
            @Override
            public void onDrawerStateChanged(int newState) {
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


        initData();
        initView();


    }


    private void initView() {
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
//                    selectedOrders.clear();
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
                calculate();
            }
        });
    }


    public void selectedOrder(int position) {
        selectedOrders.add(position + "");
        calculate();
        if (selectedOrders.size() == purchaseList.size()) {
            purchaseSelectAll.setChecked(true);
        }
    }

    public void unselectedOrder(int position) {
        System.out.println("aaa unselected:" + position + "  seletctedOrders.size():" + selectedOrders.size());
        if (selectedOrders.size() != 0) {
            selectedOrders.remove(selectedOrders.indexOf(position + ""));
            calculate();
            purchaseSelectAll.setChecked(false);
        }

    }

    private void calculate() {

       float purchase_Count = 0;

        if (selectedOrders.size() == 0) {
            for (int i = 0; i < purchaseList.size(); i++) {
                purchase_Count = purchase_Count +Float.valueOf(valueOf(purchaseList.get(i)));
            }
        } else {
            for (String position : selectedOrders) {
                purchase_Count = purchase_Count +Float.valueOf(String.valueOf(purchaseList.get(Integer.parseInt(position))));
//                totalMoney = totalMoney + Float.valueOf(purchaseList.get(Integer.parseInt(position)).getTotal_money());
            }
        }

//        purchaseCount.setText(purchaseCount);

        purchaseCount.setText((int) purchase_Count);
//        tvTotalAmount.setText(totalAmount + "");

    }
}