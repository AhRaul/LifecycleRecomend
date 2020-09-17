package com.example.lifecyclerecomend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    LifeCyclePresenter lifeCyclePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifeCyclePresenter = new LifeCyclePresenter();
        getLifecycle().addObserver(lifeCyclePresenter);
    }
}
