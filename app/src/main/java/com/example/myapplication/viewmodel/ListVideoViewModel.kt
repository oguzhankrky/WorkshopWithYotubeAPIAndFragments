package com.example.workshopwithyotubeapi.viewmodel

import android.net.DnsResolver
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.workshopwithyotubeapi.model.youtubeModel
import com.example.workshopwithyotubeapi.service.youtubeApıService

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListVideoViewModel: ViewModel() {
    private val youtubeApiService = youtubeApıService()
    val wmDataKeeper: MutableLiveData<youtubeModel?> = MutableLiveData(null)
    fun refreshData(searchWord:String) {
        getDataFromAPI(searchWord)
    }

    private fun getDataFromAPI(searchWord:String){

            youtubeApiService.getDataService("AIzaSyB4cpn75emuo45iathwp6oN0TzO74k9g2s","snippet","date","50","TR","video",searchWord)
                .enqueue(object: Callback<youtubeModel> {
                    override fun onResponse(
                        call: Call<youtubeModel>,
                        response: Response<youtubeModel>
                    ) {
                        if(response.isSuccessful && response.body() != null) {
                            wmDataKeeper.postValue(response.body())
                        }
                    }

                    override fun onFailure(call: Call<youtubeModel>, t: Throwable) {
                        if(!t.message.isNullOrEmpty()) Log.e("Error executed", "onFailure: ${t.message}", )
                    }

                })


    }


}