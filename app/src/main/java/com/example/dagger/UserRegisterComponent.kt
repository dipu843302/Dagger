package com.example.dagger

import dagger.Component

@Component
interface UserRegisterComponent {

    fun userRegistrationService() : UserRegistrationService
}