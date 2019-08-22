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
    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        forgotpwd = findViewById(R.id.textView2);
        c1=findViewById(R.id.constraintLayout2);
        c2= findViewById(R.id.constraintLayout3);
        email=findViewById(R.id.editText);
        password=findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("") && password.getText().toString().equals("")) {
                        c1.setVisibility(View.VISIBLE);
                        c2.setVisibility(View.VISIBLE);
                    }
                    else{
                    Intent intent=new Intent(getApplicationContext(),RequestPage_BurgerMenu.class);
                    startActivity(intent);
                }
            }

        });

        forgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword1.class);
                startActivity(intent);
            }
        });



    }

}