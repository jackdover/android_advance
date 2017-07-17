package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice7DrawRoundRectView extends View {

    private Paint paint;

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形


        paint = new Paint(Paint.ANTI_ALIAS_FLAG);//光滑
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        canvas.drawRoundRect(new RectF(100, 100, 400, 600), 50, 50, paint);


    }
}
