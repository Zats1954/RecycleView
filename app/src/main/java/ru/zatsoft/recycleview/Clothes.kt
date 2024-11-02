package ru.zatsoft.recycleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Clothes(val name: String, var image: Int, val description: String):Parcelable
