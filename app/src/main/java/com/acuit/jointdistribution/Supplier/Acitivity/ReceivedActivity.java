package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
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
import com.acuit.jointdistribution.Supplier.Adapter.ChooseAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.MyAdapter;
import com.acuit.jointdistribution.Supplier.Domain.GetSchoolCountBean;
import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;
import com.acuit.jointdistribution.Supplier.Utils.PrefUtils;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
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
    private ArrayList<GetSchoolCountBean.DataBean.RowsBean> chooseList;
    private AlertDialog dialog;
    private RadioButton selectAllButton;
    private ImageView ib_back_home;
    private ImageView ib_receive_choose;


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

        //全选
//        radioButtom.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                calculate();
//
//                System.out.println("aaa activity.flag_selectAll:" + isChecked);
//                if (isChecked) {
//                    selectAll.add(mList.size());
//                } else {
//                    selectAll.clear();
//                }
//                mAdapter.notifyDataSetChanged();
//
//
//            }
//        });


        final GlobalValue globalValue = new GlobalValue();
        selectAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isCheck = globalValue.isCheck();
                if (isCheck) {
                    if (v == selectAllButton) selectAllButton.setChecked(false);
                    selectAll.clear();
//                    selectedOrders.clear();
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

            private AlertDialog.Builder builder;

            @Override
            public void onClick(View v) {
                showDialog();
            }

            private void showDialog() {

                builder = new AlertDialog.Builder(ReceivedActivity.this);


                View inflate = View.inflate(BaseApplication.getContext(), R.layout.grid_school_list, null);

                TextView finish = (TextView) inflate.findViewById(R.id.tv_finish);
                TextView reset = (TextView) inflate.findViewById(R.id.tv_reset);

                lv_list = (ListView) inflate.findViewById(R.id.lv_list);


                builder.setView(inflate);

                dialog = builder.create();

                //设置大小
                WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
                layoutParams.width = 600;
                layoutParams.height = 1000;
                dialog.getWindow().setAttributes(layoutParams);


                //设置位置

                layoutParams.x = -320;//设置x坐标
                layoutParams.y = -480;//设置y坐标
                Window window = dialog.getWindow();
                window.setAttributes(layoutParams);
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();

                chooseList = new ArrayList<>();

//                lv_list.setAdapter(new ChooseAdapter());

                HttpUtils utils = new HttpUtils();
                utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_VIEW_BUY, new RequestCallBack<String>() {


                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        GetSchoolCountBean countBean = gson.fromJson(result, GetSchoolCountBean.class);
                        chooseList.clear();
                        chooseList.addAll(countBean.getData().getRows());
                        if (chooseList.size() == 0) {
                            //暂无订单
                        } else {
                            ChooseAdapter chooseAdapter = new ChooseAdapter(chooseList, ReceivedActivity.this);
                            lv_list.setAdapter(chooseAdapter);
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(BaseApplication.getContext(), msg);
                    }
                });
//重置


//                reset.setOnClickListener(new View.OnClickListener() {
//
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });
                //完成

//                complate.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(BaseApplication.getContext(),"接单成功",Toast.LENGTH_SHORT).show();
//                       dialog.dismiss();
//                    }
//                });

                //访问网络获取学校数据

            }

        });


        //返回
        ib_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReceivedActivity.this, HomeActivity.class));
            }
        });

        listView = (ListView) findViewById(R.id.lv_receive_view);
        mList = new ArrayList<>();

        initData();


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
                            MyAdapter mAdapter = new MyAdapter(mList, ReceivedActivity.this);
                            listView.setAdapter(mAdapter);
                        }


//                        tvTotalAmount.setText(order.getData().getTotal_amount());
//                        tvTotalMoney.setText(order.getData().getTotal_money());

                    }


                });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


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
        selectedOrders.remove(selectedOrders.indexOf(position + ""));
        calculate();
        selectAllButton.setChecked(false);
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