package com.acuit.jointdistribution.Supplier.Acitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.acuit.jointdistribution.R;

import static com.acuit.jointdistribution.R.id.lv;

/**
 * 接单界面
 */
public class ReceivedActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private static final String[] strs = new String[] {
        "first", "second", "third", "fourth", "fifth"
    };
    private ImageButton ib_back_menu;
    private ImageButton ib_choose;
    private ListView lv_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        ib_choose = (ImageButton) findViewById(R.id.ib_choose);

        ib_back_menu = (ImageButton) findViewById(R.id.ib_back_menu);

        lv_order = (ListView) findViewById(lv);
//        lv_order.setAdapter(new mAdapter());


        lv_order.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked,strs));
        lv_order.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

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


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}