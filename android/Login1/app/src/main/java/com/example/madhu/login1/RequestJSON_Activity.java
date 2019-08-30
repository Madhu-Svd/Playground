package com.example.madhu.login1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RequestJSON_Activity extends AppCompatActivity {
    RecyclerView recyclerView;
//    String url="https://MyCreativeWebsite.000webhostapp.com/Request-data.json";
    String url= "https://mywebsiterequest.000webhostapp.com/data.json";
    String title[],date[],status[],text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_json_);
        Button dataloadbtn=(Button)findViewById(R.id.loadData);
         recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        dataloadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest request=new StringRequest(url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        responseJSONData(response);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "this is an error",Toast.LENGTH_LONG).show();
                    }

            });
                RequestQueue rQueue = Volley.newRequestQueue(RequestJSON_Activity.this);
                rQueue.add(request);
            }


        });
    }

    public void responseJSONData(String response) {
        Log.d("response",response);
        try {
            JSONObject object=new JSONObject(response);
            Log.d("JSON",String.valueOf(object));
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            MyRecyclerListAdapterJson myRecyclerListAdapterJson=new MyRecyclerListAdapterJson(getApplicationContext(),object);
            recyclerView.setAdapter(myRecyclerListAdapterJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
