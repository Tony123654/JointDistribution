package com.acuit.jointdistribution.Common.View.Fragment;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.acuit.jointdistribution.Common.Base.BaseFragment;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.Common.Widget.NoScrollViewPager;
import com.acuit.jointdistribution.R;
import com.acuit.jointdistribution.Supplier.Bean.impl.BussinessOrderPager;
import com.acuit.jointdistribution.Supplier.Bean.impl.HomePager;
import com.acuit.jointdistribution.Common.View.Page.SettingPager;
import com.acuit.jointdistribution.Supplier.Bean.impl.StatisticalAnalysisPager;

import java.util.ArrayList;


/**
 * 类名: ContentFragment <p>
 * 创建人: Mwb <p>
 * 创建时间: 2017/8/8 08 17:04 <p>
 * 描述:主页面Fragment
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ContentFragment extends BaseFragment {

    private ArrayList<BasePager> mList;
    private NoScrollViewPager mViewPager;
    private RadioGroup rgGroup;

    public ContentFragment(Activity mActivity) {
        super(mActivity);
    }


    @Override
    public View initViews() {

        View view = View.inflate(mActivity, R.layout.fragment_context, null);

        mViewPager = (NoScrollViewPager) view.findViewById(R.id.vp_content);
        rgGroup = (RadioGroup) view.findViewById(R.id.rg_group);

        return view;

    }

    @Override
    protected void initData() {
        rgGroup.check(R.id.rb_home);
        //初始化4个标签页面对象
        mList = new ArrayList<BasePager>();
        mList.add(new HomePager(mActivity));
        mList.add(new BussinessOrderPager(mActivity));
        mList.add(new StatisticalAnalysisPager(mActivity));
        mList.add(new SettingPager(mActivity));

        mViewPager.setAdapter(new ContentAdapter());

        rgGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home:
                        mViewPager.setCurrentItem(0, false);
                        break;
                    case R.id.rb_businessDocument:
                        mViewPager.setCurrentItem(1, false);
                        break;
                    case R.id.rb_statisticAnalysis:
                        mViewPager.setCurrentItem(2, false);
                        break;
                    case R.id.rb_setting:
                        mViewPager.setCurrentItem(3, false);
                        break;
                    default:
                        break;
                }
            }
        });

        //监听ViewPager页面切换事件, 初始化当前页面数据
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //选中页面后再初始化
                BasePager pager = mList.get(position);
                pager.initData();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //手动初始化第一个页面的数据
        mList.get(0).initData();

    }


    class ContentAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            BasePager pager = mList.get(position);
//           View  view = pager.mRootView;

            container.addView(pager.mRootView);

            return pager.mRootView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }

    //获取业务订单对象
    public BussinessOrderPager getBussinessOrderPager() {
        return (BussinessOrderPager) mList.get(1);

    }
}
