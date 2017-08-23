package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.MyAdapter;
import com.acuit.jointdistribution.Supplier.Domain.OrderList_Purchase;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;


/**
 * 接单界面
 */
public class ReceivedActivity extends AppCompatActivity {

    private ArrayList<OrderList_Purchase> orderList;

    private ImageButton ib_back_menu;
    private ImageButton ib_choose;
    private ListView lv_list;
    private OrderList_Purchase orderListPurchaseMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        ib_choose = (ImageButton) findViewById(R.id.ib_choose);

        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);

        lv_list = (ListView) findViewById(R.id.lv);

        orderList = new ArrayList<OrderList_Purchase>();
        lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String userId = orderList.get(i).getData().getUser_info().getUserid();
                Intent intent = new Intent(ReceivedActivity.this, MenuActivity.class);
                intent.putExtra("userId", userId);
                startActivity(intent);

            }
        });
        initData();

    }

    private void initData() {
        getDataFromServer();
    }

    private void getDataFromServer() {
        HttpUtils http = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token","");
        params.addBodyParameter("start_date","");
        params.addBodyParameter("end_date","");
        params.addBodyParameter("status","");
        params.addBodyParameter("rows","");
        params.addBodyParameter("page","");
        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list",

                new RequestCallBack<String>() {


                    private MyAdapter myAdapter;
                    private TextView tv;

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(getApplicationContext(), "呵呵");
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        ProcessData(result);
                    }

                    private void ProcessData(String result) {
                        Gson gson = new Gson();
                        orderListPurchaseMenu = gson.fromJson(result, OrderList_Purchase.class);
                        String menuList = orderListPurchaseMenu.getData().getUser_info().getMobile_interface().get_$1856();
                        if (lv_list == null) {
                            tv = new TextView(getApplicationContext());
                            tv.setText("暂时无订单");
                            tv.setTextSize(44);
                            tv.setTextColor(Color.GREEN);
                            lv_list.setEmptyView(tv);

                        } else {
                            myAdapter = new MyAdapter(orderList);
                            lv_list.setAdapter(myAdapter);

                        }
                    }


                });

    }

}