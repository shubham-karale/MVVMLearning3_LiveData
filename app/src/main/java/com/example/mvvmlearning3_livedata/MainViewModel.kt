package com.example.mvvmlearning3_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
//     Live Data
    var factsLiveData = MutableLiveData<String>("FACTS")


    fun getFacts(){
        factsLiveData.value = "FACTOMANIA"
    }

}