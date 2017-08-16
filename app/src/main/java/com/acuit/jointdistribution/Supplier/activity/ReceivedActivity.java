package com.acuit.jointdistribution.Supplier.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.acuit.jointdistribution.R;

/**
 * 接单界面
 */
public class ReceivedActivity extends AppCompatActivity  {

    private ImageButton ib_back_menu;
    private ImageButton ib_choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        ib_choose = (ImageButton) findViewById(R.id.ib_choose);

        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);
        ib_back_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ReceivedActivity.this,HomeActivity.class));
            }
        });
        ib_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ReceivedActivity.this,MenuInfoActivity.class));
            }
        });

    }


}