package com.acuit.jointdistribution.Common.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextPaint;
import android.util.AttributeSet;

/**
 * 类名: MessageImageView <p>
 * 创建人: YanJ <p>
 * 创建时间: 2017/9/18 10:33 <p>
 * 描述:
 * <p>
 * 更新人: <p>
 * 更新时间: <p>
 * 更新描述: <p>
 */

//使用该控件时,需要给控件padding属性,一般为 ,用来放置 圆点
public class MessageImageView extends AppCompatImageView {

    //定义圆点模式
    /*
    *没有圆点模式
    * */
    public static final int MODE_NO = 1;
    /*
    *只有圆点模式
    * */
    public static final int MODE_ONLY_CIRCLE = 2;
    /*
    *有数字圆点模式
    * */
    public static final int MODE_NUMBER = 3;

    //当前模式,及默认模式
    public static int currentMode = 1;

    //是否有新消息的标记,及 默认值
    private boolean isHaveNew = false;
    //当前的消息数量,及默认的消息数量
    private int messgeNumber = 0;
    private Paint paint;
    private TextPaint textPaint;


    public MessageImageView(Context context) {
        this(context, null);
    }

    public MessageImageView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MessageImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    //初始化画笔
    private void initPaint() {
        paint = new Paint();
        paint.setColor(0xffff0000);
        paint.setStrokeWidth(1);
        //设置填充满模式
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);


        //画文本的画笔
        textPaint = new TextPaint();
        textPaint.setColor(0xffffffff);
        textPaint.setTextSize(30);
        textPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
      /*  2.画圆点
                *     1.不显示圆点模式
                *        --- 先画原图片
                *        --- 不处理
                *     2.只显示小圆点模式
                *          1.先画原图片
                *          2.判断是否有新消息
                *           --- 有 --- 右上角画点
                *           --=没有 --- 不处理
                *
                *     3.显示数字圆点模式
                *            1.先画原图片
                *            2.判断新消息的数量
                *                1, <= 0   不显示
                *                2. 0<    <= 99    显示具体数字
                *                3.   >=  99     显示99+*/

        switch (currentMode) {
            case MODE_NO: //没有圆点模式
                break;
            case MODE_ONLY_CIRCLE: //只显示小圆点
                if (isHaveNew) {
                    canvas.drawCircle(getWidth() - getPaddingRight(), getPaddingTop(), getPaddingTop(), paint);
                }
                break;
            case MODE_NUMBER:  //显示数字圆点
                if (messgeNumber <= 0) {

                } else if (messgeNumber > 0 && messgeNumber <= 99) {
                    //先画背景圆
                    canvas.drawCircle(getWidth() - getPaddingRight(), getPaddingTop(), getPaddingTop(), paint);

                    //计算画文本的起始X位置
                    float x = getWidth() - getPaddingRight() - textPaint.measureText(messgeNumber + "") / 2;
                    //计算文本的基准线Y的位置
                    int y = getPaddingTop() + (int) (textPaint.getFontMetrics().bottom * 1.5f);
                    //再画文本
                    canvas.drawText(messgeNumber + "", x, y, textPaint);
                } else if (messgeNumber >= 99) {
                    //先画背景圆
                    canvas.drawCircle(getWidth() - getPaddingRight(), getPaddingTop(), getPaddingTop(), paint);

                    //计算画文本的起始X位置
                    float x = getWidth() - getPaddingRight() - textPaint.measureText("99+") / 2;
                    //计算文本的基准线Y的位置
                    int y = getPaddingTop() + (int) (textPaint.getFontMetrics().bottom * 1.5f);
                    //再画文本
                    canvas.drawText("99+", x, y, textPaint);
                }
                break;
            default:
                break;
        }


    }

    /*
    * 设置圆点显示的模式
    * */
    public void setCurrentMode(int mode) {
        if (mode > 0 && mode < 4) {
            currentMode = mode;
            //通知刷新
//            invalidate();
        }
    }

    /*   5.暴露一个设置是否有新消息的方法
    * */
    public void setIsHaveNew(Boolean isHaveNew) {
        this.isHaveNew = isHaveNew;
        invalidate();
    }

    /* 6.暴露一个设置消息数量的方法
    * */
    public void setMessageNumber(int number) {
        this.messgeNumber = number;
        invalidate();
    }


    /*
    * 在图片的右上角画小红点
    *
    *  1.定义圆点显示的3种模式
    *     1.不显示圆点模式
    *     2.只显示小圆点模式
    *     3.显示数字圆点模式
    *
    *  2.画圆点
    *     1.不显示圆点模式
    *        --- 先画原图片
    *        --- 不处理
    *     2.只显示小圆点模式
    *          1.先画原图片
    *          2.判断是否有新消息
    *           --- 有 --- 右上角画点
    *           --=没有 --- 不处理
    *
    *     3.显示数字圆点模式
    *            1.先画原图片
    *            2.判断新消息的数量
    *                1, <= 0   不显示
    *                2. 0<    <= 99    显示具体数字
    *                3.   >=  99     显示99+
    * 3.设置默认模式
    * 4.设置圆点显示的模式
    *       1.更改模式
    *       2.通知刷新
    *
    * 5.暴露一个设置是否有新消息的方法
    *      1.更改标记
    *      2.通知刷新
    * 6.暴露一个设置消息数量的方法
    *     1.更改消息数量
    *     2.通知刷新
    * */


}
