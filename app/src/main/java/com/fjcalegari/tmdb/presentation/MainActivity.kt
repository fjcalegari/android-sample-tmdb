package com.fjcalegari.tmdb.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fjcalegari.tmdb.R.layout
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        viewModel.load()

    }

}
