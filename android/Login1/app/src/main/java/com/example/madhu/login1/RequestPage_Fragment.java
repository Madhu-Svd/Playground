package com.example.madhu.login1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class RequestPage_Fragment extends Fragment {
  private View rootView;
  private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView= inflater.inflate(R.layout.fragment_request_page_, container, false);

        textView=rootView.findViewById(R.id.MyRequest);
        return rootView;



    }


}
