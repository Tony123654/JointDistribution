package com.acuit.jointdistribution.Storeman.Utils;

import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 类名: ThreadPool_Util <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/7/28 19:57 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

public class ThreadPool_Util {

    private final Context context;
    private static ThreadPool_Util instance;
    private static ExecutorService singleThreadPool;

    private ThreadPool_Util(Context context) {
        this.context = context;
        singleThreadPool = Executors.newSingleThreadExecutor();
    }

    public static ThreadPool_Util getInstance(Context context) {

        if (null == instance) instance = new ThreadPool_Util(context);
        return instance;
    }

    public static void doTask(Runnable r) {
        if (null != r) {
            ExecutorService ex = instance.getSingleThreadPool();
            ex.execute(r);
        }
    }
    public static Future<?> doTaskForFuture(Runnable r) {
        if (null != r) {
            ExecutorService ex = instance.getSingleThreadPool();
            return ex.submit(r);
        }
        return null;
    }

    private static ExecutorService getSingleThreadPool() {
        return singleThreadPool;
    }
}
