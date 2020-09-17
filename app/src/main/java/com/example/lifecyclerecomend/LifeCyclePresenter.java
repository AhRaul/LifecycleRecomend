package com.example.lifecyclerecomend;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class LifeCyclePresenter implements LifecycleObserver {
    private static final String TAG = "LifeCyclePresenter";

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartMethod() {
        Log.d(TAG, "onStartMethod: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopMethod() {
        Log.d(TAG, "onStopMethod: ");
    }
}
