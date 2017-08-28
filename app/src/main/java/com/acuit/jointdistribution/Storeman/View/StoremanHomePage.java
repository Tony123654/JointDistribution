package com.acuit.jointdistribution.Storeman.View;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.R;

/**
 * 类名: StoremanHomePage <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/28 10:05 <p>
 * 描述: 保管员首页
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class StoremanHomePage extends BasePager implements View.OnClickListener {

    private ImageView ivMessageCenter;
    private Button btnCheckOrder;
    private Button btnEvaluateOrder;
    private TextView tvWaitDistribution;
    private TextView tvHaventDistribution;
    private TextView tvParticalDistribution;
    private TextView tvParticalDeliver;
    private TextView tvHaventDeliver;
    private TextView tvDelivering;

    public StoremanHomePage(Activity activity) {
        super(activity);

    }

    @Override
    public void initData() {

        View view = View.inflate(mActivity, R.layout.page_home_storeman, null);
        flContainer.addView(view);

        btnCheckOrder = (Button) view.findViewById(R.id.btn_checkOrder);
        btnEvaluateOrder = (Button) view.findViewById(R.id.btn_evaluateOrder);
        ivMessageCenter = (ImageView) view.findViewById(R.id.iv_messageCenter);

        tvWaitDistribution = (TextView) view.findViewById(R.id.tv_waitDistribution);
        tvHaventDistribution = (TextView) view.findViewById(R.id.tv_haventDistribution);
        tvParticalDistribution = (TextView) view.findViewById(R.id.tv_particalDistribution);

        tvDelivering = (TextView) view.findViewById(R.id.tv_delivering);
        tvHaventDeliver = (TextView) view.findViewById(R.id.tv_haventDeliver);
        tvParticalDeliver = (TextView) view.findViewById(R.id.tv_particalDeliver);

        btnCheckOrder.setOnClickListener(this);
        ivMessageCenter.setOnClickListener(this);
        btnEvaluateOrder.setOnClickListener(this);

        setText();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_checkOrder:
                break;
            case R.id.iv_messageCenter:
                break;
            case R.id.btn_evaluateOrder:
                break;
        }
    }

    /**
     * 获取展示数据，设置给页面
     */
    private void setText() {

    }
}
