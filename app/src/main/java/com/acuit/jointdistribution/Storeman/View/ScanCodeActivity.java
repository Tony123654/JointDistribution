package com.acuit.jointdistribution.Storeman.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: ScanCodeActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 15:13 <p>
 * 描述: 验收入库————扫码界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ScanCodeActivity extends BaseActivity implements View.OnClickListener {

    private ImageView ivBack;
    private ImageView ivLED;
    private SurfaceView svCammera;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_code);

        initView();
        initData();
        initEvent();

    }

    private void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivLED = (ImageView) findViewById(R.id.iv_LEDlight);
        svCammera = (SurfaceView) findViewById(R.id.sv_cammera);
    }

    private void initData() {


    }

    private void initEvent() {

        ivBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
            break;
            case R.id.iv_LEDlight:

            break;

        }
    }


}
