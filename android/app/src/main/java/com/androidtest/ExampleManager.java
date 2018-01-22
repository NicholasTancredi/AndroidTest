//  Created by react-native-create-bridge

package com.androidtest;

import android.util.Log;
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
    String exampleProp;
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

        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Log.d("", "surfaceCreated");
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                Log.d("", "surfaceChanged");
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                Log.d("", "surfaceDestroyed");
            }
        });

        relativeLayout.addView(surfaceView);

        return relativeLayout;
    }

    @Override
    protected void onAfterUpdateTransaction(RelativeLayout view) {
        super.onAfterUpdateTransaction(view);
        // NOTE: Props updated callback.
        Log.d("onAfterUpdate", exampleProp);
    }

    @ReactProp(name = "exampleProp")
    public void setExampleProp(RelativeLayout view, String prop) {
        exampleProp = prop;

        Log.d("setExampleProp", prop);
        // Set properties from React onto your native component via a setter method
        // https://facebook.github.io/react-native/docs/native-components-android.html#3-expose-view-property-setters-using-reactprop-or-reactpropgroup-annotation
    }
}
