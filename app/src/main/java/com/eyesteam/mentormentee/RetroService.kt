package com.eyesteam.mentormentee

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface RetroService {
    @POST("/join.php")
    fun postJoin(@Query("UserId") UserId : String, @Query("UserPW") UserPW : String, @Query("UserName") UserName : String,
                 @Query("UserMail") UserMail : String) : Call<Void>

}