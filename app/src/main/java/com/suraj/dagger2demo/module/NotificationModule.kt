package com.suraj.dagger2demo.module

import com.suraj.dagger2demo.services.EmailService
import com.suraj.dagger2demo.annotation.MessageAnnotation
import com.suraj.dagger2demo.services.MessageService
import com.suraj.dagger2demo.services.SendNotification
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule(private val retryCount : Int) {

    @Singleton
   @MessageAnnotation
    @Provides
    fun getMessageRepo(): SendNotification {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : SendNotification {
        return EmailService()
    }


}