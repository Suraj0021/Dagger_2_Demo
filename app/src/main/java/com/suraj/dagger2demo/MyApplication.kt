package com.suraj.dagger2demo

import android.app.Application
import com.suraj.dagger2demo.component.DaggerUserComponent
import com.suraj.dagger2demo.component.UserComponent
import com.suraj.dagger2demo.module.NotificationModule

class MyApplication : Application() {

    lateinit var myComponent: UserComponent


    override fun onCreate() {
        super.onCreate()

//        myComponent = DaggerUserComponent.builder().build()

        myComponent = DaggerUserComponent.builder().notificationModule(NotificationModule(3)).build()
    }

}