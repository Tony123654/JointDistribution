package com.acuit.jointdistribution.Common.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.View.Activity.BindPhoneActivity;
import com.acuit.jointdistribution.R;

/**
 * 类名: PhoneExistFragment <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/24 15:11 <p>
 * 描述:  绑定手机模块——手机号已绑定
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class PhoneExistFragment extends Fragment implements View.OnClickListener {

    private BindPhoneActivity mActivity;
    private TextView tvPhone;
    private Button btnChange;

    public PhoneExistFragment(BindPhoneActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bind_phone_exist, null);

        tvPhone = (TextView) view.findViewById(R.id.tv_phone);
        btnChange = (Button) view.findViewById(R.id.btn_changePhone);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        mActivity.setTvTitle("手机绑定");
        tvPhone.setText(mActivity.getMobilePhone());

        btnChange.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager =  mActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_contentBindPhone, new PhoneEnsurePwdFragment(mActivity));
        fragmentTransaction.commit();

    }
}
