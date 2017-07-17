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
public class Practice8DrawArcView extends View {

    private Paint paint;
    private RectF rectF;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Practice8DrawArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        paint = new Paint();
        rectF = new RectF(100, 200, 600, 500);

        paint.setStyle(Paint.Style.FILL);//填充模式
        //useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形
        canvas.drawArc(rectF, -100/*起始角度位置*/, 40/*角度大小*/, true, paint);//绘制扇形
        canvas.drawArc(rectF, -200/*起始*/, -100/*大小*/, false, paint);//绘制弧形
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, -200/*起始*/, 100/*大小*/, false, paint);//绘制弧形

        paint.setStyle(Paint.Style.STROKE);//划线模式
        paint.setStrokeWidth(6);
        paint.setColor(Color.RED);
        canvas.drawArc(rectF, 50/*起始*/, 100/*大小*/, true, paint);//绘制扇形

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 160/*起始*/, 180/*大小*/, false, paint);//绘制不封口弧形
    }
}
