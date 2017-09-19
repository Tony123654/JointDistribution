package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
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
import com.acuit.jointdistribution.Supplier.Adapter.SendAdapter;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        ib_back_menu = (ImageView) findViewById(R.id.ib_back_send_menu);
        ib_choose = (ImageView) findViewById(R.id.ib_send_choose);
        btn_send = (Button) findViewById(R.id.btn_send);
        singleCount = (TextView) findViewById(R.id.tv_single_count);
        totalAmount = (TextView) findViewById(R.id.tv_total_amount);
        listView = (ListView) findViewById(R.id.list_view);
        sendSelectAll = (RadioButton) findViewById(R.id.sa_sb_selectAll);



        //底部接单按钮
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(SendActivity.this);
                builder.setMessage("您有N(订单数)条订单发货成功！");
                builder.create();
                builder.show();


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







        sendList = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listId = sendList.get(position).getId();
                Intent intent = new Intent(SendActivity.this, SendInfoActivity.class);
                intent.putExtra("listId", listId);
                startActivity(intent);

            }
        });

        ib_back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendActivity.this, HomeActivity.class));
                finish();
            }
        });

        HttpUtils utils = getHttpUtils();

        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("from_app","1");
        params.addBodyParameter("start_date", (new Date(0)).getTime() / 1000 + "");
        params.addBodyParameter("end_date", System.currentTimeMillis() / 1000 + "");
        params.addBodyParameter("page",  "1");
        params.addBodyParameter("rows", "40");
        params.addBodyParameter("status","2");

        utils.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_LIST,
                params, new RequestCallBack<String>() {



                    @Override
                    public void onFailure(HttpException error, String msg) {
                       Toast.makeText(BaseApplication.getContext(),"访问失败",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        System.out.println("结果是：" + result);
                        Gson gson = new Gson();
                        listInfo = gson.fromJson(result, SendOrderBean.class);

                        sendList.clear();
                        sendList.addAll(listInfo.getData().getRows());
                        sendAdapter = new SendAdapter(sendList,SendActivity.this,selectAlls);
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
