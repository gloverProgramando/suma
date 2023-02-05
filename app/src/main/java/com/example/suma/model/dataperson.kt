package com.example.suma.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class dataperson(
    val name : String,
    val lastname : String,
    val age : Int
): Parcelable
