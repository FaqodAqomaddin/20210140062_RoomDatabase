package com.example.ativity9

import android.app.Application
import com.example.ativity9.Repository.ContainerApp
import com.example.ativity9.Repository.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}