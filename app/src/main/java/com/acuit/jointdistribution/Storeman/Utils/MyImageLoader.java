package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 类名: MyImageLoader <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017-08-17 14:58 <p>
 * 描述:  图片加载器 基于volley
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class MyImageLoader {

    private static final int SUCCESS = 1;
    private Context context;
    private OnImageLoadCompleteListener onImageLoadCompleteListener;
    private ExecutorService threadPools;

    private ExecutorService getThreadPools() {

        if (threadPools == null) {
            threadPools = Executors.newFixedThreadPool(6);
        }
        return threadPools;
    }


    public MyImageLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    public void setOnImageLoadCompleteListener(OnImageLoadCompleteListener onImageLoadCompleteListener) {
        this.onImageLoadCompleteListener = onImageLoadCompleteListener;
    }

    /**
     * 传入图片地址与控件，完成图片的下载与置入
     *
     * @param path      图片的网络地址
     * @param imageView 需要图片的控件
     */
    public void setBitmapToImageView(final String path, final ImageView imageView) {
        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case SUCCESS:
                        Bitmap bitmap = (Bitmap) msg.obj;
                        try {
                            if (bitmap != null) {
                                CacheUtils.saveBitmapToCache(bitmap, path);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (onImageLoadCompleteListener != null) {
                            //Log.i("AAA", "handleMessage:--imageloader--listener---" + onImageLoadCompleteListener);
                            onImageLoadCompleteListener.setImageViewResource(bitmap, imageView);
                        }

                        break;
                    default:
                        break;
                }
            }
        };
        getThreadPools().execute(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = null;
                try {
                    if (null == onImageLoadCompleteListener) {
                        onImageLoadCompleteListener = new OnImageLoadCompleteListener() {
                            @Override
                            public void setImageViewResource(Bitmap bitmap, ImageView imageView) {
                                imageView.setImageBitmap(bitmap);
                            }
                        };
                    }

                    bitmap = CacheUtils.getImageFromCache(path);
                } catch (FileNotFoundException e) {
                    //捕获到异常说明没找到本地缓存，从网络加载
                    try {
                        bitmap = HttpUtils.getBitmapFromNetWork(path);
                        //Message message = Message.obtain();
                    } catch (IOException e1) {
                        //捕获到异常说明没请求到图片，置空
                        e1.printStackTrace();
                    }
                } finally {
                    Message message = Message.obtain();
                    message.what = SUCCESS;
                    message.obj = bitmap;
                    handler.sendMessage(message);
                    //Log.i("AAA", "run: " + Thread.currentThread().getId());
                }
            }
        });
    }


    public interface OnImageLoadCompleteListener {

        /**
         * 图片下载完成后的回调
         *
         * @param bitmap    下载完成的图片
         * @param imageView 需要设置图片的控件
         */
        void setImageViewResource(Bitmap bitmap, ImageView imageView);
    }
}

