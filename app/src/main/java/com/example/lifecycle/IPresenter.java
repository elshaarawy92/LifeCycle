package com.example.lifecycle;

import android.arch.lifecycle.LifecycleObserver;

public interface IPresenter extends LifecycleObserver {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void onRestart();

}
