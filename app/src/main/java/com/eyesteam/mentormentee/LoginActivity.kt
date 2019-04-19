package com.eyesteam.mentormentee

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnJoin.setOnClickListener {
            val nextIntent = Intent(this, JoinActivity::class.java)
            startActivity(nextIntent)
        }
    }

}