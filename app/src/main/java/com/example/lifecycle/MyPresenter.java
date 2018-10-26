package com.example.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.Log;

public class MyPresenter implements IPresenter {

    private String TAG = "MyPresenter";

    private Context context;

    public MyPresenter(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_START)
    @Override
    public void onStart() {
        Log.d(TAG, "onStart: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_RESUME)
    @Override
    public void onResume() {
        Log.d(TAG, "onResume: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_PAUSE)
    @Override
    public void onPause() {
        Log.d(TAG, "onPause: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_STOP)
    @Override
    public void onStop() {
        Log.d(TAG, "onStop: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_DESTROY)
    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onRestart() {

    }

}
