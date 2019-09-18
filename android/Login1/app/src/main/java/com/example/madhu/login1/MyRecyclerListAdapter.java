package com.example.madhu.login1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class MyRecyclerListAdapter extends RecyclerView.Adapter {
    String items_No[]={};
    String items_date[]={};
    String items_staus[]={};
    private Context context;
    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.items_No=title;
        this.items_date=date;
        this.items_staus=status;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.itemlist,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
    MyRecyclerListAdapter.MyViewHolder myViewHolder=(MyRecyclerListAdapter.MyViewHolder)viewHolder;
    myViewHolder.setdata(String.valueOf(items_No[position]),String.valueOf(items_date[position]),String.valueOf(items_staus[position]));
    }

    @Override
    public int getItemCount() {
        return items_No.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,date,status;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.it_No);
            date=itemView.findViewById(R.id.it_date);
            status=itemView.findViewById(R.id.it_status);
            imageView=itemView.findViewById(R.id.bellicon);

        }
        public void setdata(String items_title,String items_date,String items_staus){
            title.setText(items_title);
            date.setText(items_date);
            status.setText(items_staus);
            imageView.setImageResource(R.drawable.bell_icon);

        }
    }
}
