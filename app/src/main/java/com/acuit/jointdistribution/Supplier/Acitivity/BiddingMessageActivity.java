package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;

public class BiddingMessageActivity extends AppCompatActivity {

    private ImageView biddingMessageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidding_message);

        biddingMessageBack = (ImageView) findViewById(R.id.bidding_message_back);
        biddingMessageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(),MessageActivity.class));
                finish();
            }
        });
    }
}
