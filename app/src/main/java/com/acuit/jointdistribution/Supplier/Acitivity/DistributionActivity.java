package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;

/**
 *配送
 */
public class DistributionActivity extends AppCompatActivity {

    private ImageButton ib_back_dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribution);
        ib_back_dis = (ImageButton) findViewById(R.id.ib_back_distribution);
        ib_back_dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DistributionActivity.this,HomeActivity.class));
            }
        });
    }

}
