package com.acuit.jointdistribution.Common.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: AboutUsActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/23 10:57 <p>
 * 描述: 设置模块——“关于我们”界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class AboutUsActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        final AboutUsActivity context = this;

        View back = findViewById(R.id.iv_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.finish();
            }
        });


    }
}
