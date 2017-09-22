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
import com.acuit.jointdistribution.Supplier.Adapter.SendAdapter;
import com.acuit.jointdistribution.Supplier.Adapter.SendRightAdapter;
import com.acuit.jointdistribution.Supplier.Domain.OnlySchoolBean;
import com.acuit.jointdistribution.Supplier.Domain.SendOrderBean;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;
import java.util.Date;

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
    private SendOrderBean listInfo;
    private int page;
    private ArrayList<SendOrderBean.DataBean.RowsBean> sendList;
    private ArrayList<String> selectedItemOrders = new ArrayList<>();
    private ArrayList<Integer> selectAlls = new ArrayList<>();
    private RadioButton sendSelectAll;
    private SendAdapter sendAdapter;
    private DrawerLayout drawerLayout;
    private GridView rightMenuView;
    private ArrayList<OnlySchoolBean.DataBean> gv_list;

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

                            rightMenuView.setAdapter(new SendRightAdapter(gv_list, SendActivity.this));
                        }


                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据失败", Toast.LENGTH_SHORT).show();

                    }
                });


        sendList = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listId = sendList.get(position).getId();
                Intent intent = new Intent(SendActivity.this, SendInfoActivity.class);
                intent.putExtra("listId", listId);
                startActivity(intent);
                finish();
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

        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_LIST,
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
                        listInfo = gson.fromJson(result, SendOrderBean.class);

                        sendList.clear();
                        sendList.addAll(listInfo.getData().getRows());
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
