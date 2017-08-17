package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.acuit.jointdistribution.Common.Base.BaseApplication;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * 类名: HttpUtils <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/8/8 11:34 <p>
 * 描述: http下载工具
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class HttpUtils {


    private static ConnectivityManager connectivityManager;

    private static boolean isNetWorkConnected() {
        connectivityManager = ((ConnectivityManager) BaseApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE));
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (null == networkInfo || !networkInfo.isConnected()) {
                return false;
            }
        }
        return true;
    }

    public static String getJsonFromNetWrok(String path) throws IOException {
        //Log.i("AAA", "getJsonFromNetWrok: "+"this");
        if (!isNetWorkConnected()) {
            return null;
        }
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(3000);
        connection.setDoInput(true);
        if (connection.getResponseCode() == 200) {
            InputStream inputStream = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while (-1 != (len = inputStream.read(buffer))) {
                stringBuilder.append(new String(buffer, 0, len));
            }
            // Log.i("AAA", "getJsonFromNetWrok: "+stringBuilder.toString());
            return stringBuilder.toString();
        }
        connection.disconnect();
        return null;
    }


    public static Bitmap getBitmapFromNetWork(String path) throws IOException {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(3000);
        connection.setDoInput(true);
        if (connection.getResponseCode() == 200) {
            InputStream inputStream = connection.getInputStream();
            return BitmapFactory.decodeStream(inputStream);
        }
        connection.disconnect();

        return null;
    }
}
