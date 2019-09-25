package com.example.madhu.login1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.madhu.login1.model.Request_Model;

import java.util.ArrayList;

class ListAdapterFragment extends BaseAdapter {
    Context context;
    ArrayList<Request_Model> RequestViewList;
    public ListAdapterFragment(Context context, ArrayList<Request_Model> rqView_list) {
        this.context=context;
        this.RequestViewList=rqView_list;
    }

    @Override
    public int getCount() {
        return RequestViewList.size();
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
        View view=LayoutInflater.from(context).inflate(R.layout.fragment_list,parent,false);
        TextView ItemsDescription,ItemsNumber,ItemsDate,ItemsCost;
        ItemsDescription=view.findViewById(R.id.ItemsDescription);
        ItemsNumber=view.findViewById(R.id.ItemNo);
        ItemsDate=view.findViewById(R.id.ItemDate);
        ItemsCost=view.findViewById(R.id.ItemCost);

        Request_Model request_model=this.RequestViewList.get(position);

        ItemsDescription.setText(String.valueOf(request_model.getItemsDescription()));
        ItemsNumber.setText(String.valueOf(request_model.getItemsNumber()));
        ItemsCost.setText(String.valueOf(request_model.getItemsCost()));
        ItemsDate.setText(String.valueOf(request_model.getItemsDate()));
        return view;

    }
}
