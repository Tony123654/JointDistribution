package com.acuit.jointdistribution.Storeman.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseArrayList;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;

/**
 * 类名: GoodsEditFragment <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/1 11:34 <p>
 * 描述: 入库单验收——商品编辑界面
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class GoodsEditFragment extends Fragment implements View.OnClickListener {

    private final int position;
    private GoodsEditActivity mActivity;
    private StoreInDetailBean.DataBean.ListBean goodsBean;
    private ImageView ivReciverPlus;
    private ImageView ivReciverMinus;
    private ImageView ivSubtractPlus;
    private ImageView ivSubtractMinus;
    private TextView tvGoodsName;
    private TextView tvGoodsAmount;
    private TextView tvUnitPrice;
    private Spinner spinnerRejectResion;
    private ImageView ivAddPic;
    private TextView tvGoodsUnit3;
    private TextView tvGoodsUnit1;
    private TextView tvGoodsUnit2;
    private EditText etRejectAmount;
    private EditText etReciverAmount;
    private TextView tvSave;

    public GoodsEditFragment(StoreInDetailBean.DataBean.ListBean goodsBean, int position, GoodsEditActivity mActivity) {
        this.goodsBean = goodsBean;
        this.mActivity = mActivity;
        this.position = position;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_goods_edit, container, false);

        tvGoodsName = (TextView) fragmentView.findViewById(R.id.tv_goodsName);
        tvUnitPrice = (TextView) fragmentView.findViewById(R.id.tv_unitPrice);
        tvGoodsAmount = (TextView) fragmentView.findViewById(R.id.tv_goodsAmount);

        tvGoodsUnit1 = (TextView) fragmentView.findViewById(R.id.tv_goodsUnit1);
        tvGoodsUnit2 = (TextView) fragmentView.findViewById(R.id.tv_goodsUnit2);
        tvGoodsUnit3 = (TextView) fragmentView.findViewById(R.id.tv_goodsUnit3);

        ivReciverPlus = (ImageView) fragmentView.findViewById(R.id.iv_reciverPlus);
        ivSubtractPlus = (ImageView) fragmentView.findViewById(R.id.iv_rejectPlus);
        ivReciverMinus = (ImageView) fragmentView.findViewById(R.id.iv_reciverMinus);
        ivSubtractMinus = (ImageView) fragmentView.findViewById(R.id.iv_rejectMinus);

        etRejectAmount = (EditText) fragmentView.findViewById(R.id.et_rejectAmount);
        etReciverAmount = (EditText) fragmentView.findViewById(R.id.et_reciverAmount);

        tvSave = (TextView) fragmentView.findViewById(R.id.tv_save);
        ivAddPic = (ImageView) fragmentView.findViewById(R.id.iv_addPic1);
        spinnerRejectResion = (Spinner) fragmentView.findViewById(R.id.spinner_rejectResion);

        return fragmentView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvGoodsUnit1.setText(goodsBean.getUnit());
        tvGoodsUnit2.setText(goodsBean.getUnit());
        tvGoodsUnit3.setText(goodsBean.getUnit());

        tvGoodsName.setText(goodsBean.getStock_name());
        tvUnitPrice.setText(goodsBean.getPrice_unit());
        tvGoodsAmount.setText(goodsBean.getOrder_amount());

        etRejectAmount.setText(0.00 + "");
        etReciverAmount.setText(goodsBean.getOrder_amount());


        tvSave.setOnClickListener(this);
        ivAddPic.setOnClickListener(this);
        ivReciverPlus.setOnClickListener(this);
        ivReciverMinus.setOnClickListener(this);
        ivSubtractPlus.setOnClickListener(this);
        ivSubtractMinus.setOnClickListener(this);

//        etReciverAmount.listener
        etReciverAmount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String amount = "";
                if (hasFocus) {
                    amount = etReciverAmount.getText().toString();
                    etReciverAmount.setText("");
                } else {
                    if (etReciverAmount.getText().toString().equals("")) {
                        etReciverAmount.setText(amount);
                    }
                }
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_reciverPlus:
                Float amount = Float.valueOf(etReciverAmount.getText().toString());
                amount++;
                etReciverAmount.setText(String.format("%.2f", amount));
                break;
            case R.id.iv_reciverMinus:
                amount = Float.valueOf(etReciverAmount.getText().toString());
                if (amount > 0) amount--;
                etReciverAmount.setText(String.format("%.2f", amount));
                break;
            case R.id.iv_rejectPlus:
                amount = Float.valueOf(etRejectAmount.getText().toString());
                amount++;
                etRejectAmount.setText(String.format("%.2f", amount));
                break;
            case R.id.iv_rejectMinus:
                amount = Float.valueOf(etRejectAmount.getText().toString());
                if (amount > 0) amount--;
                etRejectAmount.setText(String.format("%.2f", amount));
                break;
        }
    }

    private void addSavedGoodsPosition() {
        BaseArrayList<Integer> editedGoods = mActivity.getEditedGoods();
        editedGoods.contains(position);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
