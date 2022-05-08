package com.example.toris;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button addgoalbutton;




    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        addgoalbutton = view.findViewById(R.id.add_goal_button);
        addgoalbutton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.add_goal_button:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddGoalFragment()).
                        addToBackStack(null).commit();
                break;
        }
    }
}