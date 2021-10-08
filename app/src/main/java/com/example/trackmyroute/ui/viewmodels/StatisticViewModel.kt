package com.example.trackmyroute.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.trackmyroute.repositories.MainRepository

/**
 *   Created by Jeje on 10/8/21
 **/

class StatisticViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}