package com.example.myapplication.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/data/FavouriteVideoDao;", "", "addFavouriteVideo", "", "favouritevideo", "Lcom/example/myapplication/data/FavouriteVideo;", "deleteVideoFromFav", "VideoAddress", "", "isRowIsExist", "", "readAllData", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public abstract interface FavouriteVideoDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addFavouriteVideo(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.FavouriteVideo favouritevideo);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FavouriteVideo ORDER BY id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> readAllData();
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM FavouriteVideo WHERE VideoAddress = :VideoAddress)")
    public abstract boolean isRowIsExist(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAddress);
    
    @androidx.room.Query(value = "DELETE FROM FavouriteVideo WHERE VideoAddress = :VideoAddress")
    public abstract void deleteVideoFromFav(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAddress);
}