package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;

public class PurchaseChangedActivity extends BaseActivity {

    private ImageView paBack;
    private ImageView paInfo;
    private TextView paCount;
    private TextView paSelectAll;
    private TextView paConfirm;
    private ListView paView;
    private ImageView backPurchase;
    private ImageView purchaseChoose;
    private Button purchaseConfirm;
    private RadioButton purchaseSelectAll;
    private TextView purchaseCount;
    private ListView purchaseInfoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_changed);

        backPurchase = (ImageView) findViewById(R.id.ib_back_purchase);
        purchaseChoose = (ImageView) findViewById(R.id.ib_purchase_choose);
        purchaseConfirm = (Button) findViewById(R.id.btn_purchase_confirm);
        purchaseSelectAll = (RadioButton) findViewById(R.id.rb_purchase_select_all);
        purchaseCount = (TextView) findViewById(R.id.tv_purchase_count);
        purchaseInfoList = (ListView) findViewById(R.id.lv_purchaseInfoList);

        backPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PurchaseChangedActivity.this, HomeActivity.class));
            }
        });



        //筛选————侧边栏
        purchaseChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO  使用SlidingMenu来实现，早市弹出一个弹窗
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedActivity.this);
                builder.setMessage("请继续完成后续任务：");
                builder.create().show();




            }
        });

        purchaseConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PurchaseChangedActivity.this);
                builder.setMessage("变更单已确认");
                builder.create().show();
            }
        });

        purchaseSelectAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO  实现流程同接单雷同
                Toast.makeText(BaseApplication.getContext(),"全选功能",Toast.LENGTH_LONG).show();
            }
        });

        // 订单数  purchaseCount 由选择的变更单来决定

        int purchaseCount=0;



        initData();
        initView();


    }



    private void initView() {
    }

    private void initData() {



    }
}