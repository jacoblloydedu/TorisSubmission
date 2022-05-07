package com.example.toris;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddGoalActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_goal);
        fragmentManager = getSupportFragmentManager();
        MyAppDatabase db = Room.databaseBuilder(getApplicationContext(),
                MyAppDatabase.class,"goal-db").build();
                MyDao myDao = db.myDao();

        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }

    }
    /** Called when the user taps the back button */


    }
