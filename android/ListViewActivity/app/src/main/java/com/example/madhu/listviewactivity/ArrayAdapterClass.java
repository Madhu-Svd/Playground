package com.example.madhu.listviewactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ArrayAdapterClass extends BaseAdapter{
    ArrayList<String> title_text;
    ArrayList<String> status_text;
    ArrayList<String> approvaldate;
    private Context context;
    public ArrayAdapterClass(Context Context, ArrayList<String> title, ArrayList<String> status, ArrayList<String> dateofapproval) {
        this.title_text=title;
        this.status_text=status;
        this.approvaldate=dateofapproval;
        this.context=Context;
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
        TextView title,status,dateapproval;
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
    }
}
