package com.example.workshopwithyotubeapi.service

import androidx.annotation.Nullable
import com.example.workshopwithyotubeapi.model.youtubeModel
import io.reactivex.Single
import org.jetbrains.annotations.NotNull
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Part
import retrofit2.http.Query
//data/2.5/weather?&units=metric&appid=159fdd5b2702c6fce36d677339ab1c40

interface YoutubeAPI {
    @GET("search")
    fun getData(
        @Query("key")    @NotNull key:String = "0",
        @Query("part")     @Nullable part:String?= null ,
        @Query("order")    @Nullable order:String? = null ,
        @Query("maxResults")     @Nullable maxResults:String? = null,
        @Query("regionCode")     @Nullable regionCode:String? = null,
        @Query("type")     @Nullable type:String? = null,
        @Query("q")   @NotNull searchWord:String="popular",
        ): Call<youtubeModel>

    /*fun getData(
        @Query("q") cityName:String
    ): Single<youtubeModel>*/
}

/*
https://www.googleapis.com/youtube/v3/search?
key=AIzaSyB4cpn75emuo45iathwp6oN0TzO74k9g2s
&part=snippet
&order=date
&maxResult=50
&type=video

@Query("v")     @Nullable videoV:String?,
*/