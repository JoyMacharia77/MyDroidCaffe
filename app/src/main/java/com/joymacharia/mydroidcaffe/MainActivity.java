package com.joymacharia.mydroidcaffe;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    //nav
   // private AppBarConfiguration mAppBarConfiguration;
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        //Inflate Toolbar
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        //Create an instance of tab layout and add the tabs
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label_1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label_2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label_3));
        //set the tab to fill the layout
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //use the pager adapter to manage screens
        //create an instance of the view pager
        final ViewPager viewPager = findViewById(R.id.view_pager);
        //create an instance of the Pager Adapter Class
        final PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        //Set the adapter to the viewpager
        viewPager.setAdapter(pagerAdapter);
        //set listener for clicks
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Navigation
       /* DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
    }
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_contactUs:
                //Implement an implicit intent that calls your cafe number
                Uri myUri = Uri.parse("tel:0710203040");
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);
                return true;
            case R.id.nav_aboutUs:
                //Implement an implicit intent that displays a web page
                Uri myAboutUri = Uri.parse("https://www.artcaffe.co.ke/about/");
                Intent myAboutIntent = new Intent(Intent.ACTION_VIEW, myAboutUri);
                startActivity(myAboutIntent);
                return true;
            //LOCATE US
            case R.id.nav_locateUs:
                //Implement an implicit intent that displays a web page
                Uri myLocateUri = Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345");
                Intent myLocateIntent = new Intent(Intent.ACTION_VIEW, myLocateUri);
                startActivity(myLocateIntent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    } */
    public void displayToast(String message)
    {
        Toast toast= Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void contact(MenuItem item)
    {
        Uri myUri = Uri.parse("tel:0710203040");
        Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
        startActivity(myIntent);
    }

    public void about(MenuItem item)
    {
        Uri myAboutUri = Uri.parse("https://www.artcaffe.co.ke/about/");
        Intent myAboutIntent = new Intent(Intent.ACTION_VIEW, myAboutUri);
        startActivity(myAboutIntent);
    }

    public void locate(MenuItem item)
    {
        Uri myLocateUri = Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345");
        Intent myLocateIntent = new Intent(Intent.ACTION_VIEW, myLocateUri);
        startActivity(myLocateIntent);
    }

    public void cocktails(MenuItem item)
    {
        setContentView(R.layout.fragment_gallery);
    }

    public void back(View view)
    {
        Intent backIntent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(backIntent);
       /* mOrderMessage = getString(R.string.error);
        displayToast(mOrderMessage); */
    }

    public void pizza(MenuItem item) {
        setContentView(R.layout.fragment_slideshow);
    }


    public void pasta(MenuItem item) {
        setContentView(R.layout.fragment_pasta);
    }


    public void swipe(View view) {

        mOrderMessage = getString(R.string.swipe);
        displayToast(mOrderMessage);
    }

    public void share(View view)
    {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, "SHARE APP");
        startActivity(sendIntent);
    }

    public void shareNav(MenuItem item)
    {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, "SHARE APP");
        startActivity(sendIntent);
    }
}
