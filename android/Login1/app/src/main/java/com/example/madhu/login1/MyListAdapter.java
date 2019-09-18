package com.example.madhu.login1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madhu.login1.global.RequestStatus;
import com.example.madhu.login1.model.Request_Model;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter   {
    ArrayList<Request_Model> request;
    private Context context;
    public MyListAdapter(Context context, ArrayList<Request_Model> request) {
        this.context=context;
        this.request=request;
    }
    @Override
    public int getCount() {
        return request.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(context).inflate(R.layout.itemlist,parent,false);
        TextView request_No,dateapproval,status;
        ImageView imageView;
        request_No=view.findViewById(R.id.it_No);
        dateapproval=view.findViewById(R.id.it_date);
        status=view.findViewById(R.id.it_status);
        imageView=view.findViewById(R.id.bellicon);

        Request_Model request_model=this.request.get(position);

        request_No.setText(String.valueOf(request_model.getRequestNumber()));
        status.setText(String.valueOf(request_model.getRequestStatus()));
        dateapproval.setText(String.valueOf(request_model.getRequestDate()));
        imageView.setImageResource(R.drawable.bell_icon);
        return view;
//        using array
//        title.setText(String.valueOf(items_title[position]));
//        date.setText(String.valueOf(items_date[position]));
//        status.setText(String.valueOf(items_staus[position]));

    }
}
