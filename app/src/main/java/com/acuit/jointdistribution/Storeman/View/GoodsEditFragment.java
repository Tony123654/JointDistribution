package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.ArrayMap;
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
import com.acuit.jointdistribution.Common.Global.GlobalContants;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.acuit.jointdistribution.Storeman.Bean.StoreInStandardBean;
import com.acuit.jointdistribution.Storeman.Bean.UploadImageBean;
import com.acuit.jointdistribution.Storeman.Utils.ImageAndStream;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.zfdang.multiple_images_selector.ImagesSelectorActivity;
import com.zfdang.multiple_images_selector.SelectorSettings;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

public class GoodsEditFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, View.OnLongClickListener {

    private int position;
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
    private int rejectResionId = -1;
    private ArrayAdapter<StoreInStandardBean.DataBean> spinnerAdapter;
    private boolean isInit;

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

        initView(fragmentView);

        isInit = true;
        return fragmentView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        initData();

        initEvent();

//        initSpinner();
//        spinnerRejectResion.setOnItemSelectedListener(this);

    }

    @Override
    public void onResume() {
        super.onResume();

        if (null == spinnerAdapter) {
            initSpinner();
        } else {
            spinnerRejectResion.setAdapter(spinnerAdapter);
            initData();
        }
        spinnerRejectResion.setOnItemSelectedListener(this);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void initView(View fragmentView) {
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

        tvSave = (TextView) fragmentView.findViewById(R.id.btn_save);
        ivAddPic1 = (ImageView) fragmentView.findViewById(R.id.iv_addPic1);
        ivAddPic2 = (ImageView) fragmentView.findViewById(R.id.iv_addPic2);
        ivAddPic3 = (ImageView) fragmentView.findViewById(R.id.iv_addPic3);
        spinnerRejectResion = (Spinner) fragmentView.findViewById(R.id.spinner_rejectResion);
    }

    private void initData() {
//        System.out.println("aaa goodsBean:" + goodsBean.toString());
        tvGoodsUnit1.setText(goodsBean.getUnit());
        tvGoodsUnit2.setText(goodsBean.getUnit());
        tvGoodsUnit3.setText(goodsBean.getUnit());

        tvGoodsName.setText(goodsBean.getStock_name());
        tvUnitPrice.setText(goodsBean.getBuy_price());
        tvGoodsAmount.setText(goodsBean.getOrder_amount());

        etReciverAmount.setText(goodsBean.getIn_amount());
        String back_amount = goodsBean.getBack_amount();
        if (null == back_amount || back_amount.equals("")) {
            etRejectAmount.setText("0.00");
            reciverAmount = Float.valueOf(goodsBean.getOrder_amount());
            rejectAmount = Float.valueOf("0.00");
        } else {
            etRejectAmount.setText(back_amount);
            reciverAmount = Float.valueOf(goodsBean.getIn_amount());
            rejectAmount = Float.valueOf(goodsBean.getBack_amount());
        }


        if (null != spinnerAdapter && !goodsBean.getCheck_standard().equals("")) {
            spinnerRejectResion.setSelection(Integer.parseInt(goodsBean.getCheck_standard()) + 1, true);
//            System.out.println("aaa onresume().standard:" + goodsBean.getCheck_standard());
        }

        if (goodsBean.isSaved() && !goodsBean.isEdited()) {
            mResults.clear();
            for (String path : goodsBean.getImagePath().split(",")) {
                mResults.add(path);
            }

            tempPics.clear();
            for (String tempPic : goodsBean.getTempImagePath().split(",")) {
                tempPics.add(tempPic);
            }
            showTempPics();
        } else {
            if (null != tempPics && 0 < tempPics.size()) {
                showTempPics();
            }
        }

    }


    private void initEvent() {

        tvSave.setOnClickListener(this);
        ivAddPic1.setLongClickable(true);
        ivAddPic2.setLongClickable(true);
        ivAddPic3.setLongClickable(true);
        ivAddPic1.setOnClickListener(this);
        ivAddPic2.setOnClickListener(this);
        ivAddPic3.setOnClickListener(this);
        ivAddPic1.setOnLongClickListener(this);
        ivAddPic2.setOnLongClickListener(this);
        ivAddPic3.setOnLongClickListener(this);
        ivReciverPlus.setOnClickListener(this);
        ivReciverMinus.setOnClickListener(this);
        ivSubtractPlus.setOnClickListener(this);
        ivSubtractMinus.setOnClickListener(this);

        etReciverAmount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    reciverAmount = Float.parseFloat(etReciverAmount.getText().toString());
                    etReciverAmount.setText("");
                } else {
                    reviewAmount(etReciverAmount, "");
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
                goodsBean.setEdited(true);
                String str = String.valueOf(s);
                if (null != str && !str.equals("")) {
                    reciverAmount = Float.valueOf(str);

                    //        保存入库数量
                    goodsBean.setIn_amount(etReciverAmount.getText().toString());
//                    System.out.println("aaa iv_reciverPlus:" + goodsBean.getIn_amount());
                }
            }
        });

        etRejectAmount.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    rejectAmount = Float.parseFloat(etRejectAmount.getText().toString());
                    etRejectAmount.setText("");
                } else {
                    reviewAmount(etRejectAmount, "");
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
                goodsBean.setEdited(true);
                String str = String.valueOf(s);
                if (null != str && !str.equals("")) {
                    rejectAmount = Float.valueOf(str);

                    //        保存拒收数量
                    goodsBean.setBack_amount(etRejectAmount.getText().toString());
//                    System.out.println("aaa iv_reciverPlus:" + goodsBean.getBack_amount());
                }
            }
        });
    }

    private void reviewAmount(EditText view, String str) {

        goodsBean.setEdited(true);
        String amount = view.getText().toString();

        if (view.getId() == R.id.et_reciverAmount) {
            if (amount.equals("")) {
                view.setText(String.format("%.2f", reciverAmount));
            } else {
                if (str.isEmpty()) {
                    view.setText(String.format("%.2f", Float.valueOf(amount)));
                } else if (str.equals("+")) {
                    view.setText(String.format("%.2f", Float.valueOf(amount) + 1));
                } else if (str.equals("-")) {
                    float a = Float.valueOf(amount) - 1;
                    if (a < 0) {
                        a = 0;
                    }
                    view.setText(String.format("%.2f", a));
                }
            }
        } else {
            if (amount.equals("")) {
                view.setText(String.format("%.2f", rejectAmount));
            } else {
                if (str.isEmpty()) {
                    view.setText(String.format("%.2f", Float.valueOf(amount)));
                } else if (str.equals("+")) {
                    view.setText(String.format("%.2f", Float.valueOf(amount) + 1));
                } else if (str.equals("-")) {
                    float a = Float.valueOf(amount) - 1;
                    if (a < 0) {
                        a = 0;
                    }
                    view.setText(String.format("%.2f", a));
                }
            }
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_reciverPlus:
                reviewAmount(etReciverAmount, "+");
                break;
            case R.id.iv_reciverMinus:
                reviewAmount(etReciverAmount, "-");
                break;
            case R.id.iv_rejectPlus:
                reviewAmount(etRejectAmount, "+");
                break;
            case R.id.iv_rejectMinus:
                reviewAmount(etRejectAmount, "-");
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

            case R.id.btn_save:
                uploadImage();
//                saveGoodsEdition();
                break;

        }
    }


    // class variables
    private static final int REQUEST_CODE = 123;
    private ArrayList<String> mResults = new ArrayList<>();
    private ArrayList<String> tempPics = new ArrayList<>();

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


//    private void addSavedGoodsPosition() {
//        BaseArrayList<Integer> editedGoods = mActivity.getEditedGoods();
//        editedGoods.contains(position);
//    }


    /**
     * 由goodsEditActivity调用，传入选择后的图片(以及压缩图片)路径
     *
     * @param pics
     * @param temp
     */
    public void setPic(ArrayList<String> pics, ArrayList<String> temp) {

        if (null == pics || null == tempPics) {
            return;
        }

        goodsBean.setEdited(true);

        mResults = pics;
        tempPics = temp;

//        showTempPics();
    }

    private void showTempPics() {

        if (0 == tempPics.size()) {
//        没有图片
            ivAddPic1.setImageResource(R.mipmap.icon_addpic);
            ivAddPic2.setVisibility(View.INVISIBLE);
            ivAddPic3.setVisibility(View.INVISIBLE);
        } else if (1 == tempPics.size()) {
//        一张图片
            ivAddPic1.setImageURI(Uri.parse(tempPics.get(0)));
            ivAddPic2.setImageResource(R.mipmap.icon_addpic);
            ivAddPic2.setVisibility(View.VISIBLE);
            ivAddPic3.setVisibility(View.INVISIBLE);
        } else if (2 == tempPics.size()) {
//        两张图片
            ivAddPic1.setImageURI(Uri.parse(tempPics.get(0)));
            ivAddPic2.setImageURI(Uri.parse(tempPics.get(1)));
            ivAddPic3.setImageResource(R.mipmap.icon_addpic);
            ivAddPic2.setVisibility(View.VISIBLE);
            ivAddPic3.setVisibility(View.VISIBLE);
        } else if (3 == tempPics.size()) {
//        三张图片
            ivAddPic1.setVisibility(View.VISIBLE);
            ivAddPic2.setVisibility(View.VISIBLE);
            ivAddPic3.setVisibility(View.VISIBLE);
            ivAddPic1.setImageURI(Uri.parse(tempPics.get(0)));
            ivAddPic2.setImageURI(Uri.parse(tempPics.get(1)));
            ivAddPic3.setImageURI(Uri.parse(tempPics.get(2)));
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
                    spinnerAdapter = new ArrayAdapter(mActivity, android.R.layout.simple_selectable_list_item, spinnerSelectData);
                    spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerRejectResion.setAdapter(spinnerAdapter);

                    if (!goodsBean.isEdited()) {
                        initData();
                    }
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


    /**
     * 保存当前商品——编辑状态
     *
     * @param uploadImageBean
     */
    private void saveGoodsEdition(UploadImageBean uploadImageBean) {

//        保存图片url
        StringBuilder picUrls = new StringBuilder();
        if (null == uploadImageBean) {
            picUrls.replace(0, picUrls.length(), "");
        } else {
            List<String> img_urls = uploadImageBean.getData().getImg_urls();
            for (int i = 0; i < img_urls.size(); i++) {
                picUrls.append(img_urls.get(i));
                if (i != img_urls.size() - 1) {
                    picUrls.append(",");
                }
            }
        }
        goodsBean.setPic_url(picUrls.toString());

//        暂存本地图片路径
        StringBuilder imagePaths = new StringBuilder();
        for (int i = 0; i < mResults.size(); i++) {
            imagePaths.append(mResults.get(i));
            if (i != mResults.size()) {
                imagePaths.append(",");
            }
        }
        goodsBean.setImagePath(imagePaths.toString());

//        暂存本地缓存图片路径
        StringBuilder tempImages = new StringBuilder();
        for (int i = 0; i < tempPics.size(); i++) {
            tempImages.append(tempPics.get(i));
            if (i != tempPics.size()) {
                tempImages.append(",");
            }
        }
        goodsBean.setTempImagePath(tempImages.toString());


        goodsBean.setSaved(true);
        goodsBean.setEdited(false);

        Toast.makeText(mActivity, "保存成功", Toast.LENGTH_SHORT).show();
//        System.out.println("aaa save goods:" + goodsBean);

        mActivity.onBackPressed();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//        System.out.println("aaa spinner.onItemSelected:" + goodsBean.getStock_name());

        if (isInit && null != goodsBean.getCheck_standard() && !goodsBean.getCheck_standard().equals("")) {
//            初始化view，且选过理由；恢复选项：
            spinnerRejectResion.setSelection(Integer.parseInt(goodsBean.getCheck_standard()) + 1, true);
//            System.out.println("aaa init.standard:" + goodsBean.getCheck_standard());
        } else {
            //        保存拒收原因
            goodsBean.setCheck_standard(position - 1 + "");
//            System.out.println("aaa notinit.standard:" + goodsBean.getCheck_standard());
        }
        isInit = false;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private void uploadImage() {

        StringBuilder encodePics = new StringBuilder();
        for (int i = 0; i < tempPics.size(); i++) {
            String picPath = tempPics.get(i);
            String encodePic = ImageAndStream.file2String(new File(picPath));
            encodePics.append(encodePic);
            if (i != tempPics.size() - 1) {
                encodePics.append("&");
            }
        }
        final String pics = encodePics.toString();

        if (pics.isEmpty()) {
            saveGoodsEdition(null);
        } else {

            StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_ADD_PIC_BASE64_APP, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Gson gson = new Gson();
                    saveGoodsEdition(gson.fromJson(response, UploadImageBean.class));

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    if (null == error.getMessage()) {
                        Toast.makeText(mActivity, "上传失败，请检查网络环境", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    ArrayMap<String, String> params = new ArrayMap<String, String>();

                    params.put("token", BaseApplication.getLoginBean().getData().getToken());
                    params.put("file", pics);

                    return params;
                }
            };

            BaseApplication.getRequestQueue().add(stringRequest);
        }
    }


    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()) {
            case R.id.iv_addPic1:
                mResults.remove(0);
                tempPics.remove(0);
                break;
            case R.id.iv_addPic2:
                mResults.remove(1);
                tempPics.remove(1);
                break;
            case R.id.iv_addPic3:
                mResults.remove(2);
                tempPics.remove(2);
                break;
        }

        showTempPics();
        goodsBean.setEdited(true);
        return true;
    }
}
