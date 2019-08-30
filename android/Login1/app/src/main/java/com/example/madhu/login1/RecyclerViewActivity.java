package com.example.madhu.login1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class RecyclerViewActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        Button jsonbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.recyclerView);
        jsonbtn=findViewById(R.id.button4);
        jsonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RequestJSON_Activity.class);
                startActivity(intent);
            }
        });
//        String[] items={"CLEAR","APPROVED","AWATING","DRAFT","REJECTED"};
        String items_title[]={"PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056",
                "PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056",};
        String items_date[]={"06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019","06 Jul 2019",
                "06 Jul 2019","06 Jul 2019",};
        String items_status[]={"APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED","APPROVED"};
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        MyRecyclerListAdapter myRecyclerListAdapter= new MyRecyclerListAdapter(getApplicationContext(),items_title,items_date,items_status);
        recyclerView.setAdapter(myRecyclerListAdapter);
    }
}
