package com.example.madhu.login1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.madhu.login1.global.RequestStatus;
import com.example.madhu.login1.model.Request_Model;

import java.util.ArrayList;

public class RequestPage_BurgerMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

         android.widget.ListPopupWindow listPopupWindow;
         ListView listView;
         Button newrequest;
         TextView showMoreText;

//    ArrayList<String> title=new ArrayList<>();
//    ArrayList<String> status=new ArrayList<>();
//    ArrayList<String> dateofapproval=new ArrayList<>();
    ArrayList<Request_Model> request_list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_page__burger_menu);
        newrequest=findViewById(R.id.newRequestBtn);
        showMoreText=findViewById(R.id.showMore);
        ImageView filter_image =(ImageView) findViewById(R.id.filter_icon);
        ImageView bell_image=(ImageView) findViewById(R.id.bellicon);
        listPopupWindow=new android.widget.ListPopupWindow(getApplicationContext());
        final TextView listpopup=(TextView)findViewById(R.id.popupmenu);
        listView=findViewById(R.id.requestList);
//      String[] items_list={"CLEAR","APPROVED","AWATING","DRAFT","REJECTED"};
        String[] items={"CLEAR","APPROVED","AWATING","DRAFT","REJECTED"};

        Request_Model request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-056");
        request_model.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        request_model.setRequestDate("21-05-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-057");
        request_model.setRequestStatus(RequestStatus.APPROVED);
        request_model.setRequestDate("21-05-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-058");
        request_model.setRequestStatus(RequestStatus.REJECTED);
        request_model.setRequestDate("21-05-2019");
        request_list.add(request_model);

        request_model=new Request_Model();
        request_model.setRequestNumber("PUR-2019-059");
        request_model.setRequestStatus(RequestStatus.DRAFT);
        request_model.setRequestDate("21-05-2019");
        request_list.add(request_model);

        ListAdapter adapter=new MyListAdapter(getApplicationContext(),request_list);
        listView.setAdapter(adapter);

//        ListAdapter adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.list_popup_menu,items_list);
//        listView.setAdapter(adapter);
        listPopupWindow.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.list_popup_menu,items));
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
                Intent intent=new Intent(getApplicationContext(),RequisitionForm.class);
                startActivity(intent);
            }
        });
        showMoreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RecyclerViewActivity.class);
                startActivity(intent);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.request_page__burger_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }
//        else if (id == R.id.nav_share) {
//
//        }
//        else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
