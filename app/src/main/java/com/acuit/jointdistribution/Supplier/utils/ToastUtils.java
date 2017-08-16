package com.acuit.jointdistribution.Supplier.utils;

import android.content.Context;
import android.widget.Toast;


public class ToastUtils {

	public static void showToast(Context ct,String str){
		Toast.makeText(ct, str, Toast.LENGTH_SHORT).show();
	}
}
