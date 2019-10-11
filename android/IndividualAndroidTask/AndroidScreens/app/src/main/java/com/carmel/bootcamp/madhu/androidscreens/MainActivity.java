package com.carmel.bootcamp.madhu.androidscreens;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.carmel.bootcamp.madhu.androidscreens.Delegates.AddPeopleDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Delegates.NoResultFoundDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Delegates.RemovePeopleDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Delegates.RequisitionDelegate;
import com.carmel.bootcamp.madhu.androidscreens.Model.InvitePeopleModel;

public class MainActivity extends AppCompatActivity implements RequisitionDelegate,AddPeopleDelegate,RemovePeopleDelegate,NoResultFoundDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequisitionInvitePeopleFragment invitePeopleFragment = new RequisitionInvitePeopleFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        invitePeopleFragment.setRequisitionDelegate(this);
        fragmentTransaction.add(R.id.FrameLayoutPlaceHolder,invitePeopleFragment).commit();

    }

    @Override
    public void onClickAddPeople() {
        RequisitionAddPeopleFragment requisitionAddPeopleFragment=new RequisitionAddPeopleFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        requisitionAddPeopleFragment.setAddPeopleDelegate(this);
        fragmentTransaction.add(R.id.FrameLayoutPlaceHolder,requisitionAddPeopleFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onClickRemovePeople() {
        RequisitionRemovePeopleFragment requisitionRemovePeopleFragment=new RequisitionRemovePeopleFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        requisitionRemovePeopleFragment.setRemovePeopleDelegate(this);
        fragmentTransaction.replace(R.id.FrameLayoutPlaceHolder,requisitionRemovePeopleFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onClickSearchPeople() {
        NoResultFoundFragment noResultFoundFragment=new NoResultFoundFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        noResultFoundFragment.setNoResultFoundDelegate(this);
        fragmentTransaction.add(R.id.FrameLayoutPlaceHolder,noResultFoundFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onClickSerchView() {
        ResultFoundFragment resultFoundFragment=new ResultFoundFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FrameLayoutPlaceHolder,resultFoundFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
