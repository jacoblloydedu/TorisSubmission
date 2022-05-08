package com.example.toris;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Goals.class},
        version = 1
       )

public abstract class MyAppDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
