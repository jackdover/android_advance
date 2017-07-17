package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice11PieChartView extends View {

    private Paint paint;
    private RectF rectF;
    private RectF rectF2;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint = new Paint();
        rectF = new RectF(100, 200, 500, 600);

        paint.setStyle(Paint.Style.FILL);//填充模式
        paint.setColor(Color.RED);
        //useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形
        canvas.drawArc(rectF, 180/*起始角度位置*/, 120/*角度大小*/, true, paint);//绘制扇形

        paint.setColor(Color.WHITE);
        paint.setTextSize(20);
        canvas.drawText("Lollipop", 20, 190, paint);
        float[] points = {100, 200, 180, 200, 180, 200, 200, 230};
        canvas.drawLines(points, paint);


        paint.setColor(Color.GREEN);
        //useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形
        rectF2 = new RectF(120, 220, 520, 620);
        canvas.drawArc(rectF2, 79/*起始角度位置*/, -45/*角度大小*/, true, paint);//绘制扇形

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF2, 81/*起始角度位置*/, 100/*角度大小*/, true, paint);//绘制扇形

    }
}
