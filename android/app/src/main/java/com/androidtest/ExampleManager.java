//  Created by react-native-create-bridge

package com.androidtest;

import android.graphics.Color;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import com.facebook.react.uimanager.annotations.ReactProp;

public class ExampleManager extends SimpleViewManager<RelativeLayout> {
    RelativeLayout relativeLayout;
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;
    public static final String REACT_CLASS = "Example";

    @Override
    public String getName() {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass
        return REACT_CLASS;
    }

    @Override
    public RelativeLayout createViewInstance(ThemedReactContext context){
        // Create a view here
        // https://facebook.github.io/react-native/docs/native-components-android.html#2-implement-method-createviewinstance
        relativeLayout = new RelativeLayout(context);

        surfaceView = new SurfaceView(context);

        surfaceView.setBackgroundColor(Color.RED);

        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                surfaceView.setBackgroundColor(Color.GREEN);
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
            }
        });

        relativeLayout.addView(surfaceView);

        return relativeLayout;
    }

    @ReactProp(name = "exampleProp")
    public void setExampleProp(RelativeLayout view, String prop) {
        // Set properties from React onto your native component via a setter method
        // https://facebook.github.io/react-native/docs/native-components-android.html#3-expose-view-property-setters-using-reactprop-or-reactpropgroup-annotation
    }
}
