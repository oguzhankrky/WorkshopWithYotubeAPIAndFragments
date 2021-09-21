package com.example.myapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myapplication/viewmodel/FavouriteVideoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "aplication", "Landroid/app/Application;", "(Landroid/app/Application;)V", "readAllData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/data/FavouriteVideo;", "getReadAllData", "()Landroidx/lifecycle/LiveData;", "setReadAllData", "(Landroidx/lifecycle/LiveData;)V", "repostory", "Lcom/example/myapplication/data/FavouriteVideoRepostory;", "getRepostory", "()Lcom/example/myapplication/data/FavouriteVideoRepostory;", "setRepostory", "(Lcom/example/myapplication/data/FavouriteVideoRepostory;)V", "addfavouriteVideo", "", "favouriteVideo", "deletefavouriteVideo", "VideoAddress", "", "isRowIsExist", "", "VideoAdress", "app_debug"})
public final class FavouriteVideoViewModel extends androidx.lifecycle.AndroidViewModel {
    public androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> readAllData;
    public com.example.myapplication.data.FavouriteVideoRepostory repostory;
    
    public FavouriteVideoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application aplication) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> getReadAllData() {
        return null;
    }
    
    public final void setReadAllData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.FavouriteVideo>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.data.FavouriteVideoRepostory getRepostory() {
        return null;
    }
    
    public final void setRepostory(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.FavouriteVideoRepostory p0) {
    }
    
    public final void addfavouriteVideo(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.FavouriteVideo favouriteVideo) {
    }
    
    public final boolean isRowIsExist(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAdress) {
        return false;
    }
    
    public final void deletefavouriteVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String VideoAddress) {
    }
}