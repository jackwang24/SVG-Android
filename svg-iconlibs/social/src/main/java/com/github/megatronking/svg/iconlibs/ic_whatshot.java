package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_whatshot extends SVGRenderer {

    public ic_whatshot(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(13.5f, 0.67f);
        mPath.rCubicTo(0.0f, 0.0f, 0.74f, 2.65f, 0.74f, 4.8f);
        mPath.rCubicTo(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        mPath.rCubicTo(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        mPath.rLineTo(0.03f, -0.36f);
        mPath.cubicTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        mPath.rCubicTo(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        mPath.cubicTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        mPath.close();
        mPath.moveTo(13.5f, 0.67f);
        mPath.moveTo(11.71f, 19.0f);
        mPath.rCubicTo(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        mPath.rCubicTo(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        mPath.rCubicTo(1.77f, -0.36f, 3.6f, -1.21f, 4.62f, -2.58f);
        mPath.rCubicTo(0.39f, 1.29f, 0.59f, 2.65f, 0.59f, 4.04f);
        mPath.rCubicTo(0.0f, 2.65f, -2.15f, 4.8f, -4.8f, 4.8f);
        mPath.close();
        mPath.moveTo(11.71f, 19.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}