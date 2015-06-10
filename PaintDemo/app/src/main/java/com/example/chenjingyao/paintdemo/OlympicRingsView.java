package com.example.chenjingyao.paintdemo;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by chenjingyao on 15/6/10.
 */
public class OlympicRingsView extends View {
    public OlympicRingsView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // 画蓝环
        Paint paint = PaintUtils.getPaintWithStroke(Color.BLUE, 10);
        canvas.drawCircle(110, 150, 60, paint);

        // 画黄环
        paint = PaintUtils.getPaintWithStroke(Color.YELLOW, 10);
        canvas.drawCircle(175.5f, 210, 60, paint);

        // 画黑环
        paint = PaintUtils.getPaintWithStroke(Color.BLACK, 10);
        canvas.drawCircle(245, 150, 60, paint);

        // 画绿环
        paint = PaintUtils.getPaintWithStroke(Color.GREEN, 10);
        canvas.drawCircle(311, 210, 60, paint);

        // 画红环
        paint = PaintUtils.getPaintWithStroke(Color.RED, 10);
        canvas.drawCircle(380, 150, 60, paint);

        // 画文字
        paint = PaintUtils.getTextPaint(Color.BLUE, 20);
        canvas.drawText("北京欢迎您", 275, 330, paint);
    }
}

