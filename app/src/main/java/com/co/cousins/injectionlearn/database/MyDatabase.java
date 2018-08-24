package com.co.cousins.injectionlearn.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.TypeConverters;

import com.co.cousins.injectionlearn.database.converter.DateConverter;
import com.co.cousins.injectionlearn.database.dao.UserDao;
import com.co.cousins.injectionlearn.database.entity.User;

/**
 * Created by Mattar on 8/24/2018.
 */

@Database(entities = {User.class}, version = 1 ,exportSchema = false)
@TypeConverters(DateConverter.class)
public abstract class MyDatabase {

    // --- SINGLETON ---
    private static volatile MyDatabase INSTANCE;

    // --- DAO ---
    public abstract UserDao userDao();

}
