package com.example.toris;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "Goals")
public class Goal {
@PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "goal_Name")
    private String GoalName;

    @ColumnInfo(name = "goal_Date")
    private int DueDate;

    @ColumnInfo(name = "tie_1")
    private String Tie1;

    @ColumnInfo(name = "tie_2")
    private String Tie2;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

