/**
 * Created by swagat on 2018/6/14.
 */
package com.allandroidprojects.ecomsample.photoview.gestures;

public interface OnGestureListener {

    public void onDrag(float dx, float dy);

    public void onFling(float startX, float startY, float velocityX,
                        float velocityY);

    public void onScale(float scaleFactor, float focusX, float focusY);

}