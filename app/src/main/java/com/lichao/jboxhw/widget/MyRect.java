package com.lichao.jboxhw.widget;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Administrator on 2017-11-13.
 */

public class MyRect {
    //矩形图形的位置、宽高与角度
    private float x, y, w, h, angle;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getW() {
        return w;
    }

    public float getH() {
        return h;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    //矩形图形的初始化
    public MyRect(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void drawRect(Canvas canvas, Paint paint) {
        canvas.save();
        //绕物体中心选折一定角度
        canvas.rotate(angle, x+w/2, y+h/2);
        canvas.drawRect(x, y, x+w, y+h, paint);
        canvas.restore();
    }
}
