package com.acuit.jointdistribution.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences 工具类
 * 
 * @author ASUS
 *
 */
public class PrefUtils {

	private static SharedPreferences sp;

	private static SharedPreferences getSp(Context ctx) {

		if (sp == null) {

			sp = ctx.getSharedPreferences("config", Context.MODE_PRIVATE);
		}

		return sp;

	}

	public static void putBoolean(Context ctx, String key, boolean value) {

		getSp(ctx).edit().putBoolean(key, value).commit();
	}

	public static boolean getBoolean(Context ctx, String key, boolean value) {

		return getSp(ctx).getBoolean(key, value);
	}

	public static void putString(Context ctx, String key, String value) {

		getSp(ctx).edit().putString(key, value).commit();
	}

	public static String getString(Context ctx, String key, String value) {

		return getSp(ctx).getString(key, value);
	}

	public static void putInt(Context ctx, String key, int value) {

		getSp(ctx).edit().putInt(key, value).commit();
	}

	public static int getInt(Context ctx, String key, int value) {

		return getSp(ctx).getInt(key, value);
	}

	public static void remove(Context ctx, String key) {
		getSp(ctx).edit().remove(key).commit();
	}

}
