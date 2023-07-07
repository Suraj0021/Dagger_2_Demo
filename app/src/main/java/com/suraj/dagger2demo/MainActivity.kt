package com.suraj.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suraj.dagger2demo.services.EmailService
import com.suraj.dagger2demo.services.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    lateinit var emailService: EmailService


    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        val myComponent = DaggerUserComponent.builder().build()

//        val myComponent = DaggerUserComponent.builder().notificationModule(NotificationModule(3)).build()

        val myComponent = (application as MyApplication).myComponent

        myComponent.inject(this)

        emailService = myComponent.getEmailService()

        emailService2 = myComponent.getEmailService()

        userRegistrationService.registerUser("suraj@gmail.com", "123456")

    }
}