package com.eyesteam.mentormentee

import retrofit2.Call
import retrofit2.http.*

data class ResUserId(var UserId: String? = null)
data class ResUserPw(var UserPw: String? = null)

interface RetroService {
    @POST("/join.php")
    fun postJoin(@Query("UserId") UserId: String, @Query("UserPW") UserPW: String, @Query("UserName") UserName : String, @Query("UserEmail") UserEmail : String) : Call<Void>

    @FormUrlEncoded
    @POST("/login.php")
    fun postRequest(@Field("UserId")UserId: String,
                    @Field("UserPw")UserPw: String): Call<Void>

}