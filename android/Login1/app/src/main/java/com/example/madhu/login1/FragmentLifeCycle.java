package com.example.madhu.login1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_life_cycle);
        addFrgment();
    }
    public void addFrgment(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        RQ_AddItemsFragment rq_addItemsFragment=new RQ_AddItemsFragment();
        fragmentTransaction.add(R.id.FragmentPlaceHolder,rq_addItemsFragment);
        fragmentTransaction.commit();

    }
}
