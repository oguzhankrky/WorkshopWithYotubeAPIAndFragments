package com.example.workshopwithyotubeapi.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/workshopwithyotubeapi/viewmodel/ListVideoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "wmDataKeeper", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/workshopwithyotubeapi/model/youtubeModel;", "getWmDataKeeper", "()Landroidx/lifecycle/MutableLiveData;", "youtubeApiService", "Lcom/example/workshopwithyotubeapi/service/youtubeAp\u0131Service;", "getDataFromAPI", "", "searchWord", "", "refreshData", "app_debug"})
public final class ListVideoViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.workshopwithyotubeapi.service.youtubeApıService youtubeApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.workshopwithyotubeapi.model.youtubeModel> wmDataKeeper = null;
    
    public ListVideoViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.workshopwithyotubeapi.model.youtubeModel> getWmDataKeeper() {
        return null;
    }
    
    public final void refreshData(@org.jetbrains.annotations.NotNull()
    java.lang.String searchWord) {
    }
    
    private final void getDataFromAPI(java.lang.String searchWord) {
    }
}