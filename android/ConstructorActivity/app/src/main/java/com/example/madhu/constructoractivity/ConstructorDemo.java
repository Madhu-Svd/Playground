package com.example.madhu.constructoractivity;

import android.app.AppComponentFactory;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ConstructorDemo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public ConstructorDemo() {
            System.out.println("This is a Constructor Demo program");
            System.out.println("Madhu");
            System.out.println("CSE");
            System.out.println("Constructor");
            System.out.println("ConstructorDemo");

//            Toast.makeText(getApplicationContext(), "constructor", Toast.LENGTH_LONG).show();

        }

        public void display(Context applicationContext) {
            Toast.makeText(applicationContext, "this is constructor", Toast.LENGTH_LONG).show();
        }

    }

