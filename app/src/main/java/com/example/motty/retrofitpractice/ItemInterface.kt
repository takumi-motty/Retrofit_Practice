package com.example.motty.retrofitpractice

import retrofit2.http.GET

interface ItemInterface {
    @GET("IchibaItem/Ranking/20170628?formatVersion=2&applicationId=1036390071004131300")
    fun items(): retrofit2.Call<RakutenRankingResult>
}