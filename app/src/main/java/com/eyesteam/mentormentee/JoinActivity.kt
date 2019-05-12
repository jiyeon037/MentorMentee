package com.eyesteam.mentormentee

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_join.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
/*
class JoinActivity : AppCompatActivity() {

    private val IP_ADDRESS = "15.164.95.90"
    private val TAG = "php "

    var retroService : RetroService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://15.164.95.90")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retroService = retrofit.create(RetroService::class.java)

        btnCheckExistID.setOnClickListener {
            view : View ->
            var id = editID.text.toString()
            var pwd = editPWD.text.toString()
            var pwdConfirm = editPWDConfirm.text.toString()
            var email = editEmail.text.toString()

        }

        btnDone.setOnClickListener {
            InsertData(this).execute()

            val call : Call<Void>? = retroService?.postJoin(editID.text.toString(), editPWD.text.toString(), editID.text.toString(), editEmail.text.toString())

            /*
            call.enqueue(object : Callback<Void>){
                override fun onResponse(call : Call<Void>?, response: Response<Void>?){
                    val data= response?.body()?.result
                }
            }*/

        }
    }

    @SuppressLint("StaticFieldLeak")
    class InsertData(private var activity: JoinActivity) : AsyncTask<String, String, String>() {

        override fun onPreExecute() {
            super.onPreExecute()

        }

        override fun doInBackground(vararg p0: String?): String {
            var result = ""


            return result
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

        }
    }
}


*/
