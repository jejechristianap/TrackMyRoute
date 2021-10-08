package com.example.trackmyroute.repositories

import com.example.trackmyroute.db.Run
import com.example.trackmyroute.db.RunDAO
import javax.inject.Inject

/**
 *   Created by Jeje on 10/8/21
 **/
class MainRepository @Inject constructor(val runDao: RunDAO) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    // Why not using suspend fun?
    // Because it return LiveData object and LiveData object
    // And LiveData already asynchronous so you don't need the suspend function
    fun getAllRunSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunSortedDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()


}