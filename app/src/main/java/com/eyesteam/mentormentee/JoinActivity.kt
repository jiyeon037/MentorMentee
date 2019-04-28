package com.eyesteam.mentormentee

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class JoinActivity : AppCompatActivity() {

    private val IP_ADDRESS = "15.164.95.90"
    private val TAG = "php "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        var editID = findViewById<EditText>(R.id.editID)
        var editPWD = findViewById<EditText>(R.id.editPWD)
        var editPWDconfirm = findViewById<EditText>(R.id.editPWDConfirm)
        var editEmail = findViewById<EditText>(R.id.editEmail)
        var btnCheckExistID = findViewById<Button>(R.id.btnCheckExistID)
        var btnDone = findViewById<Button>(R.id.btnDone)

        btnCheckExistID.setOnClickListener {
            view ->
            var id = editID.text.toString()
            var pwd = editPWD.text.toString()
            var pwdConfirm = editPWDconfirm.text.toString()
            var email = editEmail.text.toString()

        }

        btnDone.setOnClickListener {
            InsertData(this).execute()
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



