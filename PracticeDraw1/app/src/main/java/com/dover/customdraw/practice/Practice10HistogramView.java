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
public class Practice10HistogramView extends View {

    private Paint paint;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        //画文字
        paint = new Paint();
        paint.setTextSize(48);
        paint.setColor(Color.WHITE);
        paint.setFakeBoldText(true);
        canvas.drawText("直方图", 400, 600, paint);


        //画坐标
        float[] points = {100, 20, 100, 501, 100, 501, 1000, 501};
        paint.setStrokeWidth(2);//注意宽度/2作为横坐标
        canvas.drawLines(points, paint);


        float[] heights = {480, 400, 300, 100, 20, 360, 180};
        //画矩形下方的文字标注
        String[] texts = {"Froyo", "GB", "ICS", "KITKAL", "L", "M", "O"};
        paint.setColor(Color.parseColor("#5B8B1D"));
        paint.setTextSize(20);
        //画矩形
        for (int i = 0; i < heights.length; i++) {
            paint.setColor(Color.parseColor("#5B8B1D"));
            canvas.drawRect(new RectF(120 * (i + 1), heights[i], 100 + 120 * (i + 1), 500), paint);
            paint.setColor(Color.WHITE);
            canvas.drawText(texts[i], 120 * (i + 1) + 30, 530, paint);
        }


    }
}
