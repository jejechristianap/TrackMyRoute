package com.example.trackmyroute.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.trackmyroute.R
import com.example.trackmyroute.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 *   Created by Jeje on 10/8/21
 **/

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}