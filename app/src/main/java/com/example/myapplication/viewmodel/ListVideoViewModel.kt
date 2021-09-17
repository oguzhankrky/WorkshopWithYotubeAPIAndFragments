package com.example.workshopwithyotubeapi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.workshopwithyotubeapi.model.youtubeModel
import com.example.workshopwithyotubeapi.service.youtubeApıService

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class ListVideoViewModel: ViewModel() {
    //private lateinit var binding : ActivityMainBinding
    private val youtubeApiService = youtubeApıService()
    private val disposable = CompositeDisposable()
    internal val wmDataKeeper = MutableLiveData<youtubeModel>()
    val wlDataKeeper : LiveData<youtubeModel>
        get()=wmDataKeeper
    fun refreshData(searchWord:String) {
        getDataFromAPI(searchWord)
    }

    private fun getDataFromAPI(searchWord:String){

        disposable.add(
            youtubeApiService.getDataService("AIzaSyD9IhAJjjG9xsaNBiiEf8NI69xV7LGfXwk","snippet","date","50","TR","video",searchWord)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<youtubeModel>() {

                    override fun onSuccess(wmData: youtubeModel) {
                        wmDataKeeper.value=wmData


                    }

                    override fun onError(e: Throwable) {


                    }

                })
        )

    }


}