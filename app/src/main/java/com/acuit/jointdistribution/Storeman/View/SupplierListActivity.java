package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;

/**
 * 类名: SupplierListActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 14:08 <p>
 * 描述: 供应商对入库单——验收入库  操作界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class SupplierListActivity extends BaseActivity implements View.OnClickListener {

    private RecyclerView rvSupplierList;
    private EditText etSearchBar;
    private Button btnSearchSupplier;
    private ImageView ivBack;
    private ImageView ivScanCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkorder_supplierlist);

        initView();
//        initData();
        initEvent();
    }

    private void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivScanCode = (ImageView) findViewById(R.id.iv_scanCode);
        btnSearchSupplier = (Button) findViewById(R.id.btn_searchSuppliers);
        etSearchBar = (EditText) findViewById(R.id.et_searchBySupplierName);
        rvSupplierList = (RecyclerView) findViewById(R.id.rl_suppliersList);
    }


    private void initEvent() {
        ivBack.setOnClickListener(this);
        ivScanCode.setOnClickListener(this);
        btnSearchSupplier.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_scanCode:
                startActivity(new Intent(SupplierListActivity.this, ScanCodeActivity.class));
                break;
            case R.id.btn_searchSuppliers:

                break;
        }
    }

//    private void initData() {
//
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//
//                Gson gson = new Gson();
//                CodeAndMsg codeAndMsg = gson.fromJson(response, CodeAndMsg.class);
////                    登录成功
//                if (200 == codeAndMsg.getCode()) {
//                    Toast.makeText(SupplierListActivity.this, codeAndMsg.getMsg(), Toast.LENGTH_SHORT).show();
//                    finish();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(SupplierListActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                ArrayMap<String, String> params = new ArrayMap<>();
//
//                params.put("passwtokenord", BaseApplication.getLoginBean().getData().getToken());
//                params.put("name", "");
//
//                return params;
//            }
//        };
//
//
//        stringRequest.setTag("SupplierListActivity");
//        BaseApplication.getRequestQueue().add(stringRequest);
//
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("SupplierListActivity");
    }
}
