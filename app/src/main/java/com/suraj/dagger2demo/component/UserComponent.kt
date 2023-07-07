package com.suraj.dagger2demo.component

import com.suraj.dagger2demo.MainActivity
import com.suraj.dagger2demo.module.AnalyticModule
import com.suraj.dagger2demo.module.NotificationModule
import com.suraj.dagger2demo.module.UserModule
import com.suraj.dagger2demo.services.EmailService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component( modules = [NotificationModule::class,UserModule::class,AnalyticModule::class])
interface UserComponent {
//    fun getUserRegistrationService() : UserRegistrationService

    fun inject(mainActivity: MainActivity)

    fun getEmailService (): EmailService


}
