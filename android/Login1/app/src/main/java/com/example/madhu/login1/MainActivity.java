package com.example.madhu.login1;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ConstraintLayout c1,c2;
    TextView forgotpwd;
//    AlertDialog.Builder alertbuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        c1=findViewById(R.id.constraintLayout2);
        c2= findViewById(R.id.constraintLayout3);
        //        alertbuilder=new AlertDialog.Builder(this);

        forgotpwd = findViewById(R.id.textView2);
        forgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword1.class);
                startActivity(intent);
            }
        });
//        if(editText2.getText().toString()==""){
//
//        }else {
//
//        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
////                editText2.setVisibility(View.VISIBLE);
//                final View alertView=getLayoutInflater().inflate(R.layout.activity_login1_alert_dialog,null);
//                alertbuilder.setView(alertView);
//                final AlertDialog alertDialog=alertbuilder.create();
//                alertDialog.show();

            }

        });


    }

}