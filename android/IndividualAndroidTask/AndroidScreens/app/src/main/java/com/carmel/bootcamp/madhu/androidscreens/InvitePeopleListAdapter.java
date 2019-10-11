package com.carmel.bootcamp.madhu.androidscreens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import java.util.ArrayList;

class InvitePeopleListAdapter extends BaseAdapter {
    ArrayList<InvitePeopleModel> invitePeopleList;
    private Context context;

    public InvitePeopleListAdapter(Context context, ArrayList<InvitePeopleModel> invitePeopleList) {
        this.context = context;
        this.invitePeopleList = invitePeopleList;
    }


    @Override
    public int getCount() {
        return invitePeopleList.size();
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
        View view = LayoutInflater.from(context).inflate(R.layout.invite_people_list, parent, false);
        TextView ipName, ipDescription;
        ImageView peopleProfile, deleteIcon;
        ipName = view.findViewById(R.id.profileName);
        ipDescription = view.findViewById(R.id.peopleText);
        peopleProfile = view.findViewById(R.id.profilePicture);
        deleteIcon = view.findViewById(R.id.deleteIcon);

        InvitePeopleModel invitePeopleModel = this.invitePeopleList.get(position);

        ipName.setText(String.valueOf(invitePeopleModel.getInvtePeopleName()));
        ipDescription.setText(String.valueOf(invitePeopleModel.getInvitePeopleDescription()));
        peopleProfile.setImageResource(R.drawable.profile_icon);
        deleteIcon.setImageResource(R.drawable.delete_icon);
        return view;
    }
}
