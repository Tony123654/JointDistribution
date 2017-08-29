package com.acuit.jointdistribution.Storeman.View;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: StoreInDetilsActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/29 11:57 <p>
 * 描述: 入库单详情页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoreInDetilsActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storein_detiles);
        String StoreInId = getIntent().getStringExtra("StoreInId");


    }


}
