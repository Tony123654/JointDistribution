package com.acuit.jointdistribution.Supplier.Bean.impl;

import android.app.Activity;
import android.view.View;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.acuit.jointdistribution.Common.Base.BaseApplication;
import com.acuit.jointdistribution.Common.Base.BasePager;
import com.acuit.jointdistribution.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *统计分析
 */


public class StatisticalAnalysisPager extends BasePager {
	public Activity mActivity;
    private View view;
    private GridView gView;
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;



    private int[] icon = {R.mipmap.yellowjine,R.mipmap.yellow_day,R.mipmap.green_jine,R.mipmap.green_jine_zhou,R.mipmap.blue_jine,
    R.mipmap.blue_month};

    private String[] iconNum = {"2543.00","50","25413.00","254","35121.00","6589"};

    private String[] iconName = {"今日订单金额","今日订单数量","本周订单金额","本周订单数量",
            "本月订单金额","本月订单数量"};

    public StatisticalAnalysisPager(Activity activity) {
		super(activity);
		 mActivity = activity;


	}

	@Override
	public void initData() {

		//给空的帧布局动态添加布局对象
//		TextView view = new TextView(mActivity);
//		view.setTextSize(22);
//		view.setTextColor(Color.GREEN);
//		view.setGravity(Gravity.CENTER);//居中显示
//		view.setText("统计分析");
		view = View.inflate(mActivity, R.layout.analysis_statistic,null);

		flContainer.addView(view);//给帧布局添加对象
        gView = (GridView)flContainer.findViewById(R.id.gview);

      data_list = new ArrayList<Map<String,Object>>();



        String [] from ={"image","text"};
        int [] to = {R.id.image,R.id.text};
        sim_adapter = new SimpleAdapter(BaseApplication.getInstance(), data_list, R.layout.grid_item, from, to);
        //配置适配器
        gView.setAdapter(sim_adapter);
    }



    public List<Map<String, Object>> getData(){
            //长度相同，任取一个即可
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }

        return data_list;
    }




        //修改标题
//		tvTitle.setText("统计分析")


	}


