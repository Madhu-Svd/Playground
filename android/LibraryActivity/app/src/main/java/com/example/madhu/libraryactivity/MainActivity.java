package com.example.madhu.libraryactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BookInfo bookInfo=new BookInfo("JAVA","ABC","Swapna",2019,400.1);
        bookInfo.show();

    }
}
