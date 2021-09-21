package com.example.myapplication.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.FavouriteVideo
import com.example.myapplication.data.FavouriteVideoDao
import com.example.myapplication.data.FavouriteVideoDatabase
import com.example.myapplication.data.FavouriteVideoRepostory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch

class FavouriteVideoViewModel(aplication:Application):AndroidViewModel(aplication) {

    lateinit var readAllData: LiveData<List<FavouriteVideo>>
    lateinit var  repostory:FavouriteVideoRepostory

    init {
        val favouriteVideoDao= FavouriteVideoDatabase.getFavouriteVideoDatabase(aplication)!!.favouriteVideoDao()
        repostory= FavouriteVideoRepostory(favouriteVideoDao)
        readAllData=repostory.readAllData


    }
    fun addfavouriteVideo(favouriteVideo:FavouriteVideo)
    {
        viewModelScope.launch (Dispatchers.IO){
            repostory.addFavouriteVideo(favouriteVideo)
        }
    }
    fun isRowIsExist(VideoAdress:String):Boolean
    {

        return   repostory.isRowIsExist(VideoAdress)

    }
    fun deletefavouriteVideo(VideoAddress: String)
    {
        viewModelScope.launch (Dispatchers.IO){
            repostory.deleteFavouriteVideo(VideoAddress)
        }
    }


}