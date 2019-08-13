package com.example.madhu.loginpage_1;

import android.app.Activity;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text=(TextView)findViewById(R.id.loginscrn);
        text.setPaintFlags(text.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}
