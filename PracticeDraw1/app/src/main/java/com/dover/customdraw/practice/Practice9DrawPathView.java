package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice9DrawPathView extends View {

    private Paint paint;
    private Path path;
    private RectF rectF;
    private RectF rectF1;

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形


        paint = new Paint();
        path = new Path();


//        paint.setStyle(Paint.Style.STROKE);
        /*paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2);
        paint.setColor(Color.RED);

        path.moveTo(500, 600);
//        path.lineTo(200,200);
        rectF = new RectF(200, 0, 600, 400);
        path.arcTo(rectF, 180, 120, false);//有痕迹

        rectF1 = new RectF(400, 0, 800, 400);
        path.addArc(rectF1, -120, 120);

//        path.close();
        path.lineTo(500, 600);*/

        paint.setStyle(Paint.Style.FILL);
        path.addArc(new RectF(200, 200, 400, 400), -225, 225);
        path.arcTo(new RectF(400, 200, 600, 400), -180, 225, false);
        path.lineTo(400, 542);

        canvas.drawPath(path, paint);
    }
}
