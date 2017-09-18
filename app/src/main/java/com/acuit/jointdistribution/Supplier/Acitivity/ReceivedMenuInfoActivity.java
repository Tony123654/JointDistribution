package com.acuit.jointdistribution.Supplier.Acitivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Adapter.OrderInfoAdapter;
import com.acuit.jointdistribution.Supplier.Domain.BuyOrderInfoBean;
import com.acuit.jointdistribution.Supplier.Utils.ToastUtils;
import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

import java.util.ArrayList;

/**
 * 订单详情界面
 */
public class ReceivedMenuInfoActivity extends BaseActivity {

    private ImageView ib_back;
    private String id;

    private ImageView ib_more;
    private TextView tv_jiedan;
    private TextView tv_code;
    private TextView tv_plan_date;
    private TextView tv_make_date;
    private TextView tv_total_amount;
    private TextView tv_total_money;
    private TextView tv_request_dep_strs;
    private TextView tv_com_brief_name;
    private TextView tv_dep_brief_name;
    private ListView lv;
    private ArrayList mListInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_info);
        ib_back = (ImageView) findViewById(R.id.ib_back_receive_ui);
        ib_more = (ImageView) findViewById(R.id.ib_receive_info_more);
        tv_jiedan = (TextView) findViewById(R.id.tv_receive_button);
//更多信息
        ib_more.setOnClickListener(new View.OnClickListener() {

            private AlertDialog dialog;

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedMenuInfoActivity.this);
                View inflate = View.inflate(BaseApplication.getContext(), R.layout.more_item, null);
                TextView message = (TextView) inflate.findViewById(R.id.tv_message);
                TextView retrospect = (TextView) inflate.findViewById(R.id.tv_retrospect);
                TextView back_first = (TextView) inflate.findViewById(R.id.tv_back_first);

                //返回消息界面
                message.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(BaseApplication.getContext(),"消息界面后续会有",Toast.LENGTH_SHORT).show();
                    }
                });
                //返回首页
                back_first.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(ReceivedMenuInfoActivity.this,ReceivedActivity.class));
                    }
                });

                //返回反馈界面
                retrospect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(BaseApplication.getContext(),"反馈界面后续会有",Toast.LENGTH_SHORT).show();

                    }
                });

                builder.setView(inflate);
                dialog = builder.create();

                //设置大小
                WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
                layoutParams.width = 300;
                layoutParams.height = 600;
                dialog.getWindow().setAttributes(layoutParams);


                //设置位置

                layoutParams.x = -150;//设置x坐标
                layoutParams.y = -200;//设置y坐标
                Window window = dialog.getWindow();
                window.setAttributes( layoutParams);
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
        });

        tv_jiedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReceivedMenuInfoActivity.this);
                builder.setMessage("订单确认成功");
                builder.create();
                builder.show();
            }
        });
         //返回
        ib_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceivedMenuInfoActivity.this, ReceivedActivity.class);
                startActivity(intent);

            }
        });

        lv = (ListView) findViewById(R.id.list_view);
        mListInfo = new ArrayList<>();


        tv_code = (TextView) findViewById(R.id.tv_receive_code);
        tv_plan_date = (TextView) findViewById(R.id.tv_receive_info_plan_date);
        tv_make_date = (TextView) findViewById(R.id.tv_make_date);
        tv_total_amount = (TextView) findViewById(R.id.tv_receive_info_total_amount);
        tv_total_money = (TextView) findViewById(R.id.tv_receive_info_total_money);
        tv_request_dep_strs = (TextView) findViewById(R.id.tv_receive_info_request_dep_strs);
        tv_com_brief_name = (TextView) findViewById(R.id.tv_receive_info_com_brief_name);
        tv_dep_brief_name = (TextView) findViewById(R.id.tv_receive_info_dep_brief_name);

         Intent intent = getIntent();
        id = intent.getStringExtra("listId");
        HttpUtils http = new HttpUtils();
        RequestParams params = new RequestParams();
        params.addBodyParameter("from_app","1");
        params.addBodyParameter("id", id + "");
        params.addBodyParameter("token", BaseApplication.getLoginBean().getData().getToken());
        http.send(HttpRequest.HttpMethod.POST, GlobalContants.URL_BUY_ORDER_DETAIL,
                params, new RequestCallBack<String>() {


                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {

                        String result = responseInfo.result;
                        System.out.println("VVV:"+result);
                        Gson gson = new Gson();

                        BuyOrderInfoBean buyOrderInfoBean = gson.fromJson(result, BuyOrderInfoBean.class);


                        tv_code.setText(buyOrderInfoBean.getData().getOrder_info().getCode());
                        tv_plan_date.setText(buyOrderInfoBean.getData().getOrder_info().getPlan_date());
                        tv_make_date.setText(buyOrderInfoBean.getData().getOrder_info().getCreate_date());
                        tv_total_amount.setText(buyOrderInfoBean.getData().getOrder_info().getTotal_amount()+"kg");
                        tv_total_money.setText("¥"+buyOrderInfoBean.getData().getOrder_info().getTotal_money());
                        tv_request_dep_strs.setText(buyOrderInfoBean.getData().getOrder_info().getRequest_dep_strs());
//                        tv_com_brief_name.setText((CharSequence) infoBean.getData().getOrder_info().getCom_brief_name());
                        tv_dep_brief_name.setText(buyOrderInfoBean.getData().getOrder_info().getDep_brief_name());


                        mListInfo.clear();

                        mListInfo.addAll(buyOrderInfoBean.getData().getStock_list_app());

                        //数据解析成功后设置适配器
                        if (buyOrderInfoBean != null) {
                            lv.setAdapter(new OrderInfoAdapter(mListInfo));

                        }else {
                            ToastUtils.showToast(BaseApplication.getContext(),"暂无订单");
                        }

                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        ToastUtils.showToast(BaseApplication.getContext(), msg);
                    }
                });

    }
}
