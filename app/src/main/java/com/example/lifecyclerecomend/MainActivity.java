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

        //шаг 3: подписать LifeCyclePresenter на MainActivity
        getLifecycle().addObserver(lifeCyclePresenter);
    }
}
