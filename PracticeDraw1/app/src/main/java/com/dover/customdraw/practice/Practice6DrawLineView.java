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
public class Practice6DrawLineView extends View {

    private Paint paint;

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线

        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(6);//线宽
        canvas.drawLine(10, 10, 500, 500, paint);

        float[] points = {
                20, 20, 120, 20,
                70, 20, 70, 120,
                20, 120, 120, 120,
                150, 20, 250, 20,
                150, 20, 150, 120,
                250, 20, 250, 120,
                150, 120, 250, 120};
        paint.setColor(Color.RED);
        canvas.drawLines(points, 0, 28, paint);

        float[] points2 = {
                100, 10, 300, 10,
                100, 10, 100, 250,
                100, 250, 300, 250,
                300, 10, 300, 250,
                80, 300, 320, 300,
                120, 400, 280, 400,
                20, 500, 380, 500,
                200, 300, 200, 500,
        };
        paint.setColor(Color.BLUE);
        canvas.drawLines(points2, paint);

    }
}
