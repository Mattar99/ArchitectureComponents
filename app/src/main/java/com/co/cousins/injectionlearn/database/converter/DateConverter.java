package com.co.cousins.injectionlearn.database.converter;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Mattar on 8/24/2018.
 */

public class DateConverter {

    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date){
        return date == null ? null : date.getTime();
    }
}
