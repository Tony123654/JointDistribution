package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.View.Activity.HomeActivity;
import com.acuit.jointdistribution.R;

public class MessageActivity extends BaseActivity {

    private ImageView purchaseMessage;
    private ImageView biddingMessage;
    private ImageView newConmandMessage;
    private ImageView backMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        backMessage = (ImageView) findViewById(R.id.back_message);

        backMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(), HomeActivity.class));
                finish();
            }
        });
        purchaseMessage = (ImageView) findViewById(R.id.purchase_message);
        biddingMessage = (ImageView) findViewById(R.id.bidding_message);
        newConmandMessage = (ImageView) findViewById(R.id.new_conmand_message);

        purchaseMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(),PurchaseMessageActivity.class));
                finish();
            }
        });
        biddingMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(),BiddingMessageActivity.class));
                finish();
            }
        });
        newConmandMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(),NewConmandMessageActivity.class));
                finish();
            }
        });
    }
}
