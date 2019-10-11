package com.carmel.bootcamp.madhu.androidscreens;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.carmel.bootcamp.madhu.androidscreens.Delegates.RemovePeopleDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Delegates.RequisitionDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class RequisitionRemovePeopleFragment extends Fragment {
    RecyclerView removeRecyclerview;
    public View rootView;
    ArrayList<InvitePeopleModel> removePeopleList=new ArrayList<>();
    SearchView searchView;
    private RemovePeopleDelegate removePeopleDelegate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView=inflater.inflate(R.layout.fragment_requisition_remove_people, container, false);
        removeRecyclerview=rootView.findViewById(R.id.removePeopleRecyclerview);
        searchView=rootView.findViewById(R.id.removeSearchView);

        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(removePeopleDelegate!=null){
                    removePeopleDelegate.onClickSearchPeople();
                }
//                NoResultFoundFragment noResultFoundFragment=new NoResultFoundFragment();
//                FragmentManager fragmentManager=getFragmentManager();
//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//                fragmentTransaction.add(R.id.FrameLayoutPlaceHolder,noResultFoundFragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        removeRecyclerview.setLayoutManager(linearLayoutManager);

        try {
            // get JSONObject from JSON file
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            // fetch JSONArray named users
            JSONArray jsonArray = obj.getJSONArray("InvitePeople");
            // implement for loop for getting users list data
            for (int i = 0; i < jsonArray.length(); i++) {
                // create a JSONObject for fetching single user data
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String removePeopleName = jsonObject.optString("name");
                String removePeopleDescription=jsonObject.optString("description");

                InvitePeopleModel invitePeopleModel=new InvitePeopleModel();
                invitePeopleModel.setInvtePeopleName(removePeopleName);
                invitePeopleModel.setInvitePeopleDescription(removePeopleDescription);
                removePeopleList.add(invitePeopleModel);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        InvitePeopleModel invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        removePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        removePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        removePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        removePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        removePeopleList.add(invitePeopleModel);

        RemovePeopleRecyclerAdapter adapter=new RemovePeopleRecyclerAdapter(rootView.getContext(),removePeopleList);
        removeRecyclerview.setAdapter(adapter);
        return rootView;
    }
    private String loadJSONFromAsset() {
        String json = "";
        try {

            InputStream is =getActivity().getAssets().open("people.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public void setRemovePeopleDelegate(RemovePeopleDelegate removePeopleDelegate) {
        this.removePeopleDelegate = removePeopleDelegate;
    }

}
