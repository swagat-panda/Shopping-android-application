/**
 * Created by swagat on 2018/6/14.
 */
package com.allandroidprojects.ecomsample.photoview.gestures;

import android.view.MotionEvent;

public interface GestureDetector {

    public boolean onTouchEvent(MotionEvent ev);

    public boolean isScaling();

    public boolean isDragging();

    public void setOnGestureListener(OnGestureListener listener);

}
