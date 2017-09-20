package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
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
import com.acuit.jointdistribution.Supplier.Adapter.MyAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.ReceiveRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;
import com.acuit.jointdistribution.Supplier.Utils.PrefUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;
import java.util.Date;


/**
 * 接单界面
 */
public class ReceivedActivity extends BaseActivity {

    private ArrayList<OrderListBean.DataBean.RowsBean> mList;


    private ListView listView;
    private OrderListBean order;
    private MyAdapter mAdapter;
    private TextView tv;
    private TextView count;
    private TextView tvTotalMoney;
    private TextView tvTotalAmount;
    private TextView receiveButtom;
    private TextView reset;

    private AlertDialog.Builder builder;

    private ArrayList<String> selectedOrders = new ArrayList<>();
    private ArrayList<Integer> selectAll = new ArrayList<>();
    private ListView lv_list;
    private ArrayList<OnlySchoolBean.DataBean> chooseList;
    private AlertDialog dialog;
    private RadioButton selectAllButton;
    private ImageView ib_back_home;
    private ImageView ib_receive_choose;
    private DrawerLayout drawerLayout;
    private GridView rightMenuView;
    private ArrayList<OnlySchoolBean.DataBean> gv_list;
    private ReceiveRightAdapter receiveRightAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        count = (TextView) findViewById(R.id.tv_receive_count);
        tvTotalMoney = (TextView) findViewById(R.id.tv_receive_total_money);
        tvTotalAmount = (TextView) findViewById(R.id.tv_receive_total_amount);
        selectAllButton = (RadioButton) findViewById(R.id.rb_receive_select_all);
        receiveButtom = (TextView) findViewById(R.id.btn_receive_button);

        ib_back_home = (ImageView) findViewById(R.id.ib_back_receive_menu);

        ib_receive_choose = (ImageView) findViewById(R.id.ib_receive_choose);
         lv_list = (ListView) findViewById(R.id.lv_receive_view);

        TextView receiveComplate = (TextView) findViewById(R.id.tv_complate);
        TextView receiveReset = (TextView) findViewById(R.id.tv_reset);


        receiveReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedActivity.this);
                builder.setMessage("请重新选择条件");
                builder.create().show();
            }
        });
        receiveComplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedActivity.this);
                builder.setMessage("完成订单");
                builder.create().show();

            }
        });

        initData();
        //底部接单按钮
        receiveButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedActivity.this);
                builder.setMessage("你有N条订单处理完成");
                builder.create();
                builder.show();

            }
        });

        ib_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(ReceivedActivity.this, HomeActivity.class));
            }
        });

         mList = new ArrayList<>();
//全选
        final GlobalValue globalValue = new GlobalValue();
        selectAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isCheck = globalValue.isCheck();
                if (isCheck) {
                    if (v == selectAllButton) selectAllButton.setChecked(false);
                    selectAll.clear();
                    selectedOrders.clear();
                } else {
                    if (v == selectAllButton) selectAllButton.setChecked(true);
                    selectAll.add(mList.size());
                    selectedOrders.clear();
                    for (int i = 0; i < mList.size(); i++) {
                        selectedOrders.add(i + "");
                    }

                }
                mAdapter.notifyDataSetChanged();

                globalValue.setCheck(!isCheck);
                calculate();
            }
        });

        //筛选
        ib_receive_choose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                initDrawerLayout();
                toggleRightSliding();
            }


        });

        initSchoolData();

        rightMenuView = (GridView) findViewById(R.id.gv_right_menu);
        gv_list = new ArrayList<>();
    }

    private void initSchoolData() {
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());

        utils.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=com_list", params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        OnlySchoolBean onlySchoolInfo= gson.fromJson(result, OnlySchoolBean.class);

                        System.out.println("hhh:"+result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData());

                        if (gv_list!=null)

                            receiveRightAdapter = new ReceiveRightAdapter(gv_list,ReceivedActivity.this);
                        rightMenuView.setAdapter(receiveRightAdapter);

                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(),"获取数据失败",Toast.LENGTH_SHORT).show();

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

        getDataFromServer();

    }

    private void getDataFromServer() {

        HttpUtils http = new HttpUtils();


        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
        params.addBodyParameter("end_date", System.currentTimeMillis() / 1000 + "");
        params.addBodyParameter("page", "1");
        params.addBodyParameter("rows", "40");
        params.addBodyParameter("status", "2");

        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_LIST, params,
//        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list", params,

                new RequestCallBack<String>() {

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "网络访问失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        //保存数据
                        PrefUtils.putString(getApplicationContext(), "list", result);
                        ProcessData(result);
                    }

                    //解析数据
                    private void ProcessData(String result) {

                        Gson gson = new Gson();
                        order = gson.fromJson(result, OrderListBean.class);
                        mList.clear();
                        mList.addAll(order.getData().getRows());
                        if (mList.size() == 0) {
                            //暂无订单
                        } else {
                             mAdapter = new MyAdapter(mList, ReceivedActivity.this, selectAll);
                            lv_list.setAdapter(mAdapter);
                        }


//                        tvTotalAmount.setText(order.getData().getTotal_amount());
//                        tvTotalMoney.setText(order.getData().getTotal_money());

                    }


                });

        lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String listId = mList.get(position).getId();
                System.out.println("跳转过去了：" + listId);
                Intent intent = new Intent(ReceivedActivity.this, ReceivedMenuInfoActivity.class);
                intent.putExtra("listId", listId);
                ReceivedActivity.this.startActivity(intent);

            }
        });

//        receiveButtom.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                rb.isChecked();
//            }
//        });


    }


    public void selectedOrder(int position) {
        selectedOrders.add(position + "");
        calculate();
        if (selectedOrders.size() == mList.size()) {
            selectAllButton.setChecked(true);
        }
    }

    public void unselectedOrder(int position) {
        System.out.println("aaa unselected:" + position + "  seletctedOrders.size():" + selectedOrders.size());
        if (selectedOrders.size()!=0) {
            selectedOrders.remove(selectedOrders.indexOf(position + ""));
            calculate();
            selectAllButton.setChecked(false);
        }

    }

    private void calculate() {

        float totalAmount = 0;
        float totalMoney = 0;

        if (selectedOrders.size() == 0) {
            for (int i = 0; i < mList.size(); i++) {
                totalAmount = totalAmount + Float.valueOf(mList.get(i).getTotal_amount());
                totalMoney = totalMoney + Float.valueOf(mList.get(i).getTotal_money());
            }
        } else {
            for (String position : selectedOrders) {
                totalAmount = totalAmount + Float.valueOf(mList.get(Integer.parseInt(position)).getTotal_amount());
                totalMoney = totalMoney + Float.valueOf(mList.get(Integer.parseInt(position)).getTotal_money());
            }
        }

        tvTotalMoney.setText(totalMoney + "");
        tvTotalAmount.setText(totalAmount + "");
    }

}