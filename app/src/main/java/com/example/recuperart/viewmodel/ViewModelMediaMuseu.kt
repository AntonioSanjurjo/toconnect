package com.example.recuperart.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recuperart.io.response.MediaMuseuByMuseuResponse
import com.example.recuperart.repository.MediaMuseuRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class ViewModelMediaMuseu(private val repository: MediaMuseuRepository): ViewModel() {

    var myResponse: MutableLiveData<Response<MediaMuseuByMuseuResponse>> = MutableLiveData()

    fun getMediaMuseu(number: Int){

        viewModelScope.launch {
            var response =repository.getMuseuMedia(number)
            myResponse.value = response
        }
    }
}