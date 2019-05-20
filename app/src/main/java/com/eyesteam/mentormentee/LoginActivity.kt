package com.eyesteam.mentormentee

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.eyesteam.mentormentee.models.RetrofitRepo
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
            .baseUrl("http://15.164.95.90")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        // interface와 retrofit 결합
        var server = retrofit.create(RetroService::class.java)

        btnLogin.setOnClickListener {
            server.getRequest(userId,userPw).enqueue(object : Callback<List<RetrofitRepo>>{
                override fun onResponse(call: Call<List<RetrofitRepo>>, response: Response<List<RetrofitRepo>>) {
          //          if(response.isSuccessful){
                        val body : List<RetrofitRepo> = ArrayList()

                        Log.d("**********", body[0].toString())
                     //   Log.d("**********", body.userPw)

/*                            Log.d("**********", body.info[0].toString())
                            Log.d("**********", body.info[1].toString())
                            Log.d("**********", body.info[2].toString())
                            Log.d("**********", body.info[3].toString())*/
           //         }
                    Log.d("1111111111111", editID.text.toString())
                }

                override fun onFailure(call: Call<List<RetrofitRepo>>, t: Throwable) {
                   Log.d("222222222222","2222222222222")
                }
            })
        }
    }

}