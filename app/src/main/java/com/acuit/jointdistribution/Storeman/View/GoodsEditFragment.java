package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BaseArrayList;
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.acuit.jointdistribution.Storeman.Bean.StoreInStandardBean;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.zfdang.multiple_images_selector.ImagesSelectorActivity;
import com.zfdang.multiple_images_selector.SelectorSettings;

import java.util.ArrayList;
import java.util.Map;

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

public class GoodsEditFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

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
    private ImageView ivAddPic1;
    private TextView tvGoodsUnit3;
    private TextView tvGoodsUnit1;
    private TextView tvGoodsUnit2;
    private EditText etRejectAmount;
    private EditText etReciverAmount;
    private TextView tvSave;
    private Float reciverAmount;
    private Float rejectAmount;
    private ImageView ivAddPic3;
    private ImageView ivAddPic2;
    private ArrayList<String> spinnerSelectData = new ArrayList<String>();

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
        ivAddPic1 = (ImageView) fragmentView.findViewById(R.id.iv_addPic1);
        ivAddPic2 = (ImageView) fragmentView.findViewById(R.id.iv_addPic2);
        ivAddPic3 = (ImageView) fragmentView.findViewById(R.id.iv_addPic3);
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
        ivAddPic1.setOnClickListener(this);
        ivAddPic2.setOnClickListener(this);
        ivAddPic3.setOnClickListener(this);
        ivReciverPlus.setOnClickListener(this);
        ivReciverMinus.setOnClickListener(this);
        ivSubtractPlus.setOnClickListener(this);
        ivSubtractMinus.setOnClickListener(this);


        etReciverAmount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    etReciverAmount.setText("");
                } else {
                    String amount = etReciverAmount.getText().toString();
                    if (amount.equals("")) {
                        etReciverAmount.setText(String.format("%.2f", reciverAmount));
                    } else {
                        etReciverAmount.setText(String.format("%.2f", Float.valueOf(amount)));
                    }
                }
            }
        });

        etReciverAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (null == reciverAmount) {
                    reciverAmount = Float.valueOf(String.valueOf(s));
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = String.valueOf(s);
                if (null != str && !str.equals("")) {
                    reciverAmount = Float.valueOf(str);
                }
            }
        });

        etRejectAmount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    etRejectAmount.setText("");
                } else {
                    String amount = etRejectAmount.getText().toString();
                    if (amount.equals("")) {
                        etRejectAmount.setText(String.format("%.2f", rejectAmount));
                    } else {
                        etRejectAmount.setText(String.format("%.2f", Float.valueOf(amount)));
                    }
                }
            }
        });

        etRejectAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (null == rejectAmount) {
                    rejectAmount = Float.valueOf(String.valueOf(s));
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = String.valueOf(s);
                if (null != str && !str.equals("")) {
                    rejectAmount = Float.valueOf(str);
                }
            }
        });


        initSpinner();
        spinnerRejectResion.setOnItemSelectedListener(this);
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

            case R.id.iv_addPic1:
                addPic();
                break;

            case R.id.iv_addPic2:
                addPic();
                break;

            case R.id.iv_addPic3:
                addPic();
                break;

        }
    }


    // class variables
    private static final int REQUEST_CODE = 123;
    private ArrayList<String> mResults = new ArrayList<>();

    private void addPic() {
// start multiple photos selector
        Intent intent = new Intent(mActivity, ImagesSelectorActivity.class);
// max number of images to be selected
        intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, 3);
// min size of image which will be shown; to filter tiny images (mainly icons)
        intent.putExtra(SelectorSettings.SELECTOR_MIN_IMAGE_SIZE, 100000);
// show camera or not
        intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true);
// pass current selected images as the initial value
        intent.putStringArrayListExtra(SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST, mResults);
// start the selector
        mActivity.startActivityForResult(intent, REQUEST_CODE);

    }


    private void addSavedGoodsPosition() {
        BaseArrayList<Integer> editedGoods = mActivity.getEditedGoods();
        editedGoods.contains(position);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    public void setPic(ArrayList<String> pics) {

        mResults = pics;
        String pic1 = mResults.get(0);

        if (!pic1.isEmpty()) {
//            一张图片
            ivAddPic1.setImageURI(Uri.parse(pic1));
            ivAddPic2.setImageResource(R.mipmap.icon_addpic);
            ivAddPic2.setVisibility(View.VISIBLE);
        } else {
//            没有图片
            ivAddPic1.setImageResource(R.mipmap.icon_addpic);
            ivAddPic2.setVisibility(View.INVISIBLE);
        }
        ivAddPic3.setVisibility(View.INVISIBLE);
//        两张图片
        if (mResults.size() > 1) {
            ivAddPic2.setImageURI(Uri.parse(mResults.get(1)));
            ivAddPic3.setImageResource(R.mipmap.icon_addpic);
            ivAddPic3.setVisibility(View.VISIBLE);
        }
//        三张图片
        if (mResults.size() > 2) {
            ivAddPic3.setImageURI(Uri.parse(mResults.get(2)));
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if ((null != mResults && 0 != mResults.size())) {
            setPic(mResults);
        }

    }


    /**
     * 初始化下拉框——拒收原因
     */
    private void initSpinner() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_STOREIN_STANDARD, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                StoreInStandardBean storeInStandardBean = gson.fromJson(response, StoreInStandardBean.class);
                spinnerSelectData.clear();
                spinnerSelectData.add("请选择");
                if (200 == storeInStandardBean.getCode()) {
                    for (StoreInStandardBean.DataBean dataBean : storeInStandardBean.getData()) {
                        spinnerSelectData.add(dataBean.getName());
                    }
                    // TODO: 2017/9/5 选项间隔大、下拉框位置、文字右对齐、默认选项不方便等问题，后期使用自定义adapter(继承baseAdapter)替换
                    ArrayAdapter<StoreInStandardBean.DataBean> spinnerAdapter = new ArrayAdapter(mActivity, android.R.layout.simple_selectable_list_item, spinnerSelectData);
                    spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerRejectResion.setAdapter(spinnerAdapter);
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                if (null == error.getMessage()) {
                    Toast.makeText(mActivity, "无法获取信息，请检查网络环境", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                ArrayMap<String, String> params = new ArrayMap<String, String>();

                params.put("token", BaseApplication.getLoginBean().getData().getToken());
                params.put("stock_id", goodsBean.getStock_id());

                return params;
            }
        };

        stringRequest.setTag("GoodsEditActivity");
        BaseApplication.getRequestQueue().add(stringRequest);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position > 0) {
            goodsBean.setStandard(position - 1 + "");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
