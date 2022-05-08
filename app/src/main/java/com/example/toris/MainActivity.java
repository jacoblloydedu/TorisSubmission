package com.example.toris;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;
    private GoalListAdapter goalListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        myAppDatabase = Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,
                "goalsdb").allowMainThreadQueries().build();

        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();


        }
    }

    /** Called when the user taps the Settings button */
    public void settingsPage(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        // Do something in response to button

    }
    /** Called when the user taps the AddGoal button */
    public void backHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}