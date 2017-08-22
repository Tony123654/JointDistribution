package com.acuit.jointdistribution.Common.View.Page;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Bean.LoginBean;
import com.acuit.jointdistribution.Common.Presenter.SettingsPage_Presenter;
import com.acuit.jointdistribution.R;


/**
 * 设置
 */
public class SettingPager extends BasePager implements View.OnClickListener {

	private final SettingsPage_Presenter presenter;
	private View view;
	private TextView tvDepName;
	private TextView tvUserName;
	private TextView tvAboutUS;
	private TextView tvModifyPwd;
	private TextView tvBindPhone;
	private TextView tvQuitAccout;
	private TextView tvSuggestionFeedbace;
	private LoginBean loginBean;

	public SettingPager(Activity activity) {
		super(activity);
		presenter = new SettingsPage_Presenter(this);
	}

	@Override
	public void initData() {

		view = View.inflate(mActivity, R.layout.pager_setting, null);
		flContainer.addView(view);//给帧布局添加对象

		tvDepName = (TextView)view.findViewById(R.id.tv_depName);
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
		switch (view.getId()) {
			case R.id.tv_aboutUs:

				break;
			case R.id.tv_modifyPwd:

				break;
			case R.id.tv_bindPhone:

				break;
			case R.id.tv_quitAccount:
				presenter.quitAccount();
				break;
			case R.id.tv_suggestionFeedback:

				break;
		}
	}
}
