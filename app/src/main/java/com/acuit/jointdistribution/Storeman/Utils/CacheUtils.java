package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;


import com.acuit.jointdistribution.Common.Base.BaseApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * 类名: CacheUtils <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017-08-17 14:15 <p>
 * 描述:  图片的 三级缓存 策略
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class CacheUtils {
    private static boolean isMounted() {
        //// TODO: 2017/1/14
        return Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);

    }

    private static String getSDRootPath() {
        if (isMounted()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return null;
    }

    private static String getCachePath() {
        return getSDRootPath() + File.separator + ".JointDistribution";
    }

    public static Bitmap getImageFromCache(String path) throws FileNotFoundException {
        String name = getNameFromPath(path);
        String cachePath = getCachePath();
        File file = new File(cachePath, name);
        //Log.i("AAA", "getImageFromCache:--file "+file.getAbsolutePath());
        /*if (!file.exists()) {//不存在直接返回
            //Log.i("AAA", "getImageFromCache:--file "+"file不存在");
            throw new FileNotFoundException();
        }*/
        FileInputStream fis = new FileInputStream(file);
        return BitmapFactory.decodeStream(fis);
    }

    public static void saveBitmapToCache(Bitmap bitmap, String path) throws IOException {
        String nameFromPath = getNameFromPath(path);
        String cachePath = getCachePath();
        File file = new File(cachePath, nameFromPath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {//已存在不再写入
            return;
        }
        OutputStream fos = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
        //Log.i("AAA", "Cacheutils--saveBitmapToCache: " + file.getAbsolutePath());
        fos.flush();
        fos.close();
    }

    private static String getNameFromPath(String path) {
        return path.substring(path.lastIndexOf("/") + 1);
    }

    private static String getJsonNameFromPath(String path) {
        return path.substring(path.lastIndexOf("&a=") + 1);
    }

    // TODO: 2017/8/17 json字符串的缓存（影响获取最新信息）
    public static String getJsonFromCache(String param) {
        String jsonNameFromPath = getJsonNameFromPath(param);
        FileInputStream fis = null;
        try {
            fis = BaseApplication.getInstance().openFileInput(jsonNameFromPath);
            StringBuilder stringBuilder = new StringBuilder();
            int len = 0;
            byte[] buffer = new byte[1024];
            while (-1 != (len = fis.read(buffer))) {
                stringBuilder.append(new String(buffer, 0, len));
            }
            fis.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void saveJsonToCache(String param, String jsonFromNetWrok) {
        String nameFromPath = getJsonNameFromPath(param);
        FileOutputStream fos = null;
        try {
            fos = BaseApplication.getInstance().openFileOutput(nameFromPath, Context.MODE_PRIVATE);
            fos.write(jsonFromNetWrok.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
