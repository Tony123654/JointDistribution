package com.acuit.jointdistribution.utils;

import android.content.Context;

/**
 * 网络缓存工具类
 */
public class CacheUtils {


	public static void setCache(Context ctx, String url, String json) {
		PrefUtils.putString(ctx, url, json);
	}


	public static String getCache(Context ctx, String url) {
		return PrefUtils.getString(ctx, url, null);
	}

}
