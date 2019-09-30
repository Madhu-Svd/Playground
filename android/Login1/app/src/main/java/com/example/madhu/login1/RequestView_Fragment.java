package com.example.madhu.login1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.madhu.login1.global.RequestStatus;
import com.example.madhu.login1.model.Request_Model;

import java.util.ArrayList;


public class RequestView_Fragment extends Fragment {

    TextView RQ_No, RQ_Date, RQ_Status;
    private View rootview;
    ListView RQ_View_Listview;
    Request_Model requestModel;
    ArrayList<Request_Model> RQView_list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_request_view_, container, false);
//
        RQ_No = rootview.findViewById(R.id.RequestNumber);
        RQ_Date = rootview.findViewById(R.id.RequestDateF);
        RQ_Status = rootview.findViewById(R.id.RequestStatusF);
        RQ_View_Listview = rootview.findViewById(R.id.ListViewFragment);

        RQ_No.setText(requestModel.getRequestNumber());
        RQ_Date.setText(requestModel.getRequestDate());
        RQ_Status.setText(requestModel.getRequestStatus().toString());


        Request_Model request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("05-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula.");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("05-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula.");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("05-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);

        request_model = new Request_Model();
        request_model.setItemsDescription("Lorem ipsum dolor sit amet,consectetur adipscing elit.Mauris mattis,tortor sit amet tempor vehicula. ");
        request_model.setItemsNumber("01");
        request_model.setItemsDate("5-05-2019");
        request_model.setItemsCost("RS 45,000");
        RQView_list.add(request_model);
//        ListAdapter adapter=new MyListAdapter(getContext(),RQView_list);

        ListAdapter adapter = new ListAdapterFragment(rootview.getContext(), RQView_list);
        RQ_View_Listview.setAdapter(adapter);
        return rootview;
    }

    public void setData(Request_Model requestModel) {
        this.requestModel = requestModel;
    }

}
