package com.example.ativity9.Navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan di layar  halaman.
     */

    val title: Int
}