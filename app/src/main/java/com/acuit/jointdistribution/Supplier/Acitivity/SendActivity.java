package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;

/**
 * 发送
 */
public class SendActivity extends AppCompatActivity {

    private ImageButton ib_back_menu;
    private ImageButton ib_choose;
    private TextView tv_xiangqing;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);
        ib_choose = (ImageButton) findViewById(R.id.ib_choose);
        tv_xiangqing = (TextView) findViewById(R.id.tv_toXiangqing);
        btn_send = (Button) findViewById(R.id.btn_send);
        ib_back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendActivity.this,HomeActivity.class));
            }
        });
        tv_xiangqing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SendActivity.this,SendInfoActivity.class));
            }
        });
    }
}
