package com.acuit.jointdistribution.Supplier.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.ReceivedActivity;

/**
 * 订单列表
 */
public class MenuInfoActivity extends AppCompatActivity {

    private ImageButton ib_back_menuinfo;

    private ImageButton ib_more;
    private TextView tv_jiedan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_info);
        ib_back_menuinfo = (ImageButton) findViewById(R.id.ib_back_menuinfo);
                  ib_more = (ImageButton) findViewById(R.id.ib_more);
        tv_jiedan = (TextView) findViewById(R.id.tv_jiedan);
        ib_back_menuinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuInfoActivity.this,ReceivedActivity.class));
            }
        });
//        ib_more.setOnClickListener(new Intent(MenuInfoActivity.this,));
    }
}
