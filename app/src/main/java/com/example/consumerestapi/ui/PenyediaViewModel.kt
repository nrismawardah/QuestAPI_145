package com.example.consumerestapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.MahasiswaApplications
import com.example.consumerestapi.ui.viewmodel.HomeViewModel
import com.example.consumerestapi.ui.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(mahasiswaApp().container.mahasiswaRepository) }
        initializer { InsertViewModel(mahasiswaApp().container.mahasiswaRepository) }
    }
}

fun CreationExtras.mahasiswaApp(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)
