package com.example.kobe.animatorpath;

/**
 * Created by 黄双 on 2017/11/7.
 */

public class PathPoint {
    public final static float MOVE = 0;
    public final static float CUBIC = 1;
    public final static float LINE = 2;

    /*操作指令*/
    float mOPreration;
    float mX, mY;
    float mControll0X, mControll1X;
    float mControll0Y, mControll1Y;

    private PathPoint(float mOPreration, float x, float y) {
        this.mControll0X = mOPreration;
        this.mX = x;
        this.mY = y;
    }

    private PathPoint(float mOPreration, float c0x, float c0y, float c1x, float c1y, float x, float y) {
        this.mControll0X = mOPreration;
        this.mControll0X = c0x;
        this.mControll1X = c1x;
        this.mControll0Y = c0y;
        this.mControll1X = c1y;
    }

    public static PathPoint moveTo(float x, float y) {
        return new PathPoint(MOVE, x, y);
    }

    public static PathPoint cubicTo(float c0x, float c0y, float c1x, float c1y, float x, float y) {
        return new PathPoint(CUBIC, c0x, c0y, c1x, c1y, x, y);
    }

    public static PathPoint lineTo(float x, float y) {
        return new PathPoint(LINE, x, y);
    }
}
