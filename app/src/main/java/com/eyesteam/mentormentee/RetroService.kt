package com.eyesteam.mentormentee

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface RetroService {
    @POST("/join.php")
    fun postJoin(@Query("join") join : Join) : Call<Void>
}