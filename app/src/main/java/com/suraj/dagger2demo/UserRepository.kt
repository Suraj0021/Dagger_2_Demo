package com.suraj.dagger2demo

import android.util.Log
import com.suraj.dagger2demo.services.AnalyticsService
import javax.inject.Inject
import javax.inject.Singleton


interface UserRepo{
    fun saveUser (email: String,password: String)
}

@Singleton
class SqlUserRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepo {
    override
    fun saveUser(email: String, password: String) {
        Log.e("saveUser", "User is saved in Sql")
        analyticsService.trackEvent("Save User","Create")
    }

}
    class FireBaseUserRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepo {
        override
        fun saveUser(email: String, password: String) {
            Log.e("saveUser", "User is saved in Firebase")
            analyticsService.trackEvent("Save User","Create")
        }

    }


