package com.carmel.bootcamp.madhu.androidscreens;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.carmel.bootcamp.madhu.androidscreens.Delegates.AddPeopleDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;



public class RequisitionAddPeopleFragment extends Fragment {
    ListView addPeopleListview;
    public View rootView;
    ImageView addPeopleImage;
    ArrayList<InvitePeopleModel> addPeopleList=new ArrayList<>();
    private AddPeopleDelegate addPeopleDelegate;

    String json_string="{\"InvitePeople\":[{\"name\":\"Luke Ray\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"}," +
            "{\"name\":\"Daisy Lake\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Mark SMith\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Richard Keys\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Amith Sharma\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Shruthi Iyer\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Kumar Sravan\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Ananya Pandit\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Peter Dcruz\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"},"+
            "{\"name\":\"Hussain Mallik\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"}]}";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView=inflater.inflate(R.layout.fragment_requisition_add_people, container, false);
        addPeopleListview=rootView.findViewById(R.id.addPeopleListview);
        addPeopleImage=rootView.findViewById(R.id.addPeopleAddIcon);

        addPeopleListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(addPeopleDelegate!= null){
                    addPeopleDelegate.onClickRemovePeople();
                }

            }
        });

    String data = "";
    try {
        JSONObject  jsonRootObject = new JSONObject(json_string);
        JSONArray jsonArray = jsonRootObject.optJSONArray("InvitePeople");

        for(int i=0;i < jsonArray.length();i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String addPeopleName = jsonObject.optString("name");
            String addPeopleDescription=jsonObject.optString("description");

            InvitePeopleModel invitePeopleModel=new InvitePeopleModel();
            invitePeopleModel.setInvtePeopleName(addPeopleName);
            invitePeopleModel.setInvitePeopleDescription(addPeopleDescription);
            addPeopleList.add(invitePeopleModel);
        }
    } catch (JSONException e) {
        e.printStackTrace();
    }
        ListAdapter adapter=new AddPeopleListAdapter(rootView.getContext(),addPeopleList);
        addPeopleListview.setAdapter(adapter);
        return rootView;
    }
    public void setAddPeopleDelegate(AddPeopleDelegate addPeopleDelegate){
        this.addPeopleDelegate=addPeopleDelegate;
    }

}







//
//        InvitePeopleModel invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Luke Ray");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Daisy Luke");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Mark Smith");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Daisy Luke");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Mark Smith");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);
//
//        invitePeopleModel=new InvitePeopleModel();
//        invitePeopleModel.setInvtePeopleName("Mark Smith");
//        invitePeopleModel.setInvitePeopleDescription("Lorem ipsum dolor sit amet.");
//        addPeopleList.add(invitePeopleModel);

