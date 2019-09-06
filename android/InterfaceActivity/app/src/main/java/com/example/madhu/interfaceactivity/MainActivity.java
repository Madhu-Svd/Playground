package com.example.madhu.interfaceactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Demo ,DemoB,DemoC{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Displaymessage();
        FirstName();
        Department();
        MainActivity mainActivity=new MainActivity();
        mainActivity.rollNo();
        mainActivity.Displaymessage();
//        DemoB demoB=new MainActivity();
//        demoB.Department();
//

            }

    @Override
    public void Displaymessage() {
        Toast.makeText(getApplicationContext(),"This is an interface",Toast.LENGTH_LONG).show();


    }

    @Override
    public void FirstName() {
        Toast.makeText(getApplicationContext(),"FirstName:Madhu",Toast.LENGTH_LONG).show();
    }

    @Override
    public void Department() {
        Toast.makeText(getApplicationContext(),"Dept:CSE",Toast.LENGTH_LONG).show();
    }

    @Override
    public void rollNo() {
        Toast.makeText(getApplicationContext(),"Roll No:05",Toast.LENGTH_LONG).show();
    }

//    public void helloworld(View view) {
//        Toast.makeText(getApplicationContext(),"This is an interface",Toast.LENGTH_LONG).show();
//
//    }
}
