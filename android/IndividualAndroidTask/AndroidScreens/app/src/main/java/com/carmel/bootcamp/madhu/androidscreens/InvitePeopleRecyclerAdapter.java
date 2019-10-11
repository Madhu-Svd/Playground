package com.carmel.bootcamp.madhu.androidscreens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;
import java.util.ArrayList;

class InvitePeopleRecyclerAdapter extends RecyclerView.Adapter<InvitePeopleRecyclerAdapter.ViewHolder> {
    ArrayList<InvitePeopleModel> invitePeoplelist;
    Context context;

    public InvitePeopleRecyclerAdapter(Context context, ArrayList<InvitePeopleModel> invitePeopleList) {
        this.context=context;
        this.invitePeoplelist=invitePeopleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.invite_people_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v); // pass the view to View Holder
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final InvitePeopleModel invitePeopleModel=this.invitePeoplelist.get(i);
        viewHolder.profileName.setText(invitePeopleModel.getInvtePeopleName());
        viewHolder.profileDescription.setText(invitePeopleModel.getInvitePeopleDescription());
       viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, invitePeopleModel.getInvtePeopleName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return invitePeoplelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView profileName,profileDescription;
                ImageView profileImageView,deleteImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileName=itemView.findViewById(R.id.profileName);
            profileDescription=itemView.findViewById(R.id.peopleText);
            profileImageView=itemView.findViewById(R.id.profilePicture);
            deleteImageView=itemView.findViewById(R.id.deleteIcon);
        }
    }
}
