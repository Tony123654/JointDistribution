package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        ib_back_menu = (ImageView) findViewById(R.id.ib_back_receive_menu);
        ib_choose = (ImageView) findViewById(R.id.ib_choose);
        btn_send = (Button) findViewById(R.id.btn_send);
        singleCount = (TextView) findViewById(R.id.tv_single_count);
        totalAmount = (TextView) findViewById(R.id.tv_total_amount);
        listView = (ListView) findViewById(R.id.list_view);
        sendSelectAll = (RadioButton) findViewById(R.id.sa_sb_selectAll);



        //底部接单按钮
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(SendActivity.this);
//                builder.setMessage("你有N条订单处理完成");
//                builder.create();
//                builder.show();

                AlertDialog.Builder builder = new AlertDialog.Builder(SendActivity.this);
                builder.setMessage("您有N(订单数)条订单发货成功！");
                builder.create();
                builder.show();


            }
        });
        //全选
//        final GlobalValue globalValue = new GlobalValue();
//        sendSelectAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                boolean isCheck = globalValue.isCheck();
//                if (isCheck) {
//                    if (v == sendSelectAll) sendSelectAll.setChecked(false);
//                    selectAlls.clear();
////                    selectedOrders.clear();
//                } else {
//                    if (v == sendSelectAll) sendSelectAll.setChecked(true);
//                    selectAlls.add(selectAlls.size());
//                    selectedItemOrders.clear();
//                    for (int i = 0; i < selectAlls.size(); i++) {
//                        selectedItemOrders.add(i + "");
//                    }
//
//                }
//
//                sendAdapter.notifyDataSetChanged();
//
//                globalValue.setCheck(!isCheck);
//                calculate();
//
//
//            }
//
//        });




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

//                        singleCount.setText(listInfo.getData().getCount());
//                        totalAmount.setText(listInfo.getData().getTotal_amount());

                    }


                });


    }
//    public void selectedOrder(int position) {
//        selectedItemOrders.add(position + "");
//        calculate();
//
//        if (selectedItemOrders.size() == sendList.size()) {
//            sendSelectAll.setChecked(true);
//        }
//    }
//
//    public void unselectedOrder(int position) {
//        System.out.println("aaa unselected:" + position + "  seletctedOrders.size():" + selectedItemOrders.size());
//        selectedItemOrders.remove(selectedItemOrders.indexOf(position + ""));
//        calculate();
//        sendSelectAll.setChecked(false);
//    }
//
//    private void calculate() {
//
//        float singleCount = 0;
//        float  totalAmount = 0;
//
//        if (selectedItemOrders.size() == 0) {
//            for (int i = 0; i < selectAlls.size(); i++) {
//                singleCount = singleCount + Float.valueOf(sendList.get(i).getTotal_money());
//                totalAmount = totalAmount + Float.valueOf(sendList.get(i).getTotal_amount());
//            }
//        } else {
//            for (String position : selectedItemOrders) {
//                totalAmount = totalAmount + Float.valueOf(sendList.get(Integer.parseInt(position)).getTotal_amount());
//                singleCount = singleCount + Float.valueOf(sendList.get(Integer.parseInt(position)).getTotal_money());
//            }
//        }
////
////        singleCount.setText(singleCount + "");
////        totalAmount.setText(totalAmount + "");
//    }

}
