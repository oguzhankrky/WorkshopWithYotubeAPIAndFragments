package com.example.workshopwithyotubeapi.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J^\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\f\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/workshopwithyotubeapi/service/YoutubeAPI;", "", "getData", "Lretrofit2/Call;", "Lcom/example/workshopwithyotubeapi/model/youtubeModel;", "key", "", "part", "order", "maxResults", "regionCode", "type", "searchWord", "app_debug"})
public abstract interface YoutubeAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search")
    public abstract retrofit2.Call<com.example.workshopwithyotubeapi.model.youtubeModel> getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @retrofit2.http.Query(value = "part")
    java.lang.String part, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @retrofit2.http.Query(value = "order")
    java.lang.String order, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @retrofit2.http.Query(value = "maxResults")
    java.lang.String maxResults, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @retrofit2.http.Query(value = "regionCode")
    java.lang.String regionCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String searchWord);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}