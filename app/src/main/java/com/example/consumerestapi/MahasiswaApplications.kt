package com.example.consumerestapi

import android.app.Application
import com.example.consumerestapi.repository.AppContainer
import com.example.consumerestapi.repository.MahasiswaContainer

class  MahasiswaApplications : Application() {
    lateinit var  container : AppContainer
    override fun  onCreate () {
        super . onCreate ()
        container =  MahasiswaContainer ()
    }
}