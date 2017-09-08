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
    private String picString;

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

            case R.id.tv_save:
                saveGoodsEdition();
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


    private void addSavedGoodsPosition() {
        BaseArrayList<Integer> editedGoods = mActivity.getEditedGoods();
        editedGoods.contains(position);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    public void setPic(ArrayList<String> pics, ArrayList<String> tempPics) {

        if (null == pics || null == tempPics) {
            return;
        }

//        for (String tempPic : tempPics) {
//            System.out.println("aaa tempPic:" + tempPic);
//            File file = new File(tempPic);
//            System.out.println("aaa tempPic.size:" + file.length());
//        }

        mResults = pics;
        this.tempPics = tempPics;

        showPics();
    }

    private void showPics() {
        String pic1 = this.tempPics.get(0);

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
        if (this.tempPics.size() > 1) {
            ivAddPic2.setImageURI(Uri.parse(this.tempPics.get(1)));
            ivAddPic3.setImageResource(R.mipmap.icon_addpic);
            ivAddPic3.setVisibility(View.VISIBLE);
        }
//        三张图片
        if (this.tempPics.size() > 2) {
            ivAddPic3.setImageURI(Uri.parse(this.tempPics.get(2)));
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (null != tempPics && 0 < tempPics.size()) {
            showPics();
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


    /**
     * 保存当前商品——编辑状态
     */
    private void saveGoodsEdition() {

//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                    upload();
//                }
//            }).start();

        String picUrl1 = "http://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%B0%8F%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&cs=2987813084,4164859397&os=364807995,2811198630&simid=4227453938,887346176&pn=14&rn=1&di=598980690&ln=1963&fr=&fmq=1504864006901_R&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fpic.58pic.com%2F58pic%2F14%2F03%2F29%2F25h58PICcJK_1024.jpg&rpstart=0&rpnum=0&adpicid=0";
        String picUrl2 = "http://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%B0%8F%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&cs=154914511,4117749715&os=632832925,3086445294&simid=4148191829,551016456&pn=75&rn=1&di=96541734960&ln=1963&fr=&fmq=1504864006901_R&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=2&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=1e&objurl=http%3A%2F%2Fpic.58pic.com%2F58pic%2F16%2F57%2F99%2F41A58PICFah_1024.jpg&rpstart=0&rpnum=0&adpicid=0";
        String picUrl3 = "http://image.baidu.com/search/detail?ct=503316480&z=&tn=baiduimagedetail&ipn=d&word=%E5%B0%8F%E5%9B%BE%E7%89%87&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=-1&cs=272798281,47645787&os=589944478,341674696&simid=0,0&pn=164&rn=1&di=1393835680&ln=1963&fr=&fmq=1504864006901_R&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=1550204388,3897674891&istype=2&ist=&jit=&bdtype=17&spn=0&pi=0&gsm=78&objurl=http%3A%2F%2Fpic39.nipic.com%2F20140321%2F17561764_000307587182_2.jpg&rpstart=0&rpnum=0&adpicid=0";

        StringBuilder picUrl = new StringBuilder();
        picUrl.append(picUrl1).append(",");
        picUrl.append(picUrl2).append(",");
        picUrl.append(picUrl3);

//上传图片，存储网络路径
//       picUrl = uploadImage();

        goodsBean.setPic_url(picUrl.toString());

        if (-1 == rejectResionId) {
            goodsBean.setStandard("");
        }else {
            goodsBean.setStandard(rejectResionId + "");
        }

        goodsBean.setBack_amount(etRejectAmount.getText().toString());
        goodsBean.setAlready_in_amount(etReciverAmount.getText().toString());

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position > 0) {
            rejectResionId = position - 1;
        } else {
            rejectResionId = -1;
        }
        System.out.println("aaa rejectResionId:" + rejectResionId);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private void uploadImage() {

        final String picPath = tempPics.get(0);
//        String nameFromPath = CacheUtils.getNameFromPath(picPath);

//        ArrayList<File> files = new ArrayList<>();
//        for (String tempPic : tempPics) {
//            files.add(new File(tempPic));
//        }
//
//        ArrayMap<String, String> params = new ArrayMap<>();
//        params.put("token", BaseApplication.getLoginBean().getData().getToken());
//        params.put("file", goodsBean.getId());

//        MultipartRequest multipartRequest = new MultipartRequest(GlobalContants.URL_ADD_PIC_BASE64, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                if (null == error.getMessage()) {
//                    Toast.makeText(mActivity, "上传失败，请检查网络环境", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        }, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                System.out.println("aaa addPic:" + GlobalContants.URL_ADD_PIC_BASE64);
//                System.out.println("aaa PicUrl:" + response);
//            }
//        }, goodsBean.getId(), new File(picPath), params);


//        StringRequest stringRequest = new StringRequest(Request.Method.POST, GlobalContants.URL_ADD_PIC_BASE64, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                System.out.println("aaa addPic:" + GlobalContants.URL_ADD_PIC_BASE64);
//                System.out.println("aaa PicUrl:" + response);
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                if (null == error.getMessage()) {
//                    Toast.makeText(mActivity, "上传失败，请检查网络环境", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(mActivity, error.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        }) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//
//
////                String[][] files = new String[][]{};
////                files[0][0] =
//                ArrayMap<String, String> params = new ArrayMap<String, String>();
//
//                params.put("token", BaseApplication.getLoginBean().getData().getToken());
//                params.put("file", "[" + goodsBean.getId() + "]" + "[" + ImageAndStream.file2String(new File(picPath)) + "]");
//
//                System.out.println("aaa params:" + params.toString());
//                return params;
//            }
//        };


//        BaseApplication.getRequestQueue().add(multipartRequest);
//        BaseApplication.getRequestQueue().add(stringRequest);


//        Map<String, String[]> configs = new HashMap<String, String[]>();
//        configs.put(goodsBean.getId(), new String[]{picString});
//
//        picString = ImageAndStream.file2String(new File(tempPics.get(0)));
//
//        ArrayMap<String, String> params = new ArrayMap<String, String>();
//
//        params.put("token", BaseApplication.getLoginBean().getData().getToken());
////        params.put("file", "[" + goodsBean.getId() + "]" + "[]");
//        params.put("file", configs.toString());
//
//        System.out.println("aaa params:" + params.toString());


//        OkHttpUtils.post()
////                .addFile("file", goodsBean.getId(), new File(tempPics.get(0)))//
//                .url(GlobalContants.URL_ADD_PIC_BASE64)
//                .params(params)
////                .headers(new Headers)
//                .build()
//                .execute(new MyStringCallback());

//        OkHttpUtilsByArray.postArrayString(params);
//
//        PostArrayStringBuilder postArrayStringBuilder = OkHttpUtilsByArray.postArrayString(params);
//        postArrayStringBuilder.url(GlobalContants.URL_ADD_PIC_BASE64)
////                .addParams("token", BaseApplication.getLoginBean().getData().getToken())
////                .addParams("file" + "[" + goodsBean.getId() + "]" + "[" + "]", picString)
//                .build()
//                .execute(new MyStringCallback());


    }


}
