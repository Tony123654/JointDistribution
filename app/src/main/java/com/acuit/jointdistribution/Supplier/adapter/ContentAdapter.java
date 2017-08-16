package com.acuit.jointdistribution.Supplier.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * 类名: ContentAdapter <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8 0008 17:48 <p>
 * 描述:适配
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ContentAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {



        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}

