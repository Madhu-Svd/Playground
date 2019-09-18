package com.example.madhu.login1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MyRecyclerListAdapterJson extends RecyclerView.Adapter<MyRecyclerListAdapterJson.MyViewHolder> {
    private Context context;
    JSONObject datalist;
    public MyRecyclerListAdapterJson(Context context, JSONObject object) {
        this.context=context;
        this.datalist=new JSONObject();
        this.datalist=object;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.itemlist,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        MyViewHolder myViewHolder1=myViewHolder;
        try{
            JSONArray jsonArray=datalist.getJSONArray("data");
            JSONObject object=jsonArray .getJSONObject(i);
            myViewHolder1.setData(object);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        try {
            return datalist.getJSONArray("data").length();

        } catch (JSONException e) {
            return Integer.parseInt(null);
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView items_No,items_date,items_status;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            items_No=itemView.findViewById(R.id.it_No);
            items_date=itemView.findViewById(R.id.it_date);
            items_status=itemView.findViewById(R.id.it_status);
            imageView=itemView.findViewById(R.id.bellicon);

        }

        public void setData(JSONObject object) {
            try {
                items_No.setText(object.getString("title`"));
                items_date.setText(object.getString("date"));
                items_status.setText(object.getString("status"));
                imageView.setImageResource(R.drawable.bell_icon);


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}
