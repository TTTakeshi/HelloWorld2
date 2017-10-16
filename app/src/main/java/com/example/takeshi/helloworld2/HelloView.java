package com.example.takeshi.helloworld2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.CollapsibleActionView;
import android.view.View;

/**
 * Created by takeshi on 2017/09/30.
 */

public class HelloView extends View {

    // コンストラクタ
    public HelloView(Context context){
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    // 描画
    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setTextSize(48);
        canvas.drawText("Hello world2!",0,48,paint);
    }
}
