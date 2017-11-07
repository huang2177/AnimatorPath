package com.example.kobe.animatorpath;

import android.animation.TypeEvaluator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by 黄双 on 2017/11/7.
 */

public class AnimatorPath {
    private ArrayList<PathPoint> pathPofloats = new ArrayList();

    public void moveTo(float x, float y) {
        pathPofloats.add(PathPoint.moveTo(x, y));
    }

    public void cubicTo(float c0x, float c0y, float c1x, float c1y, float x, float y) {
        pathPofloats.add(PathPoint.cubicTo(c0x, c0y, c1x, c1y, x, y));
    }

    public void lineTo(float x, float y) {
        pathPofloats.add(PathPoint.lineTo(x, y));
    }

    public Collection<PathPoint> getPofloats() {
        return pathPofloats;
    }
}
