package com.example.madhu.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> title=new ArrayList<>();
    ArrayList<String> status=new ArrayList<>();
    ArrayList<String> dateofapproval=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listviewid);

            title.add("PUR-2019-056");
            title.add("PUR-2019-057");
            title.add("PUR-2019-058");
            title.add("PUR-2019-059");

            status.add("APPROVED");
            status.add("REJECTED");
            status.add("DRAFT");
            status.add("CANCEL");

            dateofapproval.add("21-05-2019");
            dateofapproval.add("22-05-2019");
            dateofapproval.add("23-05-2019");
            dateofapproval.add("24-05-2019");
        ArrayAdapterClass adapter=new ArrayAdapterClass(getApplicationContext(),title,status,dateofapproval);
        listView.setAdapter(adapter);



    }
}
