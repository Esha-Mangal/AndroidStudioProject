package com.example.navigation2;

import android.os.Bundle;

import com.example.navigation2.ui.chats.ChatsFragment;
import com.example.navigation2.ui.feedback.FeedbackFragment;
import com.example.navigation2.ui.filter.FilterFragment;
import com.example.navigation2.ui.home.HomeFragment;
import com.example.navigation2.ui.tools.ToolsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private BottomNavigationView bottomNavigationView;
//    private HomeFragment homeFragment;
//    private ChatsFragment chatsFragment;
//    private FilterFragment filterFragment;
//    private ToolsFragment toolsFragment;
//    private FeedbackFragment feedbackFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        homeFragment = new HomeFragment();
//        chatsFragment = new ChatsFragment();
//        filterFragment = new FilterFragment();
//        toolsFragment = new ToolsFragment();
//        feedbackFragment = new FeedbackFragment();
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//                switch (menuItem.getItemId()){
//
//                    case R.id.nav_home:
//                        setFragment(homeFragment);
//                        return true;
//
//                    case R.id.nav_chat:
//                        setFragment(chatsFragment);
//                        return true;
//
//                    case R.id.nav_filter:
//                        setFragment(filterFragment);
//                        return true;
//
//                    case R.id.nav_tools:
//                        setFragment(toolsFragment);
//                        return true;
//
//                    case R.id.nav_feedback:
//                        setFragment(feedbackFragment);
//                        return true;
//
//                    default:
//                        return false;
//                }
//            }
//        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


//    private void setFragment(Fragment fragment) {
//        //Bottom navigation view;
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        bottomNavigationView = (BottomNavigationView)findViewById(R.id.main_nav);
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, R.id.nav_chat, R.id.nav_filter,
//                R.id.nav_tools, R.id.nav_feedback)
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);
//       FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
//        fragmentTransaction.commit();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.main_nav);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_chat, R.id.nav_filter,
                R.id.nav_tools, R.id.nav_feedback)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
