package com.acuit.jointdistribution.Storeman.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import com.acuit.jointdistribution.Storeman.Bean.StoreInDetailBean;
import com.acuit.jointdistribution.Storeman.View.GoodsEditActivity;
import com.acuit.jointdistribution.Storeman.View.GoodsEditFragment;

import java.util.List;

/**
 * 类名: GoodsViewPagerAdapter <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/1 11:28 <p>
 * 描述: 入库单验收——商品编辑界面（ViewPager适配器）
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class GoodsViewPagerAdapter extends FragmentPagerAdapter {

    private GoodsEditActivity mActivity;
    private SparseArray<GoodsEditFragment> fragmentsMap;
    private List<StoreInDetailBean.DataBean.ListBean> datalist;

    public GoodsViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentsMap = new SparseArray<GoodsEditFragment>();
    }

    public GoodsViewPagerAdapter(List<StoreInDetailBean.DataBean.ListBean> datalist,  GoodsEditActivity mActivity) {
        this(mActivity.getSupportFragmentManager());
        this.datalist = datalist;
        this.mActivity = mActivity;
    }

    @Override
    public Fragment getItem(int position) {
        GoodsEditFragment goodsEditFragment = fragmentsMap.get(position);
        if (null == goodsEditFragment) {
            goodsEditFragment = new GoodsEditFragment(datalist.get(position), position,mActivity);
            fragmentsMap.put(position, goodsEditFragment);
        }

        return goodsEditFragment;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }

}
