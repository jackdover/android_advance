package com.dover.customdraw.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by d on 2017/7/17.
 */
public class Practice1DrawColorView extends View {
    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW


        canvas.drawColor(Color.YELLOW);
        canvas.drawColor(Color.parseColor("#88880000"));// 半透明红色
//        canvas.drawRGB(100, 200, 100);
//        canvas.drawARGB(100, 100, 200, 100);

        //注意: 重复绘制, 会导致颜色叠加, 且渲染多次, 尽量配好颜色, 一步到位
        // todo 以上方法 一般用于在绘制之前设置底色，或者在绘制之后为界面设置半透明蒙版
    }
}
