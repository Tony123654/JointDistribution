package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
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
import com.acuit.jointdistribution.Common.Utils.Tools;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.AreaAdapter;
//import com.acuit.jointdistribution.Supplier.Adapter.MyAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.ReceiveRightAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.ReceivedInListAdapter;
import com.acuit.jointdistribution.Supplier.Domain.AeraBean;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
import com.acuit.jointdistribution.Supplier.Domain.OrderListBean;
import com.acuit.jointdistribution.Supplier.GlobalInfo.GlobalValue;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 接单界面
 */
public class ReceivedActivity extends BaseActivity implements View.OnClickListener, XRecyclerView.LoadingListener {

    private ArrayList<AeraBean.DataBean> areaList;
    private ListView listView;
    private OrderListBean order;
    //    private MyAdapter mAdapter;
    private TextView tv;
    private TextView tvSelectedCount;
    private TextView tvTotalMoney;
    //    private TextView tvTotalAmount;
    private TextView receiveButtom;
    private TextView reset;
    private int total = -1;
    private int page = 1;
    private ReceivedInListAdapter receivedInListAdapter;

    private AlertDialog.Builder builder;

    private ArrayList<Integer> selectedOrders = new ArrayList<>();
    private ArrayList<Integer> selectAll = new ArrayList<>();
    //    private ArrayList<OnlySchoolBean.DataBean> chooseList;
    private AlertDialog dialog;
    private RadioButton selectAllButton;
    private ImageView ib_back_home;
    private ImageView ib_receive_choose;
    private DrawerLayout drawerLayout;
    private GridView rightMenuView;
    private ArrayList<OnlySchoolBean.DataBean> gv_list;
    private ReceiveRightAdapter receiveRightAdapter;
    private AeraBean areaInfo;
    private TextView pickingArea;
    private GridView area;
    private boolean Flag_LoadMore = false;
    private XRecyclerView xrvReceiveList;
    private List<OrderListBean.DataBean.RowsBean> receiveInList = new ArrayList<OrderListBean.DataBean.RowsBean>();
    private GlobalValue globalValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        tvSelectedCount = (TextView) findViewById(R.id.tv_receive_count);
        tvTotalMoney = (TextView) findViewById(R.id.tv_receive_total_money);
//        tvTotalAmount = (TextView) findViewById(R.id.tv_receive_total_amount);
        selectAllButton = (RadioButton) findViewById(R.id.rb_receive_select_all);
        receiveButtom = (TextView) findViewById(R.id.btn_receive_button);

        ib_back_home = (ImageView) findViewById(R.id.ib_back_receive_menu);

        ib_receive_choose = (ImageView) findViewById(R.id.ib_receive_choose);
//        lv_list = (ListView) findViewById(R.id.lv_receive_view);

        TextView receiveComplate = (TextView) findViewById(R.id.tv_complate);
        TextView receiveReset = (TextView) findViewById(R.id.tv_reset);

        xrvReceiveList = (XRecyclerView) findViewById(R.id.xrv_receiveList);
        TextView emptyText = new TextView(ReceivedActivity.this);
        emptyText.setText("暂无订单");
//        xrvReceiveList.setEmptyView(emptyText);

        initListData();

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

//        initData();
        //底部接单按钮
        receiveButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg;

                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedActivity.this);
                if (selectedOrders.size() < 1) {
                    msg = "没有选择需要接单的订单！";
                } else {
                    msg = "你有" + selectedOrders.size() + "条订单处理完成";
                }
                builder.setMessage(msg);
                builder.create();
                builder.show();

            }
        });

        ib_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(ReceivedActivity.this, HomeActivity.class));
                finish();
            }
        });

        receiveInList = new ArrayList<>();
//全选
        globalValue = new GlobalValue();
        selectAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.println("aaa selectAllButton.setOnClickListener is run");
                boolean isCheck = globalValue.isCheck();
                if (isCheck) {
                    if (v == selectAllButton) selectAllButton.setChecked(false);
                    if (null != receivedInListAdapter) {
                        receivedInListAdapter.disSelectAll();
                    }
                    selectAll.clear();
                    selectedOrders.clear();
                } else {
                    if (v == selectAllButton) selectAllButton.setChecked(true);
                    selectAll.add(receiveInList.size());
                    selectedOrders.clear();
                    for (int i = 0; i < receiveInList.size(); i++) {
                        selectedOrders.add(i);
                    }
                    if (null != receivedInListAdapter) {
                        receivedInListAdapter.selectAll();
                    }

                }
                receivedInListAdapter.notifyDataSetChanged();

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
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());

        utils.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=com_list", params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        OnlySchoolBean onlySchoolInfo = gson.fromJson(result, OnlySchoolBean.class);

//                        System.out.println("hhh:" + result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData());

                        if (gv_list != null)

                            receiveRightAdapter = new ReceiveRightAdapter(gv_list, ReceivedActivity.this);
                        rightMenuView.setAdapter(receiveRightAdapter);


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();

                    }
                });
        //适配结束，点击进行区域选择
        if (rightMenuView != null) {
            rightMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String id_area = gv_list.get(position).getId();
                    HttpUtils hu = new HttpUtils();
                    RequestParams params1 = new RequestParams();
                    params1.addBodyParameter("dep_class", 3 + "");
                    params1.addBodyParameter("com_id", id_area);
                    hu.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=ajax&a=get_all_dep", params1,
                            new RequestCallBack<String>() {


                                @Override
                                public void onSuccess(ResponseInfo<String> responseInfo) {
                                    String result = responseInfo.result;
//                                    System.out.println("hhh:" + result);
                                    Gson gson = new Gson();
                                    areaInfo = gson.fromJson(result, AeraBean.class);

                                    areaList = new ArrayList<>();


                                    areaList.clear();
                                    areaList.addAll(areaInfo.getData());
//                                    pickingArea = (TextView) findViewById(R.id.tv_picking_area);

//                                    pickingArea.setVisibility(View.VISIBLE);
                                    area = (GridView) findViewById(R.id.gv_area);

                                    AreaAdapter areaAdapter = new AreaAdapter(areaList, ReceivedActivity.this);


                                    area.setAdapter(areaAdapter);

                                }

                                @Override
                                public void onFailure(HttpException error, String msg) {

                                }
                            });

                }
            });

        }
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


    private void initListData() {

//        getDataFromServer();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_BUY_ORDER_LIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

//                System.out.println("ttt:" + GlobalContants.URL_BUY_ORDER_LIST);
//                System.out.println("ttt:" + response);

                Gson gson = new Gson();
                OrderListBean orderListBean = gson.fromJson(response, OrderListBean.class);
                if (200 == orderListBean.getCode()) {
//                    total = Integer.parseInt(orderListBean.getData().getTotal());
                    if (!Flag_LoadMore) {
                        receiveInList.clear();
                    }
                    Flag_LoadMore = false;
                    List<OrderListBean.DataBean.RowsBean> store_in_list = orderListBean.getData().getRows();
                    if (null != store_in_list) {
                        receiveInList.addAll(store_in_list);
                    }
                    initAdapter();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (null == error.getMessage()) {
                    Toast.makeText(ReceivedActivity.this, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ReceivedActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("start_date", Tools.getSimpleFormatedTime(new Date(0).getTime() / 1000 + ""));
                params.put("end_date", Tools.getSimpleFormatedTime(System.currentTimeMillis() / 1000 + ""));
                params.put("rows", 10 + "");
                params.put("page", 1 + "");
                params.put("status", "2");
                System.out.println("ttt params:" + params.toString());
                return params;
            }
        };


        stringRequest.setTag("ReceivedActivity");
        BaseApplication.getRequestQueue().add(stringRequest);

    }


//    private void getDataFromServer() {
//
//        HttpUtils http = new HttpUtils();
//
//
//        RequestParams params = new RequestParams();
//        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
//        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
//        params.addBodyParameter("end_date", System.currentTimeMillis() / 1000 + "");
//        params.addBodyParameter("page", "1");
//        params.addBodyParameter("rows", "10");
//        params.addBodyParameter("status", "2");
//
//        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_LIST, params,
////        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list", params,
//
//                new RequestCallBack<String>() {
//
//                    @Override
//                    public void onFailure(HttpException error, String msg) {
//                        Toast.makeText(BaseApplication.getContext(), "网络访问失败", Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onSuccess(ResponseInfo<String> responseInfo) {
//                        String result = responseInfo.result;
//                        System.out.println("qqq:" + result);
//                        //保存数据
//                        PrefUtils.putString(getApplicationContext(), "list", result);
//                        ProcessData(result);
//                    }
//
//                    //解析数据
//                    private void ProcessData(String result) {
//
//                        Gson gson = new Gson();
//                        order = gson.fromJson(result, OrderListBean.class);
//                        receiveInList.clear();
//                        receiveInList.addAll(order.getData().getRows());
////                        receiveInList.addAll(order.getData().getRows());
//                        if (receiveInList.size() == 0) {
//                            //暂无订单
//                        } else {
////                            lv_list.setDividerHeight(20);
//                            mAdapter = new MyAdapter(receiveInList, ReceivedActivity.this, selectAll);
//                            lv_list.setAdapter(mAdapter);
//                        }
//
//
////                        tvTotalAmount.setText(order.getData().getTotal_amount());
////                        tvTotalMoney.setText(order.getData().getTotal_money());
//
//                    }
//
//
//                });
//
//        lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//                String listId = receiveInList.get(position).getId();
//                System.out.println("跳转过去了：" + listId);
//                Intent intent = new Intent(ReceivedActivity.this, ReceivedMenuInfoActivity.class);
//                intent.putExtra("listId", listId);
//                ReceivedActivity.this.startActivity(intent);
////                finish();
//
//            }
//        });
//
////        receiveButtom.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                rb.isChecked();
////            }
////        });


    private void initAdapter() {

        xrvReceiveList.setHasFixedSize(true);
        xrvReceiveList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        if (0 != receiveInList.size()) {

            if (null != receivedInListAdapter) {

                xrvReceiveList.refreshComplete();
                xrvReceiveList.loadMoreComplete();
                receivedInListAdapter.notifyDataSetChanged();

            } else {

                xrvReceiveList.refreshComplete();
                xrvReceiveList.loadMoreComplete();
                receivedInListAdapter = new ReceivedInListAdapter(receiveInList, ReceivedActivity.this);
                xrvReceiveList.setAdapter(receivedInListAdapter);
            }

        } else {
            Toast.makeText(ReceivedActivity.this, "没有数据", Toast.LENGTH_SHORT).show();
        }

        if (total == receiveInList.size()) {
            xrvReceiveList.setLoadingMoreEnabled(false);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        xrvReceiveList.refresh();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("ReceivedActivity");
    }

    @Override
    public void onRefresh() {

        page = 1;
        initListData();
        xrvReceiveList.setLoadingMoreEnabled(true);
    }

    @Override
    public void onLoadMore() {

        page++;
        Flag_LoadMore = true;
        initListData();
    }


//    <______________________________________________________________________>


    public void selectedOrder(int position) {
        selectedOrders.add(position);
        calculate();
        if (selectedOrders.size() == receiveInList.size()) {
            selectAllButton.setChecked(true);
            globalValue.setCheck(true);
        }
    }

    public void unselectedOrder(int position) {
//        System.out.println("aaa unselected:" + position + "  seletctedOrders.size():" + selectedOrders.size());
        if (selectedOrders.size() != 0) {
            selectedOrders.remove(Integer.valueOf(position));

//            System.out.println("qqq:position" + position);
            calculate();
            selectAllButton.setChecked(false);
            globalValue.setCheck(false);
//            selectAll = false;
        }

    }

    private void calculate() {

        float totalMoney = 0;

        if (selectedOrders.size() != 0) {
            System.out.println("aaa selectedOrders:" + selectedOrders.toString());
            for (Integer position : selectedOrders) {

                totalMoney = totalMoney + Float.valueOf(receiveInList.get(position).getTotal_money());
            }
        }

        tvSelectedCount.setText(selectedOrders.size() + "");
        tvTotalMoney.setText(String.format("%.2f", Float.valueOf(totalMoney)));

    }


    @Override
    public void onClick(View v) {


    }
}