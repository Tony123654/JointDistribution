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
import com.acuit.jointdistribution.Supplier.Domain.OrderList;
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

    private ArrayList<OrderList> mList;

    private ImageButton ib_back_menu;
    private ImageButton ib_choose;
    private ListView listView;
    private OrderList orderList;
    private MyAdapter mAdapter;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);

        ib_choose = (ImageButton) findViewById(R.id.ib_choose);

        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);

        mList = new ArrayList<OrderList>();

        listView = (ListView) findViewById(R.id.lv);
        // 列表信息


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                Intent intent = new Intent(ReceivedActivity.this, MenuActivity.class);

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
        params.addBodyParameter("page", "1");
        params.addBodyParameter("rows", "10");

        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list", params,

                new RequestCallBack<String>() {


                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(getApplicationContext(), msg);
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        System.out.print("返回结果是" + result);
                        ProcessData(result);
                    }

                    //解析数据
                    private void ProcessData(String result) {

                        Gson gson = new Gson();
                        OrderList orderList = gson.fromJson(result, OrderList.class);

                        if (listView == null) {
                            tv = new TextView(getApplicationContext());
                            tv.setText("暂无订单");
                            tv.setTextSize(44);
                            tv.setTextColor(Color.GREEN);
                            listView.setEmptyView(tv);

                        } else {
                            if (null == mList) {
                                System.out.println("aaa :");
                            }
//                            mAdapter = new MyAdapter(mList);

                            listView.setAdapter(new MyAdapter(mList));

                        }
                    }


                });

    }

}