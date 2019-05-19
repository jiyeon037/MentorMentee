package com.eyesteam.mentormentee

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.eyesteam.mentormentee.models.LoginData
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val userId = editID.text.toString()
        val userPw = editPWD.text.toString()

        btnJoin.setOnClickListener {
            val nextIntent = Intent(this, JoinActivity::class.java)
            startActivity(nextIntent)
        }

        var retrofit = Retrofit.Builder()
            .baseUrl("http://15.164.95.90/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        // interface와 retrofit 결합
        var server = retrofit.create(RetroService::class.java)

        btnLogin.setOnClickListener {
            server.postRequest(userId,userPw).enqueue(object : Callback<LoginData>{
                override fun onResponse(call: Call<LoginData>, response: Response<LoginData>) {
                    if(response.isSuccessful){
                         val body = LoginData() ////////////
                        if(body != null){
                            Log.d("**********", body.UserId + " ")
                            Log.d("**********", body.UserPw + " ")
                            Log.d("**********", body.message + " ")
                            Log.d("**********", body.responseCode.toString())
                        }
                    }
                    println(response?.body().toString())
                    Log.d("1111111111111", editID.text.toString())
                }

                override fun onFailure(call: Call<LoginData>, t: Throwable) {
                   Log.d("222222222222","2222222222222")
                }
            })
        }
    }

}