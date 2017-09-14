package com.acuit.jointdistribution.Storeman.View;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.R;


/**
 * 类名: StoremanHomePage <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/12 at 14:10 <p>
 * 描述: 智能报表
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */
public class ReportPage extends BasePager implements View.OnClickListener {

    private View view;
    private TextView tvDepName;
    private TextView tvUserName;
    private TextView tvAboutUS;
    private TextView tvModifyPwd;
    private TextView tvBindPhone;
    private TextView tvQuitAccout;
    private TextView tvSuggestionFeedbace;

    private LoginBean loginBean;

    private int ACTION_FLAG = -1;
    private static final int FLAG_QUIT_ACCOUNT = 0;


    public ReportPage(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {

        view = View.inflate(mActivity, R.layout.page_report, null);
        flContainer.addView(view);//给帧布局添加对象
//
//        tvDepName = (TextView) view.findViewById(R.id.tv_depName);
//        tvUserName = (TextView) view.findViewById(R.id.tv_userName);
//
//        tvAboutUS = (TextView) view.findViewById(R.id.tv_aboutUs);
//        tvModifyPwd = (TextView) view.findViewById(R.id.tv_modifyPwd);
//        tvBindPhone = (TextView) view.findViewById(R.id.tv_bindPhone);
//        tvQuitAccout = (TextView) view.findViewById(R.id.tv_quitAccount);
//        tvSuggestionFeedbace = (TextView) view.findViewById(R.id.tv_suggestionFeedback);
//
//        loginBean = BaseApplication.getLoginBean();
//        tvDepName.setText(loginBean.getData().getUser_info().getDep_info().getDep_name());
//        tvUserName.setText(loginBean.getData().getUser_info().getLoginname());

//        initEvent();
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
//        switch (view.getId()) {
//            case R.id.tv_aboutUs:
//                intent = new Intent(mActivity, AboutUsActivity.class);
//                break;
//            case R.id.tv_modifyPwd:
//                intent = new Intent(mActivity, ModifyPwdActivity.class);
//                break;
//            case R.id.tv_bindPhone:
//                intent = new Intent(mActivity, BindPhoneActivity.class);
//                break;
//            case R.id.tv_quitAccount:
//                ACTION_FLAG = FLAG_QUIT_ACCOUNT;
////                showAlter();
//                break;
//            case R.id.tv_suggestionFeedback:
//                intent = new Intent(mActivity, SuggestionFeedbackActivity.class);
//                break;
//        }

        if (null != intent) {
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            mActivity.startActivity(intent);
        }
    }





}
