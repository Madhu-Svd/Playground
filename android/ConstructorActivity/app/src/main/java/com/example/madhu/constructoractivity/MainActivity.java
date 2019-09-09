package com.example.madhu.constructoractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.constructor);
        ConstructorDemo constructorDemo=new ConstructorDemo();
        constructorDemo.display(getApplicationContext());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConstructorDemo constructorDemo=new ConstructorDemo();
                constructorDemo.display1(getApplicationContext());
            }
        });
    }

}
