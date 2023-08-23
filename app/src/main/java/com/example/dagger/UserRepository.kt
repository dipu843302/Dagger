package com.example.dagger

import android.util.Log
import javax.inject.Inject


class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String){
        Log.d("","User saved in DB")
    }
}