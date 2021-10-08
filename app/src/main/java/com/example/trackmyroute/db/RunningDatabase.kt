package com.example.trackmyroute.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 *   Created by Jeje on 10/8/21
 **/
@Database(
    entities = [Run::class],
    version = 1
)
abstract class RunningDatabase: RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}