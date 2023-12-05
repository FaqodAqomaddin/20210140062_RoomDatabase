package com.example.ativity9.Repository

import android.content.Context
import com.example.ativity9.Data.DatabaseSiswa


interface ContainerApp{
    val repositoriSiswa : RepositoriSiswa
}
class ContainerDataApp(private val context: Context): ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}