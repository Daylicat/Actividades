package com.example.actividades

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Heroe (val nombre: String, val nivel: Int, val vida:Int ): Parcelable{
}


