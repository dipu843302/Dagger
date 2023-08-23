package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(email:String,from:String,body:String){
        Log.d(TAG,"Email sent")
    }
}