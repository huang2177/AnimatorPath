package com.example.kobe.animatorpath;

import android.animation.TypeEvaluator;

/**
 * Created by 黄双 on 2017/11/7.
 */

public class PathEvaluator implements TypeEvaluator<PathPoint> {
    @Override
    public PathPoint evaluate(float v, PathPoint startPoint, PathPoint endPoint) {
        float x, y;
        if (endPoint.mOPreration == PathPoint.CUBIC) {

        } else if (endPoint.mOPreration == PathPoint.LINE) {
            x = startPoint.mX + v * (endPoint.mX - startPoint.mX);
            x = startPoint.mY + v * (endPoint.mY - startPoint.mY);
        } else {
            x = endPoint.mX;
            y = endPoint.mY;
        }
        return null;
    }
}
