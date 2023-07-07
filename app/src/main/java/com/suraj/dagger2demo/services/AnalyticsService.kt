package com.suraj.dagger2demo.services

import android.util.Log


interface AnalyticsService {

    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e("saveUser", "MixPanel $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e("saveUser", "MixPanel $eventName - $eventType")
    }
}