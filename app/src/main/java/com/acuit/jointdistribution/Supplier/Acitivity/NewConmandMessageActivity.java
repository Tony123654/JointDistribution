package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.R;

public class NewConmandMessageActivity extends BaseActivity {

    private ImageView newConmandMessageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_conmand_message);

        newConmandMessageBack = (ImageView) findViewById(R.id.new_conmand_message_back);


        newConmandMessageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseApplication.getContext(),MessageActivity.class));
                finish();
            }
        });
    }
}
