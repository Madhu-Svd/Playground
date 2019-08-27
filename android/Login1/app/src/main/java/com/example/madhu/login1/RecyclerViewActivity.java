package com.example.madhu.login1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
        RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.recyclerView);
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
