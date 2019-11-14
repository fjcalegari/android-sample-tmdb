package com.fjcalegari.tmdb

import android.app.Application
import com.fjcalegari.tmdb.di.modules.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TMDbApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TMDbApp)
            modules(appModules)
        }

    }

}
