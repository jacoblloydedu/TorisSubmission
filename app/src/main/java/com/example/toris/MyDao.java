package com.example.toris;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MyDao {

    @Insert
    void addGoal(Goal goal);

}
