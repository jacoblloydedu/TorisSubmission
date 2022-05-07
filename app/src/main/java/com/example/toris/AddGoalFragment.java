package com.example.toris;

import static com.example.toris.MainActivity.myAppDatabase;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.room.Room;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**

 * create an instance of this fragment.
 */
public class AddGoalFragment extends Fragment  {
    private EditText GoalName, Tie1, Tie2;
    private Button BnSave;






    public AddGoalFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

@NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_add_goal, container, false);


        GoalName = view.findViewById(R.id.inputgoalname);
        Tie1 = view.findViewById(R.id.tie1txt);
        Tie2 = view.findViewById(R.id.tie2txt);
        BnSave = view.findViewById(R.id.savebutton);


        BnSave.setOnClickListener(view1 -> {
            String goalname = GoalName.getText().toString();
            String tie1 = Tie1.getText().toString();
            String tie2 = Tie2.getText().toString();

            Goal goal = new Goal();
            goal.setGoalName(goalname);
            goal.setTie1(tie1);
            goal.setTie2(tie2);

            MainActivity.myAppDatabase.myDao().addGoal(goal);
            Toast.makeText(getActivity(),"Goal Created Successfully",Toast.LENGTH_SHORT).show();

            GoalName.setText("");
            Tie1.setText("");
            Tie2.setText("");
        });
        return view;
    }

   }