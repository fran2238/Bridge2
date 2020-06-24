package com.example.bridge

import android.app.Application
import timber.log.Timber

class BridgeApp : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}