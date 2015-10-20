package com.example.yll.myapplication.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by MagicYang on 2015/10/20.
 * 绘画板view，实现手滑动绘制线条
 */
public class DrawView extends View {
    private Context ctx;

    private Paint paint, cachePaint;

    private Bitmap cacheBitmap = null;

    private Canvas cacheCanvas;

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ctx = context;
        init();
    }

    public DrawView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private void init(){
        cachePaint = new Paint();
        cachePaint.setAntiAlias(true);

    }
}
