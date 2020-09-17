package com.example.lifecyclerecomend;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

// шаг 1: унаследовать implements LifecycleObserver
public class LifeCyclePresenter implements LifecycleObserver {
    private static final String TAG = "LifeCyclePresenter";

    //шаг 2: аннотация @OnLifecycleEvent(Lifecycle.Event....)
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartMethod() {
        Log.d(TAG, "onStartMethod: ");
    }

    //шаг 2...
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopMethod() {
        Log.d(TAG, "onStopMethod: ");
    }
}
