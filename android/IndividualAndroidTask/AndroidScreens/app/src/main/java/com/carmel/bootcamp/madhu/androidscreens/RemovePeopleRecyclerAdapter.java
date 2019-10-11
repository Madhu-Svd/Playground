package com.carmel.bootcamp.madhu.androidscreens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import java.util.ArrayList;

class RemovePeopleRecyclerAdapter extends RecyclerView.Adapter<RemovePeopleRecyclerAdapter.ViewHolder> {
    ArrayList<InvitePeopleModel> removePeopleList;
    private Context context;
    public RemovePeopleRecyclerAdapter(Context context, ArrayList<InvitePeopleModel> removePeopleList) {
        this.context=context;
        this.removePeopleList=removePeopleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.remove_people_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final InvitePeopleModel invitePeopleModel=this.removePeopleList.get(i);
        viewHolder.removePeopleName.setText(invitePeopleModel.getInvtePeopleName());
        viewHolder.removePeopleDescription.setText(invitePeopleModel.getInvitePeopleDescription());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, invitePeopleModel.getInvtePeopleName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return removePeopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView removePeopleName,removePeopleDescription;
                ImageView peopleProfile,addIcon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            removePeopleName=itemView.findViewById(R.id.removeProfileName);
        removePeopleDescription=itemView.findViewById(R.id.profileText);
        peopleProfile=itemView.findViewById(R.id.removeProfilePicture);
        addIcon=itemView.findViewById(R.id.removePeopleRemoveIcon);
        }
    }













    //Using ListView extends BaseAdapter
//    @Override
//    public int getCount() {
//        return removePeopleList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View view=LayoutInflater.from(context).inflate(R.layout.remove_people_list,parent,false);
//        TextView removePeopleName,removePeopleDescription;
//        ImageView peopleProfile,addIcon;
//        removePeopleName=view.findViewById(R.id.removeProfileName);
//        removePeopleDescription=view.findViewById(R.id.profileText);
//        peopleProfile=view.findViewById(R.id.removeProfilePicture);
//        addIcon=view.findViewById(R.id.removePeopleAddIcon);
//
//        InvitePeopleModel invitePeopleModel=this.removePeopleList.get(position);
//
//        removePeopleName.setText(String.valueOf(invitePeopleModel.getInvtePeopleName()));
//        removePeopleDescription.setText(String.valueOf(invitePeopleModel.getInvitePeopleDescription()));
//        peopleProfile.setImageResource(R.drawable.profile_icon);
//        addIcon.setImageResource(R.drawable.remove_icon);
//        return view;
//    }
}
