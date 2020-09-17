package com.example.lifecyclerecomend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    LifeCyclePresenter lifeCyclePresenter;
    Button bGetLifeCycleState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bGetLifeCycleState = findViewById(R.id.b_get_life_cycle_state);

        lifeCyclePresenter = new LifeCyclePresenter();

        //шаг 3: подписать LifeCyclePresenter на MainActivity
        getLifecycle().addObserver(lifeCyclePresenter);

        //другие возможности______________________________________
        //Состояния_______________________________________________
        bGetLifeCycleState.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Если вы хотите узнать текущее состояние Activity, то у его объекта Lifecycle есть метод getCurrentState:
                if(getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                    Log.d(TAG, "onClick: isResumed");
                }

                //Также, вы можете проверить, что текущее состояние Activity не ниже определенного состояния.
                //Метод isAtLeast здесь проверяет, что состояние Activity не ниже, чем STARTED. Т.е. либо STARTED, либо RESUMED.
                if(getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    Log.d(TAG, "onClick: состояние Activity не ниже, чем STARTED. Т.е. либо STARTED, либо RESUMED.");
                }
            }
        });
    }
}
