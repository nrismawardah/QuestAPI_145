package com.example.consumerestapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa (
    val nim : String,
    val nama : String,
    val alamat : String,

    @SerialName ("Jenis kelamin")
    val jenisKelamin: String,
    val kelas : String,
    val angkatan : String
)