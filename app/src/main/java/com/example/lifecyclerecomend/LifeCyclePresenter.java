package com.example.lifecyclerecomend;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import static androidx.lifecycle.Lifecycle.Event.ON_ANY;

// шаг 1: унаследовать implements LifecycleObserver
public class LifeCyclePresenter implements LifecycleObserver {
    private static final String TAG = "LifeCyclePresenter";

    //шаг 2: аннотация @OnLifecycleEvent(Lifecycle.Event....)
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartMethod() {
        Log.d(TAG, "onStartMethod");
    }

    //шаг 2...
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopMethod() {
        Log.d(TAG, "onStopMethod");
    }

    //другие возможности______________________________________

    //Вы можете использовать событие ON_ANY для получения всех событий в одном методе
    //В этом случае все события будут вызывать этот метод.
    //Используйте входящий параметр event, чтобы определить, какое именно событие произошло
    @OnLifecycleEvent(ON_ANY)
    void onAny(LifecycleOwner source, Lifecycle.Event event) {
        Log.d(TAG, "onAny: " + event);
    }
}
