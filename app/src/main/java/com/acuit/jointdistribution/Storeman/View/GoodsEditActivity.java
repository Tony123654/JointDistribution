package com.acuit.jointdistribution.Storeman.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.acuit.jointdistribution.Common.Base.BaseActivity;
import com.acuit.jointdistribution.Common.Base.BaseArrayList;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Storeman.Adapter.GoodsViewPagerAdapter;
import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;

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

public class GoodsEditActivity extends BaseActivity {

    private TextView tvTitle;
    private ViewPager vpContent;
    private ImageView ivBack;
    private GoodsViewPagerAdapter goodsViewPagerAdapter;

    private int position;
    private BaseArrayList<Integer> savedGoodsPosition;
    private BaseArrayList<StoreInDetailBean.DataBean.ListBean> goodsList;
//    private FrameLayout flContainer;
//    private FragmentManager supportFragmentManager;

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
//        flContainer = (FrameLayout) findViewById(R.id.fl_container);
    }


    private void initData() {

        savedGoodsPosition = new BaseArrayList<Integer>();

        position = getIntent().getIntExtra("position", -1);
        goodsList = new BaseArrayList<StoreInDetailBean.DataBean.ListBean>();
        goodsList.addAll((Collection<? extends StoreInDetailBean.DataBean.ListBean>) getIntent().getSerializableExtra("GoodsList"));

        setTitle(goodsList.get(position).getStock_name());

        initViewPager();

    }


    private void initEvent() {

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
        goodsViewPagerAdapter = new GoodsViewPagerAdapter(goodsList, position, GoodsEditActivity.this);
        vpContent.setOffscreenPageLimit(0);
        vpContent.setAdapter(goodsViewPagerAdapter);
        vpContent.setCurrentItem(position);

        setTitle(goodsList.get(position).getStock_name());
//        supportFragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
//        fragmentTransaction.replace(new GoodsEditFragment())

    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public BaseArrayList<Integer> getEditedGoods() {
        return savedGoodsPosition;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
