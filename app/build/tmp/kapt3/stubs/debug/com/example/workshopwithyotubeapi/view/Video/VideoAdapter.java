package com.example.workshopwithyotubeapi.view.Video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter$VideoViewHolder;", "videoList", "", "Lcom/example/workshopwithyotubeapi/model/Item;", "listener", "Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter$ClickListener;", "(Ljava/util/List;Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter$ClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickListener", "VideoViewHolder", "app_debug"})
public final class VideoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.workshopwithyotubeapi.view.Video.VideoAdapter.VideoViewHolder> {
    private final java.util.List<com.example.workshopwithyotubeapi.model.Item> videoList = null;
    private final com.example.workshopwithyotubeapi.view.Video.VideoAdapter.ClickListener listener = null;
    
    public VideoAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.workshopwithyotubeapi.model.Item> videoList, @org.jetbrains.annotations.NotNull()
    com.example.workshopwithyotubeapi.view.Video.VideoAdapter.ClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.workshopwithyotubeapi.view.Video.VideoAdapter.VideoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.workshopwithyotubeapi.view.Video.VideoAdapter.VideoViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter$ClickListener;", "", "onClickListener", "", "item", "", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onClickListener(@org.jetbrains.annotations.NotNull()
        java.lang.String item);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter$VideoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/myapplication/databinding/ActivityDetayBinding;", "(Lcom/example/workshopwithyotubeapi/view/Video/VideoAdapter;Lcom/example/myapplication/databinding/ActivityDetayBinding;)V", "videoImage", "Lcom/google/android/material/imageview/ShapeableImageView;", "getVideoImage", "()Lcom/google/android/material/imageview/ShapeableImageView;", "videoText", "Landroid/widget/TextView;", "getVideoText", "()Landroid/widget/TextView;", "bind", "", "youtubeItem", "Lcom/example/workshopwithyotubeapi/model/Item;", "app_debug"})
    public final class VideoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.imageview.ShapeableImageView videoImage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView videoText = null;
        
        public VideoViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.databinding.ActivityDetayBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.imageview.ShapeableImageView getVideoImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getVideoText() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.workshopwithyotubeapi.model.Item youtubeItem) {
        }
    }
}