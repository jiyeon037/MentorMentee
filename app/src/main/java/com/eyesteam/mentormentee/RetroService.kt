package com.eyesteam.mentormentee

import com.eyesteam.mentormentee.models.RetrofitRepo
import retrofit2.Call
import retrofit2.http.*

interface RetroService {
    @POST("/join.php")
    fun postJoin(@Query("UserId") UserId: String, @Query("UserPW") UserPW: String, @Query("UserName") UserName : String, @Query("UserEmail") UserEmail : String) : Call<Void>

    // This method is used fpr "POST"
    @FormUrlEncoded
    @POST("/login.php")
    fun postRequest(@Field("UserId")UserId: String,
                    @Field("UserPw")UserPw: String) : Call<Void>

}