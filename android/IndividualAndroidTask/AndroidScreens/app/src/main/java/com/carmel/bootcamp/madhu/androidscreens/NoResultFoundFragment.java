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
import android.widget.SearchView;

import com.carmel.bootcamp.madhu.androidscreens.Delegates.NoResultFoundDelegate;


public class NoResultFoundFragment extends Fragment {

    public View rootView;
    SearchView searchView;
    private NoResultFoundDelegate noResultFoundDelegate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_no_result_found, container, false);
        searchView=rootView.findViewById(R.id.searchViewNoResultFound);
        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(noResultFoundDelegate!=null){
                    noResultFoundDelegate.onClickSerchView();
                }
            }
        });
        return rootView;
    }
    void setNoResultFoundDelegate(NoResultFoundDelegate noResultFoundDelegate){
        this.noResultFoundDelegate=noResultFoundDelegate;
    }

}
