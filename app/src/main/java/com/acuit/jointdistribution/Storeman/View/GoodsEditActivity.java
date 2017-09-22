package com.acuit.jointdistribution.Storeman.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BaseArrayList;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.GoodsViewPagerAdapter;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.acuit.jointdistribution.Storeman.Utils.CacheUtils;
import com.acuit.jointdistribution.Storeman.Utils.ImageFactory;
import com.zfdang.multiple_images_selector.SelectorSettings;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


/**
 * 类名: GoodsEditActivity <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/1 9:15 <p>
 * 描述: 商品编辑页面——内嵌fragment
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class GoodsEditActivity extends BaseActivity implements View.OnClickListener {

    private TextView tvTitle;
    private ViewPager vpContent;
    private ImageView ivBack;
    private GoodsViewPagerAdapter goodsViewPagerAdapter;
    public static final int RESULT_CODE = 1155;
    public static final String GOODSLIST_RESULT = "GoodsList";

    private int position;
    //    private BaseArrayList<Integer> savedGoodsPosition;
    private BaseArrayList<StoreInDetailBean.DataBean.ListBean> goodsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_edit);


        initView();

        initData();

        initEvent();

    }

    private void initView() {
        ivBack = (ImageView) findViewById(R.id.iv_back);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        // TODO: 2017/9/1 viewPager优化fragment的预加载问题
        vpContent = (ViewPager) findViewById(R.id.vp_content);
    }


    private void initData() {

//        savedGoodsPosition = new BaseArrayList<Integer>();

        position = getIntent().getIntExtra("position", -1);
        goodsList = new BaseArrayList<StoreInDetailBean.DataBean.ListBean>();
        goodsList.addAll((Collection<? extends StoreInDetailBean.DataBean.ListBean>) getIntent().getSerializableExtra("GoodsList"));


        setTitle(goodsList.get(position).getStock_name());

        initViewPager();

    }


    private void initEvent() {

        ivBack.setOnClickListener(this);

        vpContent.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle(goodsList.get(position).getStock_name());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initViewPager() {

        // TODO: 2017/9/1 viewPager优化fragment的预加载问题
        goodsViewPagerAdapter = new GoodsViewPagerAdapter(goodsList, GoodsEditActivity.this);
        vpContent.setOffscreenPageLimit(0);
        vpContent.setAdapter(goodsViewPagerAdapter);
        vpContent.setCurrentItem(position);

        setTitle(goodsList.get(position).getStock_name());

    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

//    public BaseArrayList<Integer> getEditedGoods() {
//        return savedGoodsPosition;
//    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        BaseApplication.getRequestQueue().cancelAll("GoodsEditActivity");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
//                GoodsEditActivity.this.finish();
                onBackPressed();
                break;
        }
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
//        moveTaskToBack(true);

        Intent data = new Intent();
        data.putExtra(GOODSLIST_RESULT, goodsList);
        setResult(RESULT_CODE, data);

        GoodsEditActivity.this.finish();
    }


    // class variables
    private static final int REQUEST_CODE = 123;
    private ArrayList<String> mResults = new ArrayList<>();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // get selected images from selector
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                mResults = data.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS);
                assert mResults != null;

                viewPic(mResults, tempPics(mResults));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void viewPic(ArrayList<String> pics, ArrayList<String> tempPics) {
        if (null == tempPics) {
            System.out.println("aaa tempPics is null");
        }
        GoodsEditFragment currentFragment = (GoodsEditFragment) goodsViewPagerAdapter.getItem(vpContent.getCurrentItem());
        currentFragment.setPic(pics, tempPics);

    }

    /**
     * 生成缓存图片，用于上传与优化页面
     *
     * @param mResults
     * @return
     */
    private ArrayList<String> tempPics(ArrayList<String> mResults) {

        ArrayList<String> temp = new ArrayList<>();
        String tempPicsDir = CacheUtils.getTempPicsDir();

        for (String mResult : mResults) {
            String picName = CacheUtils.getNameFromPath(mResult);
            String tempPicPath = tempPicsDir + File.separator + picName;

            try {
                ImageFactory.ratioAndGenThumb(mResult, tempPicPath, 240, 400, false);
//                ImageFactory.compressAndGenImage(mResult, tempPicPath, 100, false);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("aaa IOException:" + e.getMessage());
            }

            temp.add(tempPicPath);
        }

        return temp;
    }


    @Override
    public void finish() {

        super.finish();
    }
}
