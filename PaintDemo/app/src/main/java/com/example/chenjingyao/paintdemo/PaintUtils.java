package com.example.chenjingyao.paintdemo;

import android.graphics.Paint;

/**
 * Created by chenjingyao on 15/6/10.
 */
class PaintUtils {
    public static Paint getPaintWithStroke(int color, float width) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(width);

        return paint;
    }

    public static Paint getTextPaint(int color, float textSize) {
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setTextSize(textSize);

        return paint;
    }
}

