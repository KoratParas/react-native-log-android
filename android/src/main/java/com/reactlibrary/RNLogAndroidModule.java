
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNLogAndroidModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLogAndroidModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNLogAndroid";
  }


    @ReactMethod
    public void failure(final String tag, final String msg){
        android.util.Log.wtf(tag, msg);
    }

    @ReactMethod
    public void print(final int level, final String tag, final String msg){
        android.util.Log.println(level, tag, msg);
    }
}