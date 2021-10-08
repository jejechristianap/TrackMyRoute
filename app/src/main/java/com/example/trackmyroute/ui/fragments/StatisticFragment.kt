package com.example.trackmyroute.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.trackmyroute.R
import com.example.trackmyroute.ui.viewmodels.MainViewModel
import com.example.trackmyroute.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 *   Created by Jeje on 10/8/21
 **/

@AndroidEntryPoint
class StatisticFragment: Fragment(R.layout.fragment_statistic) {

    private val viewModel: StatisticViewModel by viewModels()

}