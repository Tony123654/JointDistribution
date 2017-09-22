package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.AlterAdapter;
import com.acuit.jointdistribution.Supplier.Domain.AlterOrderInfoBean;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;

public class PurchaseChangedInfoActivity extends AppCompatActivity {

    private TextView alterCode;
    private TextView alterPlanDate;
    private TextView alterCreateDate;
    private TextView alterDepRootName;
    private TextView totalAmount;
    private ListView alterListView;
    private ArrayList alterList;
    private AlterOrderInfoBean alterOrderInfo;
    private TextView purchaseConfiem;
    private ImageView alterInfoMore;
    private ImageView backPurchase;

//    private TextView alter_s_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_changed_info);


        alterCode = (TextView) findViewById(R.id.tv_alter_code);
        alterPlanDate = (TextView) findViewById(R.id.tv_alter_plan_date);
        alterCreateDate = (TextView) findViewById(R.id.tv_alter_create_date);
        alterDepRootName = (TextView) findViewById(R.id.tv_alter_dep_root_name);
        totalAmount = (TextView) findViewById(R.id.tv_alter_total_amount);
        alterListView = (ListView) findViewById(R.id.lv_alter_list_view);

        alterInfoMore = (ImageView) findViewById(R.id.ib_alter_info_more);

        backPurchase = (ImageView) findViewById(R.id.ib_back_alter_ui);

        backPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PurchaseChangedInfoActivity.this,PurchaseChangedActivity.class));
                finish();
            }
        });
        //更多信息

        alterInfoMore.setOnClickListener(new View.OnClickListener() {

            private AlertDialog dialog;

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedInfoActivity.this);
                View inflate = View.inflate(BaseApplication.getContext(), R.layout.more_item, null);
                TextView message = (TextView) inflate.findViewById(R.id.tv_message);
                TextView retrospect = (TextView) inflate.findViewById(R.id.tv_retrospect);
                TextView back_first = (TextView) inflate.findViewById(R.id.tv_back_first);

                //返回消息界面
                message.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(BaseApplication.getContext(),"消息界面后续会有",Toast.LENGTH_SHORT).show();
                    }
                });
                //返回上一级
                back_first.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(PurchaseChangedInfoActivity.this,HomeActivity.class));
                        finish();
                    }
                });

                //返回反馈界面
                retrospect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(BaseApplication.getContext(),"反馈界面后续会有",Toast.LENGTH_SHORT).show();

                    }
                });

                builder.setView(inflate);
//                dialog = builder.create();

                dialog = builder.create();
                //设置大小
                WindowManager.LayoutParams layoutParams =dialog.getWindow().getAttributes();
                layoutParams.width = 300;
                layoutParams.height = 600;
                dialog.getWindow().setAttributes(layoutParams);


                //设置位置

                layoutParams.x = -150;//设置x坐标
                layoutParams.y = -200;//设置y坐标
                Window window =dialog.getWindow();
                window.setAttributes( layoutParams);
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
        });


        purchaseConfiem = (TextView) findViewById(R.id.tv_purchase_confirm);

        purchaseConfiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedInfoActivity.this);
                builder.setMessage("确认成功");
                builder.create().show();

            }
        });


        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        final String alter_id = intent.getStringExtra("alter_id");

        alterList = new ArrayList<>();

        System.out.println("sss" + alter_id);
        HttpUtils http = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        params.addBodyParameter("alter_id", alter_id);
        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_VIEW_BUY_ORDER_ALTER, params,
                new RequestCallBack<String>() {
                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {

                        String result = responseInfo.result;
                        System.out.println("nnn:" + result);
                        Gson gson = new Gson();

                        alterOrderInfo = gson.fromJson(result, AlterOrderInfoBean.class);
                        alterCode.setText(alterOrderInfo.getData().getAlter_code());
                        alterPlanDate.setText(alterOrderInfo.getData().getPlan_date());
                        alterCreateDate.setText(alterOrderInfo.getData().getCreate_date());
                        alterDepRootName.setText(alterOrderInfo.getData().getDep_root_name());
                        totalAmount.setText(alterOrderInfo.getData().getTotal_amount());


                        alterList.clear();

                        if (alterOrderInfo != null) {

                            alterList.addAll(alterOrderInfo.getData().getList());
                            alterListView.setAdapter(new AlterAdapter(alterList, PurchaseChangedInfoActivity.this));

                        } else {

                            Toast.makeText(BaseApplication.getContext(), "暂无变更单", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(BaseApplication.getContext(), "获取数据异常，请稍后再访问", Toast.LENGTH_SHORT).show();

                    }
                });






    }
}
