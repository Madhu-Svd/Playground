package com.example.madhu.login1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListAdapter extends BaseAdapter   {
    String items_title[]={};
    String items_date[]={};
    String items_staus[]={};
    private Context context;
    public MyListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.items_title=title;
        this.items_date=date;
        this.items_staus=status;
    }
    @Override
    public int getCount() {
        return items_title.length;
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
        TextView title,date,status;
        ImageView imageView;
        title=view.findViewById(R.id.it_title);
        date=view.findViewById(R.id.it_date);
        status=view.findViewById(R.id.it_status);
        imageView=view.findViewById(R.id.imageView7);

        title.setText(String.valueOf(items_title[position]));
        date.setText(String.valueOf(items_date[position]));
        status.setText(String.valueOf(items_staus[position]));
        imageView.setImageResource(R.drawable.bell_icon);
        return view;
    }
}
