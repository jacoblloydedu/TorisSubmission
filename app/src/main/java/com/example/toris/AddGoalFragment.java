package com.example.toris;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


public class AddGoalFragment extends Fragment {
    private EditText GoalName, Tie1, Tie2;
    private EditText GoalID, GoalDue;
    private Button BnSave;


    public AddGoalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_goal, container, false);

        GoalID = view.findViewById(R.id.goal_id_txt);
        GoalName = view.findViewById(R.id.inputgoalname);
        GoalDue = view.findViewById(R.id.goal_date_txt);
        Tie1 = view.findViewById(R.id.tie1txt);
        Tie2 = view.findViewById(R.id.tie2txt);
        BnSave = view.findViewById(R.id.bn_save_goal);

        BnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int goalId = Integer.parseInt(GoalID.getText().toString());
                String goalDue = GoalDue.getText().toString();
                String goalname = GoalName.getText().toString();
                String tie1 = Tie1.getText().toString();
                String tie2 = Tie2.getText().toString();


                Goals goals = new Goals();
                goals.setGoalID(goalId);;
                goals.setGoalName(goalname);
                goals.setGoalDue(goalDue);
                goals.setTie1(tie1);
                goals.setTie2(tie2);

                MainActivity.myAppDatabase.myDao().addGoals(goals);

                GoalID.setText("");
                GoalName.setText("Goal Added Successfully");
                GoalDue.setText("");
                Tie1.setText("");
                Tie2.setText("");
            }
        });


        return view;
    }
}
