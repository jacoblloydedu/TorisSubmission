package com.example.toris;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


    @Entity(tableName = "goals")
    public class Goals {

        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "goal_ID")
        private int GoalID;

        @ColumnInfo(name = "goal_Name")
        private String GoalName;

        @ColumnInfo(name = "goal_Date")
        private int DueDate;

        public int getGoalID() {
            return GoalID;
        }

        public void setGoalID(int goalID) {
            GoalID = goalID;
        }

        public String getGoalDue() {
            return GoalDue;
        }

        public void setGoalDue(String goalDue) {
            GoalDue = goalDue;
        }

        @ColumnInfo(name = "goal_due")
        private String GoalDue;

        @ColumnInfo(name = "tie_1")
        private String Tie1;

        @ColumnInfo(name = "tie_2")
        private String Tie2;



        public String getGoalName() {
            return GoalName;
        }

        public void setGoalName(String goalName) {
            GoalName = goalName;
        }

        public int getDueDate() {
            return DueDate;
        }

        public void setDueDate(int dueDate) {
            DueDate = dueDate;
        }

        public String getTie1() {
            return Tie1;
        }

        public void setTie1(String tie1) {
            Tie1 = tie1;
        }

        public String getTie2() {
            return Tie2;
        }

        public void setTie2(String tie2) {
            Tie2 = tie2;
        }
    }



