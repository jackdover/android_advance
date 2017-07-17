package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice4DrawPointView extends View {

    private Paint paint;

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点


        paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);//设置为圆点
        // Paint.setStrokeCap(cap) 可以设置点的形状，但这个方法并不是专门用来设置点的形状的，
        // 而是一个设置线条端点形状的方法。
        // 端点有圆头 (ROUND)、平头 (BUTT) 和方头 (SQUARE) 三种

        paint.setStrokeWidth(100);//设置直径 [方形时边长]
        canvas.drawPoint(200, 200, paint);

        //可以用画圆来实现
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(400, 200, 50, paint);

        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        canvas.drawPoints(points, 2/* 跳过两个数，即前两个 0 */, 8 /* 一共绘制 8 个数（4 个点）*/, paint);
    }
}
