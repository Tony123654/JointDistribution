package com.acuit.jointdistribution.Common.View.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.View.Activity.BindPhoneActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: PhoneExistFragment <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/24 15:11 <p>
 * 描述:  绑定手机模块——手机号输入界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneInexistenetFragment extends Fragment implements View.OnClickListener {

    private BindPhoneActivity mActivity;
    private Button btnBind;
    private EditText etPhone;

    public PhoneInexistenetFragment(BindPhoneActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bind_phone_inexistend, null);

        etPhone = (EditText) view.findViewById(R.id.et_phone);
        btnBind = (Button) view.findViewById(R.id.btn_submit);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mActivity.setTvTitle("手机绑定");
        etPhone.requestFocus();

        InputMethodManager imm = (InputMethodManager)mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        btnBind.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (etPhone.getText().toString().matches(mActivity.getREGEX())) {
            FragmentManager fragmentManager = mActivity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneVerifyFragment(mActivity));
            fragmentTransaction.commit();
        } else {
            Toast.makeText(mActivity, "手机号格式错误，请重新输入", Toast.LENGTH_SHORT).show();
        }

    }
}
