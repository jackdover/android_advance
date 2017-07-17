package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice2DrawCircleView extends View {

    private Paint paint1;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆 5.抗锯齿

        paint1 = new Paint();
        paint1.setColor(Color.parseColor("#88008800"));
        canvas.drawCircle(200, 200, 100, paint1);

        paint1.setColor(Color.BLUE);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(2);
//        Style 具体来说有三种： FILL,  STROKE 和 FILL_AND_STROKE 。
// FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充。
// 它的默认值是 FILL，填充模式。
        canvas.drawCircle(500, 200, 100, paint1);

        paint1.setStrokeWidth(40);
        canvas.drawCircle(200, 500, 100, paint1);


        //开启抗锯齿很简单
        // 方法一.  只要在 new Paint() 的时候加上一个 ANTI_ALIAS_FLAG 参数就行
//        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //方法二. 使用 Paint.setAntiAlias(boolean aa) 来动态开关抗锯齿
//        paint1.setAntiAlias(false);//锯齿
        paint1.setAntiAlias(true);//光滑
        paint1.setColor(Color.BLACK);
        canvas.drawCircle(500, 500, 100, paint1);

    }
}
