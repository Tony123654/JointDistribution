package com.acuit.jointdistribution.Supplier.Acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import com.acuit.jointdistribution.R;

public class SendInfoActivity extends AppCompatActivity {

    private ImageButton ib_back_menuInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_info);
        ib_back_menuInfo = (ImageButton) findViewById(R.id.ib_back_menuinfo);
    }
}
