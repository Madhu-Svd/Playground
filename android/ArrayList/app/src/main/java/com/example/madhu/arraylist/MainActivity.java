package com.example.madhu.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView list;
    Button showarraylist;
    Button additem;
    Button removeitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.textView);
        showarraylist=findViewById(R.id.button);
        additem=findViewById(R.id.button2);
        removeitem=findViewById(R.id.button3);
        final ArrayList<String> arraylist=new ArrayList<>();

        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arraylist.add("Hi");
                arraylist.add("Hello");
                arraylist.add("Bye");
                arraylist.add("Thanks");
                arraylist.add("Good");
                arraylist.add("Done");



            }
        });
        removeitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arraylist.remove(2);
//                arraylist.remove("don);

            }
        });
        showarraylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                list.setText(list.getText()+ "arraylist:");
                for (int i=0;i<arraylist.size();i++){
                    list.setText(list.getText()+arraylist.get(i)+",");

                }

            }

        });

    }

}
