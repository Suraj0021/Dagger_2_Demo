package com.suraj.dagger2demo.services

import com.suraj.dagger2demo.UserRepo
import com.suraj.dagger2demo.annotation.MessageAnnotation
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepo: UserRepo,
    @MessageAnnotation private val notification: SendNotification
) {
    fun registerUser(email: String, password: String)
    {
        userRepo.saveUser(email,password)
       notification.send(email,password)
    }
}