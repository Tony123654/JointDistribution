package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.R;

/**
 * 业务表据
 */
public class BusinessOrderActivity extends AppCompatActivity {
    private Activity mActivity;
  public BusinessOrderActivity(Activity mActivity){
        this.mActivity=mActivity;
    }
    private TextView change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_order);
        change = (TextView) findViewById(R.id.tv_change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mActivity,PurchaseChangedActivity.class));

            }
        });
    }
}
