package com.carmel.bootcamp.madhu.androidscreens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import java.util.ArrayList;

class AddPeopleListAdapter extends BaseAdapter {
    ArrayList<InvitePeopleModel> addPeopleList;
    private Context context;

    public AddPeopleListAdapter(Context context, ArrayList<InvitePeopleModel> addPeopleList) {
        this.addPeopleList=addPeopleList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return addPeopleList.size();
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
        View view=LayoutInflater.from(context).inflate(R.layout.add_people_list,parent,false);
        TextView addPeopleName,addPeopleDescription;
        ImageView peopleProfile,addIcon;
        addPeopleName=view.findViewById(R.id.addprofileName);
        addPeopleDescription=view.findViewById(R.id.profileText);
        peopleProfile=view.findViewById(R.id.addprofilePicture);
       addIcon=view.findViewById(R.id.addPeopleAddIcon);

        InvitePeopleModel invitePeopleModel=this.addPeopleList.get(position);

        addPeopleName.setText(String.valueOf(invitePeopleModel.getInvtePeopleName()));
        addPeopleDescription.setText(String.valueOf(invitePeopleModel.getInvitePeopleDescription()));
        peopleProfile.setImageResource(R.drawable.profile_icon);
        addIcon.setImageResource(R.drawable.add_icon);
        return view;
    }
}
