package com.example.madhu.activitylifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity LifeCycle","onCreate() method is invoked");
    }
    @Override
    protected void onStart() {

        super.onStart();
        Log.d("Activity LifeCycle","onStart() method is called");

    }
    @Override
    protected void onResume() {

        super.onResume();
        Log.d("Activity LifeCycle","onResume() method is called");

    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Activity LifeCycle","onPause() method is called");

    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Activity LifeCycle","onStop() method is called");

    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("Activity LifeCycle","onStop() method is called");

    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("Activity LifeCycle","onStop() method is called");

    }
}
