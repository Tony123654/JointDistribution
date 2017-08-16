package com.acuit.jointdistribution.utils;

import com.google.gson.Gson;

public class GsonUtils {
	public static Gson gs;

	public static Gson getGsonUtils() {
		if (gs == null) {

			gs = new Gson();
		}
		return gs;
	}
}
