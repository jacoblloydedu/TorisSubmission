package com.example.toris;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface MyDao {

    @Insert
    void addGoals(Goals goals);

    @Query("SELECT * FROM goals")
    LiveData<List<Goals>> getAllGoals();
}
