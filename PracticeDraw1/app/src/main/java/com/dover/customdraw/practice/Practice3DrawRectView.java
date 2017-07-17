package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice3DrawRectView extends View {

    private Paint paint;

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形


        paint = new Paint();
        paint.setColor(Color.parseColor("#007777"));
        canvas.drawRect(100, 100, 300, 300, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(new Rect(400, 100, 600, 300), paint);

        paint.setStrokeWidth(40);  //厚度向两侧拓展
        paint.setColor(Color.BLACK);
        canvas.drawRect(new RectF(700, 100, 900, 300), paint);

    }
}
