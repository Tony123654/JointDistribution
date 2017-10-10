package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
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
import com.acuit.jointdistribution.Storeman.Bean.StoreInListBySupplierBean;
import com.acuit.jointdistribution.Supplier.Adapter.SendAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.SendAreaAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.SendPointAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.SendRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.AeraBean;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
import com.acuit.jointdistribution.Supplier.Domain.StoreInfoListBean;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;
import java.util.Date;

import static com.acuit.jointdistribution.Common.Global.GlobalContants.URL_STORE_IN_LIST;
import static com.acuit.jointdistribution.Supplier.Utils.MyHttpUtils.getHttpUtils;

/**
 * 发货单
 */
public class SendActivity extends BaseActivity {

    private ImageView ib_back_menu;
    private ImageView ib_choose;
    private Button btn_send;
    private TextView singleCount;
    private TextView totalAmount;
    private ListView listView;
    private int page;
    private AeraBean areaInfo;
    private ArrayList<AeraBean.DataBean> areaList;
    private ArrayList<AeraBean.DataBean> pointList;
    private ArrayList<StoreInfoListBean.DataBean.StoreInListBean> sendList;
    private ArrayList<String> selectedItemOrders = new ArrayList<>();
    private ArrayList<Integer> selectAlls = new ArrayList<>();
    private RadioButton sendSelectAll;
    private SendAdapter sendAdapter;
    private DrawerLayout drawerLayout;
    private GridView rightMenuView;
    private ArrayList<OnlySchoolBean.DataBean.RowsBean> gv_list;
    private StoreInListBySupplierBean storeInList;
    private StoreInfoListBean storeInfoListBean;
    private TextView pickingArea;
    private TextView pickingPoint;
    private GridView area;
    private TextView pichingPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        ib_back_menu = (ImageView) findViewById(R.id.ib_back_send_menu);
        ib_choose = (ImageView) findViewById(R.id.ib_send_choose);
        totalAmount = (TextView) findViewById(R.id.tv_total_amount);
        listView = (ListView) findViewById(R.id.list_view);

        TextView reset = (TextView) findViewById(R.id.tv_reset);
        TextView complate = (TextView) findViewById(R.id.tv_complate);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SendActivity.this);
                builder.setMessage("请重新选择");
                builder.create().show();
            }
        });

        complate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SendActivity.this);
                builder.setMessage("筛选完成");
                builder.create().show();
            }
        });


        //筛选
        ib_choose.setOnClickListener(new View.OnClickListener() {
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

        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_VIEW_BUY, params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        Gson gson = new Gson();
                        OnlySchoolBean onlySchoolInfo = gson.fromJson(result, OnlySchoolBean.class);

//                        System.out.println("hhh:" + result);
                        gv_list.clear();
                        gv_list.addAll(onlySchoolInfo.getData().getRows());

                        if (gv_list != null) {

                            rightMenuView.setAdapter(new SendRightAdapter(gv_list, SendActivity.this));
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();

                    }
                });


        pickingArea = (TextView) findViewById(R.id.tv_picking_area);
        pickingPoint = (TextView) findViewById(R.id.tv_picking_point);
        pickingArea.setVisibility(View.GONE);
        pickingPoint.setVisibility(View.GONE);


        if (rightMenuView != null) {
            rightMenuView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override

                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    pickingArea.setVisibility(View.VISIBLE);


                    String id_area = gv_list.get(position).getId();

                    HttpUtils hu = new HttpUtils();
                    RequestParams params1 = new RequestParams();
                    params1.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());
                    params1.addBodyParameter("dep_class", 3 + "");
                    params1.addBodyParameter("com_id", id_area);
                    hu.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_GET_ALL_DEP, params1,
                            new RequestCallBack<String>() {


                                @Override
                                public void onSuccess(ResponseInfo<String> responseInfo) {
                                    String result = responseInfo.result;

                                    System.out.println("ppp"+result);


                                    Gson gson = new Gson();

                                    areaInfo = gson.fromJson(result, AeraBean.class);
                                    System.out.println("aaa  areaInfo:" + areaInfo);

                                    areaList = new ArrayList<>();

                                    areaList.clear();

                                    areaList.addAll(areaInfo.getData());

                                    area = (GridView) findViewById(R.id.gv_area);

                                    SendAreaAdapter areaAdapter = new SendAreaAdapter(areaList, SendActivity.this);
                                    area.setAdapter(areaAdapter);


                                }

                                @Override
                                public void onFailure(HttpException error, String msg) {
                                    Toast.makeText(BaseApplication.getContext(), "暂时无数据", Toast.LENGTH_SHORT).show();

                                }
                            });

                    //点击区域获取配送点
                    if (area!=null){
                        area.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                pichingPoint.setVisibility(View.VISIBLE);

                                String lk_value = areaList.get(position).getLk_value();


                                HttpUtils http = new HttpUtils();

                                RequestParams params2 = new RequestParams();
                                params2.addBodyParameter("token",BaseApplication.getLoginBean().getData().getToken());
                                params2.addBodyParameter("dep_parent",lk_value);
                                http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_GET_ALL_DEP, params2,
                                        new RequestCallBack<String>() {
                                            @Override
                                            public void onSuccess(ResponseInfo<String> responseInfo) {

                                                String result = responseInfo.result;
                                                Gson gson = new Gson();
                                                AeraBean pointBean = gson.fromJson(result, AeraBean.class);


                                                pointList = new ArrayList<>();

                                                pointList.clear();

                                                pointList.addAll(pointBean.getData());

                                                GridView pointView = (GridView) findViewById(R.id.gv_point);
                                                SendPointAdapter pointAdapter = new SendPointAdapter(pointList,SendActivity.this);
                                                pointView.setAdapter(pointAdapter);


                                            }

                                            @Override
                                            public void onFailure(HttpException error, String msg) {

                                                Toast.makeText(BaseApplication.getContext(),"网络加载失败",Toast.LENGTH_SHORT).show();
                                            }
                                        });


                            }
                        });

                    }



                }


            });

        }



        sendList = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listId = sendList.get(position).getId();
                Intent intent = new Intent(SendActivity.this, SendInfoActivity.class);
                intent.putExtra("listId", listId);
                startActivity(intent);
//                finish();
            }
        });


        ib_back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendActivity.this, HomeActivity.class));
                finish();
            }
        });

        utils = getHttpUtils();

        params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("from_app", "1");
        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
        params.addBodyParameter("end_date", System.currentTimeMillis() / 1000 + "");
        params.addBodyParameter("page", "1");
        params.addBodyParameter("rows", "40");
        params.addBodyParameter("status", "2");

        utils.send(HttpRequest.HttpMethod.POST, URL_STORE_IN_LIST,
                params, new RequestCallBack<String>() {


                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "访问失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        System.out.println("结果是：" + result);
                        Gson gson = new Gson();
                        storeInfoListBean = gson.fromJson(result, StoreInfoListBean.class);


                        System.out.println("ooo:"+storeInList);
                        sendList.clear();
                        sendList.addAll(storeInfoListBean.getData().getStore_in_list());
                        sendAdapter = new SendAdapter(sendList, SendActivity.this, selectAlls);
                        listView.setAdapter(sendAdapter);


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
