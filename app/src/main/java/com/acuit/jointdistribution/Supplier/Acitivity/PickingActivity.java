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
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.PickingAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.PickingAreaAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.PickingRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.AeraBean;
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
    private TextView pickingArea;
    private AeraBean areaInfo;
    private GridView area;
    private TextView pichingPoint;
    private ArrayList<AeraBean.DataBean> areaList;
    private ArrayList<AeraBean.DataBean> pointList;
    private TextView total_amount;
    private TextView pickingPoint1;
    private TextView pickingPoint;
    private ArrayList<AeraBean.DataBean> areaList1;
    private GridView gv_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);
        picking_dep_brief_name = (TextView) findViewById(R.id.tv_picking_dep_brief_name);
        picking_create_date = (TextView) findViewById(R.id.tv_picking_create_date);
        picking_make_date = (TextView) findViewById(R.id.tv_picking_make_date);
        total_amount = (TextView) findViewById(R.id.tv_picking_total_amount);
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

        //重置
        pickingReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                pickingArea.setVisibility(View.GONE);
//                areaList.clear();
//                pickingPoint.setVisibility(View.GONE);
//                pointList.clear();

                AlertDialog.Builder builder = new AlertDialog.Builder(PickingActivity.this);
                builder.setMessage("请重新筛选");
                builder.create().show();
            }
        });
        //完成
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
        initData();
        initSchoolData();

        rightMenuView = (GridView) findViewById(R.id.gv_right_menu);
        gv_list = new ArrayList<>();

    }

    private void initSchoolData() {
        HttpUtils utils = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());

        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_VIEW_BUY, params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();

                        OnlySchoolBean onlySchoolInfo = gson.fromJson(result, OnlySchoolBean.class);

                        System.out.println("hhh:"+result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData().getRows());

                        if (gv_list != null) {

                            PickingRightAdapter pickingRightAdapter = new PickingRightAdapter(gv_list, PickingActivity.this);
                            rightMenuView.setAdapter(pickingRightAdapter);
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();

                    }
                });
        pickingArea = (TextView) findViewById(R.id.tv_picking_area);
        pickingPoint = (TextView) findViewById(R.id.tv_picking_point);
        pickingPoint.setVisibility(View.GONE);
        pickingArea.setVisibility(View.GONE);


        if (rightMenuView != null) {

            rightMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    pickingArea.setVisibility(View.VISIBLE);

                    String area_id = gv_list.get(position).getId();

                    HttpUtils hpp = new HttpUtils();
                    RequestParams params1 = new RequestParams();
                    params1.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
                    params1.addBodyParameter("dep_class", 3 + "");
                    params1.addBodyParameter("com_id", area_id);
                    hpp.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_GET_ALL_DEP,
                            params1, new RequestCallBack<String>() {
                                @Override
                                public void onSuccess(ResponseInfo<String> responseInfo) {

                                    String result = responseInfo.result;

                                    System.out.println("kkk:" + result);
                                    Gson gson = new Gson();

                                    AeraBean aeraBean = gson.fromJson(result, AeraBean.class);

                                    areaList1 = new ArrayList<>();

                                    areaList1.clear();
                                    areaList1.addAll(aeraBean.getData());


                                    gv_area = (GridView) findViewById(R.id.gv_area);
                                    gv_area.setAdapter(new PickingAreaAdapter(areaList1, PickingActivity.this));


                                }

                                @Override
                                public void onFailure(HttpException error, String msg) {


                                }
                            });

                }
            });


        }

//        pickingArea = (TextView) findViewById(R.id.tv_picking_area);
//        pickingPoint = (TextView) findViewById(R.id.tv_picking_point);

//        pickingArea.setVisibility(View.GONE);
//        pickingPoint.setVisibility(View.GONE);

//        if (rightMenuView != null) {
//            rightMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                    pickingArea.setVisibility(View.VISIBLE);
//
//
//                    String id_area = gv_list.get(position).getId();
//
//                    HttpUtils hu = new HttpUtils();
//                    RequestParams params1 = new RequestParams();
//                    params1.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());
//                    params1.addBodyParameter("dep_class", 3 + "");
//                    params1.addBodyParameter("com_id", id_area);
//                    hu.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_GET_ALL_DEP, params1,
//                            new RequestCallBack<String>() {
//
//
//                                @Override
//                                public void onSuccess(ResponseInfo<String> responseInfo) {
//                                    String result = responseInfo.result;
//
//
//                                    System.out.println("hhh123:"+result);
//
//                                    Gson gson = new Gson();
//
//                                    areaInfo = gson.fromJson(result, AeraBean.class);
////                                    System.out.println("aaa  areaInfo:" + areaInfo);
//
//                                    areaList = new ArrayList<>();
//
//                                    areaList.clear();
//
//                                    areaList.addAll(areaInfo.getData());
//
//                                    area = (GridView) findViewById(R.id.gv_area);
//
//                                    PickingAreaAdapter areaAdapter = new PickingAreaAdapter(areaList, PickingActivity.this);
//                                    area.setAdapter(areaAdapter);
//
//
//                                }
//
//                                @Override
//                                public void onFailure(HttpException error, String msg) {
//                                    Toast.makeText(BaseApplication.getContext(), "暂时无数据", Toast.LENGTH_SHORT).show();
//
//                                }
//                            });

        //点击区域获取配送点
//                    if (area!=null){
//                        area.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                            @Override
//                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                                pichingPoint1.setVisibility(View.VISIBLE);
//
//                                String lk_value = areaList.get(position).getLk_value();
//
//
//                                HttpUtils http = new HttpUtils();
//
//                                RequestParams params2 = new RequestParams();
//                                params2.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());
//                                params2.addBodyParameter("dep_parent",lk_value);
//                                http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_GET_ALL_DEP, params2,
//                                        new RequestCallBack<String>() {
//                                            @Override
//                                            public void onSuccess(ResponseInfo<String> responseInfo) {
//
//                                                String result = responseInfo.result;
//                                                Gson gson = new Gson();
//                                                AeraBean pointBean = gson.fromJson(result, AeraBean.class);
//
//
//                                                pointList = new ArrayList<>();
//
//                                                pointList.clear();
//
//                                                pointList.addAll(pointBean.getData());
//
//                                                GridView pointView = (GridView) findViewById(R.id.gv_point);
//                                                PickingPointAdapter pointAdapter = new PickingPointAdapter(pointList,PickingActivity.this);
//                                                pointView.setAdapter(pointAdapter);
//
//
//                                            }
//
//                                            @Override
//                                            public void onFailure(HttpException error, String msg) {
//
//                                                Toast.makeText(BaseApplication.getContext(),"网络加载失败",Toast.LENGTH_SHORT).show();
//                                            }
//                                        });
//
//
//                            }
//                        });
//
//                    }


    }


//            });
//
//        }

//    }


    private void initData() {
        getDataFromServer();
    }


    public void getDataFromServer() {


        HttpUtils hp = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("id", 2 + "");
        params.addBodyParameter("from_app", "1");
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        hp.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_DETAIL, params, new RequestCallBack<String>() {


            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {

                String result = responseInfo.result;
//                System.out.println("mmmm result:"+result);
//                System.out.println("mmmm url:"+GlobalContants.URL_BUY_ORDER_DETAIL);
                Gson gson = new Gson();

//                pickingInfo = gson.fromJson(result, PickingOrderInfoBean.class);
                pickingOrderInfo = gson.fromJson(result, PickingOrderInfoBean.class);


                picking_dep_brief_name.setText(pickingOrderInfo.getData().getOrder_info().getDep_brief_name());
                picking_create_date.setText(pickingOrderInfo.getData().getOrder_info().getCreate_date());
                picking_make_date.setText(pickingOrderInfo.getData().getOrder_info().getPlan_date());
//                picking_total_amount.setText(pickingOrderInfo.getData().getOrder_info().getTotal_amount());

                total_amount.setText(pickingOrderInfo.getData().getOrder_info().getTotal_amount() + "kg");

                pickingList = new ArrayList<>();
                pickingList.clear();
                pickingList.addAll(pickingOrderInfo.getData().getStock_list_app());

                PickingAdapter pickingAdapter = new PickingAdapter(pickingList, PickingActivity.this);
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
