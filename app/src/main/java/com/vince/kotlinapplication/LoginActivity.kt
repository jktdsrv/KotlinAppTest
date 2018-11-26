package com.vince.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener { login(loginUsername.text.toString(),loginPassword.text.toString()) }
    }

    fun login(username: String, password: String){
        if (username == password){
            Toast.makeText(this,"Logged", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No se pudo iniciar sesión", Toast.LENGTH_SHORT).show()
        }
    }


}
