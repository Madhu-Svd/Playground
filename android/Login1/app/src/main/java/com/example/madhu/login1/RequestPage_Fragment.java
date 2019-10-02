package com.example.madhu.login1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.madhu.login1.Delegates.RequestDelegate;
import com.example.madhu.login1.global.RequestStatus;
import com.example.madhu.login1.model.Request_Model;

import java.util.ArrayList;


public class RequestPage_Fragment extends Fragment {
    private View rootView;
    android.widget.ListPopupWindow listPopupWindow;
    ListView listView;
    Button newrequest;
    TextView showMoreText;
    ArrayList<Request_Model> request_list=new ArrayList<>();

    public static final String KEY_REQUESTNUMBER="RequestNumber";
    public static final String KEY_REQUESTSTATUS="requestStatus";
    public static final String KEY_REQUESTDATE = "RequestDate";

    private RequestDelegate requestDelegate;

    protected void onSavedInsatnceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("listView", String.valueOf(listView));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView= inflater.inflate(R.layout.fragment_request_page_, container, false);

        newrequest=rootView.findViewById(R.id.NewRequestBtn);
        showMoreText=rootView.findViewById(R.id.ShowMore);
        ImageView filter_image =(ImageView) rootView.findViewById(R.id.Filter_Icon);
        ImageView bell_image=(ImageView) rootView.findViewById(R.id.bellicon);
        listPopupWindow=new android.widget.ListPopupWindow(rootView.getContext());
        final TextView listpopup=(TextView)rootView.findViewById(R.id.popupmenu);
        listView=rootView.findViewById(R.id.RequestListView);
        String[] items={"CLEAR","APPROVED","AWATING","DRAFT","REJECTED"};


        Request_Model request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-056");
        request_model.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        request_model.setRequestDate("21-05-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-057");
        request_model.setRequestStatus(RequestStatus.APPROVED);
        request_model.setRequestDate("21-06-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-058");
        request_model.setRequestStatus(RequestStatus.REJECTED);
        request_model.setRequestDate("21-07-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-059");
        request_model.setRequestStatus(RequestStatus.DRAFT);
        request_model.setRequestDate("21-08-2019");
        request_list.add(request_model);

        ListAdapter adapter=new MyListAdapter(rootView.getContext(),request_list);
        listView.setAdapter(adapter);

//        ListAdapter adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.list_popup_menu,items_list);
//        listView.setAdapter(adapter);
        listPopupWindow.setAdapter(new ArrayAdapter(rootView.getContext(),R.layout.list_popup_menu,items));
        listPopupWindow.setAnchorView(filter_image);
        listPopupWindow.setModal(true);
        filter_image.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });
        newrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(rootView.getContext(),RequisitionForm.class);
                startActivity(intent);
            }
        });


        showMoreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(rootView.getContext(),RecyclerViewActivity.class);
                startActivity(intent);
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Request_Model request_model=request_list.get(position);
                if(requestDelegate != null){
                    requestDelegate.OnClickRequestItem(request_model);

                }
            }
        });

        return rootView;

    }



    public void setRequestDelegate(RequestDelegate requestDelegate){
        this.requestDelegate = requestDelegate;
    }



}
