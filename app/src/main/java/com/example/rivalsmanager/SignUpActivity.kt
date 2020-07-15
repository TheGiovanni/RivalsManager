package com.example.rivalsmanager

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.rivalsmanager.Model.User
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_new_user.*

class SignUpActivity : AppCompatActivity() {
    private var databaseReference = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)
        signUpButton.setOnClickListener {
            insertUser()
        }
    }

    private fun insertUser() {
        if (nameText.text.isNullOrEmpty() || emailText.text.isNullOrEmpty() || passwordText.text.isNullOrEmpty()) {
            Toast.makeText(this, "Some field are missing.", Toast.LENGTH_SHORT).show()
            return
        }
        //get key
        val key = databaseReference.child("users").push().key

        //get user data from edit text
        val user = key?.let {
            User(
                id = key,
                name = nameText.text.toString(),
                email = emailText.text.toString(),
                password = passwordText.text.toString()
            )
        }

        if (key != null) {
            databaseReference.child(key).setValue(user)
            Toast.makeText(this, "Upload Success", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Upload Error", Toast.LENGTH_SHORT).show()
        }

//        key?.let {
//            user.id = key
//
//            // Write a data to the database
//            databaseReference.child("User").child(key).setValue(user).addOnSuccessListener {
////                clearText()
////                //get user data from database
////                getUser()
////                //scroll to new item
////                recycler_user.scrollToPosition(recyclerAdapter.userList.size - 1)
//            }.addOnFailureListener {
//                Toast.makeText(this, "Upload Error", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
    private fun clearText(){
//        nameText.text = ""

    }

}