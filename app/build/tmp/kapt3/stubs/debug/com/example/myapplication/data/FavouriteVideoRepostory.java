package com.example.myapplication.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myapplication/data/FavouriteVideoRepostory;", "", "favouriteVideoDao", "Lcom/example/myapplication/data/FavouriteVideoDao;", "(Lcom/example/myapplication/data/FavouriteVideoDao;)V", "readAllData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/data/FavouriteVideo;", "getReadAllData", "()Landroidx/lifecycle/LiveData;", "addFavouriteVideo", "", "favouriteVideo", "(Lcom/example/myapplication/data/FavouriteVideo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavouriteVideo", "VideoAddress", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRowIsExist", "", "VideoAdress", "app_debug"})
public final class FavouriteVideoRepostory {
    private final com.example.myapplication.data.FavouriteVideoDao favouriteVideoDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> readAllData = null;
    
    public FavouriteVideoRepostory(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.FavouriteVideoDao favouriteVideoDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> getReadAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavouriteVideo(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.FavouriteVideo favouriteVideo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final boolean isRowIsExist(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAdress) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavouriteVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}