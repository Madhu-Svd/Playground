package com.example.madhu.login1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter   {
    ArrayList<String> title_text;
    ArrayList<String> status_text;
    ArrayList<String> approvaldate;
//    array declaration
//    String items_title[]={};
//    String items_date[]={};
//    String items_staus[]={};
    private Context context;
    public MyListAdapter(Context context, ArrayList<String> title, ArrayList<String> dateofapproval, ArrayList<String> status) {
        this.context=context;
        this.title_text=title;
        this.status_text=status;
        this.approvaldate=dateofapproval;
    }
    @Override
    public int getCount() {
        return title_text.size();
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
        TextView title,dateapproval,status;
        ImageView imageView;
        title=view.findViewById(R.id.it_title);
        dateapproval=view.findViewById(R.id.it_date);
        status=view.findViewById(R.id.it_status);
        imageView=view.findViewById(R.id.imageView7);

        title.setText( title_text.get(position));
        status.setText(status_text.get(position));
        dateapproval.setText(approvaldate.get(position));
        imageView.setImageResource(R.drawable.bell_icon);
        return view;
//        using array
//        title.setText(String.valueOf(items_title[position]));
//        date.setText(String.valueOf(items_date[position]));
//        status.setText(String.valueOf(items_staus[position]));

    }
}
