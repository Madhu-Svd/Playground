package com.example.madhu.login1;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPassword1 extends AppCompatActivity {
    Button button2;
    ConstraintLayout c3;
    AlertDialog.Builder alertbuilder;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password1);
        button2 = findViewById(R.id.button2);
        c3=findViewById(R.id.constraintLayout4);
        editText = findViewById(R.id.editText3);
        alertbuilder=new AlertDialog.Builder(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        if(editText.getText().toString()==" "){
            c3.setVisibility(View.VISIBLE);
        }else {

            final View alertView=getLayoutInflater().inflate(R.layout.activity_login1_alert_dialog,null);
            alertbuilder.setView(alertView);
            final AlertDialog alertDialog=alertbuilder.create();
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.show();
                }
            });
        }



    }
}
