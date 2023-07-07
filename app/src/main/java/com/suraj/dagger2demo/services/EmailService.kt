package com.suraj.dagger2demo.services

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface SendNotification {
    fun send(to: String, from: String)
}

@Singleton
class EmailService @Inject constructor() :
    SendNotification {
    override
    fun send(to: String, from: String) {
        Log.e("saveUser", "Email Send")
    }
}

class MessageService @Inject constructor(private val retryCount : Int) :
    SendNotification {
    override
    fun send(to: String, from: String) {

        Log.e("saveUser", "Message Send $retryCount")
    }

}



