package com.example.rivalsmanager.Model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    var id: String = "",
    var name: String? = "",
    var email: String? = "",
    var password:String? = ""
) {
    override fun toString(): String {
        return "User(id='$id', name='$name',email='$email',password='$password')"
    }
}