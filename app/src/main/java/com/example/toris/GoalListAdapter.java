package com.example.toris;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GoalListAdapter extends RecyclerView.Adapter<GoalListAdapter.GoalViewHolder> {

    private final LayoutInflater layoutInflater;
    private Context mContext;
    private List<Goals> mGoals;

    public GoalListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @NonNull
    @Override
    public GoalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.
                fragment_view_goal,parent, false);
        GoalViewHolder viewHolder = new GoalViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull GoalViewHolder holder, int position) {
        if (mGoals != null) {
            Goals goals = mGoals.get(position);
            holder.setData(goals.getGoalName(), position);
        } else{
            holder.goalItemView.setText(R.string.no_goals);
        }
    }

    @Override
    public int getItemCount() {
        if (mGoals !=null)
            return mGoals.size();
        else return 0;
    }

    public class GoalViewHolder extends RecyclerView.ViewHolder{

        private TextView goalItemView;
        private int mPosition;

        public GoalViewHolder(@NonNull View itemView) {
            super(itemView);
            goalItemView = itemView.findViewById(R.id.recyclerList);
        }
        public void setData(String goals, int position){
            goalItemView.setText(goals);
            mPosition = position;
        }
    }
}
