package com.acuit.jointdistribution.Common.View.Page;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.Common.Presenter.SettingsPage_Presenter;
import com.acuit.jointdistribution.Common.View.Activity.AboutUsActivity;
import com.acuit.jointdistribution.Common.View.Activity.BindPhoneActivity;
import com.acuit.jointdistribution.Common.View.Activity.ModifyPwdActivity;
import com.acuit.jointdistribution.Common.View.Activity.SuggestionFeedbackActivity;
import com.acuit.jointdistribution.R;


/**
 * 设置
 */
public class SettingPager extends BasePager implements View.OnClickListener {

    private View view;
    private TextView tvDepName;
    private TextView tvUserName;
    private LinearLayout llAboutUS;
    private LinearLayout llModifyPwd;
    private LinearLayout llBindPhone;
    private TextView tvQuitAccout;
    private LinearLayout llSuggestionFeedbace;

    private final SettingsPage_Presenter presenter;

    private int ACTION_FLAG = -1;
    private static final int FLAG_QUIT_ACCOUNT = 0;


    public SettingPager(Activity activity) {
        super(activity);
        presenter = new SettingsPage_Presenter(this);
    }

    @Override
    public void initData() {

        view = View.inflate(mActivity, R.layout.page_setting, null);
        flContainer.addView(view);//给帧布局添加对象

        tvDepName = (TextView) view.findViewById(R.id.tv_depName);
        tvUserName = (TextView) view.findViewById(R.id.tv_userName);

        llAboutUS = (LinearLayout) view.findViewById(R.id.ll_aboutUs);
        llModifyPwd = (LinearLayout) view.findViewById(R.id.ll_modifyPwd);
        llBindPhone = (LinearLayout) view.findViewById(R.id.ll_bindPhone);
        tvQuitAccout = (TextView) view.findViewById(R.id.tv_quitAccount);
        llSuggestionFeedbace = (LinearLayout) view.findViewById(R.id.ll_suggestionFeedback);

        LoginBean.DataBean.UserInfoBean user_info = BaseApplication.getLoginBean().getData().getUser_info();

        if (BaseApplication.isSupplyer()) {

            tvDepName.setText(user_info.getDep_info().getDep_name());
        } else {

//            公司名+部门名
            tvDepName.setText(user_info.getDep_info().getCom_name() + " " + user_info.getDep_info().getDep_name());
        }

        tvUserName.setText(user_info.getRealname());

        initEvent();
    }

    private void initEvent() {
        llAboutUS.setOnClickListener(this);
        llModifyPwd.setOnClickListener(this);
        llBindPhone.setOnClickListener(this);
        tvQuitAccout.setOnClickListener(this);
        llSuggestionFeedbace.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.ll_aboutUs:
                intent = new Intent(mActivity, AboutUsActivity.class);
                break;
            case R.id.ll_modifyPwd:
                intent = new Intent(mActivity, ModifyPwdActivity.class);
                break;
            case R.id.ll_bindPhone:
                intent = new Intent(mActivity, BindPhoneActivity.class);
                break;
            case R.id.tv_quitAccount:
                ACTION_FLAG = FLAG_QUIT_ACCOUNT;
                showAlter();
                break;
            case R.id.ll_suggestionFeedback:
                intent = new Intent(mActivity, SuggestionFeedbackActivity.class);
                break;
        }

        if (null != intent) {
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            mActivity.startActivity(intent);
        }
    }


    private void showAlter() {

        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);

        switch (ACTION_FLAG) {
            case FLAG_QUIT_ACCOUNT:
                builder.setMessage(R.string.quitAccount);
                builder.setNegativeButton("取消", null);
                builder.setPositiveButton("确认", new DialogClickListener_SettingPage());
                break;

        }

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    class DialogClickListener_SettingPage implements DialogInterface.OnClickListener {

        /**
         * @param dialog
         * @param which  按钮点击时为负值，且从左到右依次减小(-1，-2...)
         *               当监听设置给items时，为点击的item的position
         */
        @Override
        public void onClick(DialogInterface dialog, int which) {

            switch (ACTION_FLAG) {
                case FLAG_QUIT_ACCOUNT:
                    presenter.quitAccount();
                    break;
//                case FLAG_QUIT_ACCOUNT:
//                    presenter.quitAccount();
//                    break;
//                case FLAG_QUIT_ACCOUNT:
//                    presenter.quitAccount();
//                    break;
            }
            ACTION_FLAG = -1;
        }
    }

}
