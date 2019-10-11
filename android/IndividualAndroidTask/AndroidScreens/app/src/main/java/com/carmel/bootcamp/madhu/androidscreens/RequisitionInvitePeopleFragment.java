package com.carmel.bootcamp.madhu.androidscreens;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.carmel.bootcamp.madhu.androidscreens.Delegates.RequisitionDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class RequisitionInvitePeopleFragment extends Fragment {
    RecyclerView invitePeopleRecyclerview;
    public View rootView;
    ImageView addImageClick;
    ArrayList<InvitePeopleModel> invitePeopleList = new ArrayList<>();
    private RequisitionDelegate requisitionDelegate;


    String url = "https://mywebsiterequest.000webhostapp.com/data.json";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_requisition_invite_people, container, false);
        invitePeopleRecyclerview = rootView.findViewById(R.id.invitePeopleRecyclerView);
        addImageClick = rootView.findViewById(R.id.ADDIcon);

        addImageClick.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (requisitionDelegate != null) {
                    requisitionDelegate.onClickAddPeople();
                }

            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        invitePeopleRecyclerview.setLayoutManager(linearLayoutManager);

        //Using Assets Folder JSON File
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray jsonArray = obj.getJSONArray("InvitePeople");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String ipName = jsonObject.optString("name");
                String ipDescription = jsonObject.optString("description");

                InvitePeopleModel invitePeopleModel = new InvitePeopleModel();
                invitePeopleModel.setInvtePeopleName(ipName);
                invitePeopleModel.setInvitePeopleDescription(ipDescription);
                invitePeopleList.add(invitePeopleModel);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //Using Volley Request
//        addImageClick.setOnClickListener(new AdapterView.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////
////                if(requisitionDelegate != null){
////                    requisitionDelegate.onClickAddPeople();
////
////               }
//
//                StringRequest request = new StringRequest(url, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        responseJSONData(response);
////                        progressDialog.dismiss();
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getContext(), "this is an error", Toast.LENGTH_LONG).show();
//                    }
//
//                });
//                RequestQueue rQueue = Volley.newRequestQueue(rootView.getContext());
//                rQueue.add(request);
//            }
//        });


//        InvitePeopleModel invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        invitePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Daisy Luke");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        invitePeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Mark Smith");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        invitePeopleList.add(invitePeopleModel);
//
//        ListAdapter adapter=new InvitePeopleListAdapter(rootView.getContext(),invitePeopleList);
//        peopleListview.setAdapter(adapter);

        InvitePeopleRecyclerAdapter customAdapter = new InvitePeopleRecyclerAdapter(rootView.getContext(), invitePeopleList);
        invitePeopleRecyclerview.setAdapter(customAdapter);
        return rootView;
    }

    private String loadJSONFromAsset() {
        String json = "";
        try {

            InputStream is = getActivity().getAssets().open("people.json");
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


    public void setRequisitionDelegate(RequisitionDelegate requisitionDelegate) {
        this.requisitionDelegate = requisitionDelegate;
    }
}

//    public void responseJSONData(String response) {
//        Log.d("response", response);
//        try {
//            JSONObject object = new JSONObject(response);
//            Log.d("JSON", String.valueOf(object));
//            invitePeopleRecyclerview.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
//            InvitePeopleRecyclerListAdapterJson invitePeopleRecyclerListAdapterJson = new InvitePeopleRecyclerListAdapterJson(getContext(), object);
//            invitePeopleRecyclerview.setAdapter(invitePeopleRecyclerListAdapterJson);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }

