package com.example.rivalsmanager.Model

data class UserModel(
    var id: String = "",
    var name: String = "",
    var email: String = "",
    var password:String = ""
) {
    override fun toString(): String {
        return "UserModel(id='$id', name='$name',email='$email',password='$password')"
    }
}