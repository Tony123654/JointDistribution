package com.acuit.jointdistribution.Common.View.Page;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.Common.Presenter.SettingsPage_Presenter;
import com.acuit.jointdistribution.Common.View.Activity.AboutUsActivity;
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
    private TextView tvAboutUS;
    private TextView tvModifyPwd;
    private TextView tvBindPhone;
    private TextView tvQuitAccout;
    private TextView tvSuggestionFeedbace;

    private final SettingsPage_Presenter presenter;
    private LoginBean loginBean;

    private int ACTION_FLAG = -1;
    private static final int FLAG_QUIT_ACCOUNT = 0;


    public SettingPager(Activity activity) {
        super(activity);
        presenter = new SettingsPage_Presenter(this);
    }

    @Override
    public void initData() {

        view = View.inflate(mActivity, R.layout.pager_setting, null);
        flContainer.addView(view);//给帧布局添加对象

        tvDepName = (TextView) view.findViewById(R.id.tv_depName);
        tvUserName = (TextView) view.findViewById(R.id.tv_userName);

        tvAboutUS = (TextView) view.findViewById(R.id.tv_aboutUs);
        tvModifyPwd = (TextView) view.findViewById(R.id.tv_modifyPwd);
        tvBindPhone = (TextView) view.findViewById(R.id.tv_bindPhone);
        tvQuitAccout = (TextView) view.findViewById(R.id.tv_quitAccount);
        tvSuggestionFeedbace = (TextView) view.findViewById(R.id.tv_suggestionFeedback);

        loginBean = BaseApplication.getLoginBean();
        tvDepName.setText(loginBean.getData().getUser_info().getDep_info().getDep_name());
        tvUserName.setText(loginBean.getData().getUser_info().getLoginname());

        initEvent();
    }

    private void initEvent() {
        tvAboutUS.setOnClickListener(this);
        tvModifyPwd.setOnClickListener(this);
        tvBindPhone.setOnClickListener(this);
        tvQuitAccout.setOnClickListener(this);
        tvSuggestionFeedbace.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.tv_aboutUs:
                intent = new Intent(mActivity, AboutUsActivity.class);
                break;
            case R.id.tv_modifyPwd:
                intent = new Intent(mActivity, ModifyPwdActivity.class);
                break;
            case R.id.tv_bindPhone:

                break;
            case R.id.tv_quitAccount:
                ACTION_FLAG = FLAG_QUIT_ACCOUNT;
                showAlter();
                break;
            case R.id.tv_suggestionFeedback:
                intent = new Intent(mActivity, SuggestionFeedbackActivity.class);
                break;
        }

        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        mActivity.startActivity(intent);
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
