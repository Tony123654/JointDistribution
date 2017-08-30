package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.MyAdapter;
import com.acuit.jointdistribution.Supplier.Bean.impl.HomePager;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderBean;
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

import static android.R.attr.data;

/**
 * 接单界面
 */
public class ReceivedActivity extends AppCompatActivity {

    private int page = 1;
    private int rows = 0;
    private ArrayList<BuyOrderBean.DataBean.RowsBean> mList;

    private ImageButton ib_back_menu;
    private ImageButton ib_choose;
    private ListView listView;
    private BuyOrderBean buyOrderBean;
    private MyAdapter mAdapter;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);

        ib_choose = (ImageButton) findViewById(R.id.ib_choose);

        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);
        ib_back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(ReceivedActivity.this,HomePager.class));
            }
        });

        mList = new ArrayList<>();

        listView = (ListView) findViewById(R.id.lv);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String listId = mList.get(position).getId();
                Intent intent = new Intent(ReceivedActivity.this, MenuInfoActivity.class);
                intent.putExtra("listId", listId);
                startActivity(intent);

            }
        });

        initData();
        System.out.println("Data:"+data);

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
        params.addBodyParameter("page", page + "");
        params.addBodyParameter("rows", "40");

        http.send(HttpRequest.HttpMethod.POST, "http://192.168.2.241/admin.php?c=Minterface&a=buy_order_list", params,

                new RequestCallBack<String>() {

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(getApplicationContext(), msg);
                    }

                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        String result = responseInfo.result;
                        System.out.println("请求结果是："+result);

                        ProcessData(result);
                    }

                    //解析数据
                    private void ProcessData(String result) {

                        Gson gson = new Gson();
                        buyOrderBean = gson.fromJson(result, BuyOrderBean.class);
                         mList.clear();
                        mList.addAll(buyOrderBean.getData().getRows());
                        listView.setAdapter(new MyAdapter(mList));

                        }




                });

    }

}