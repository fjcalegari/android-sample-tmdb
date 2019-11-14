package com.fjcalegari.tmdb.di.modules

import com.fjcalegari.tmdb.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules = module {

    viewModel { MainViewModel() }

}
