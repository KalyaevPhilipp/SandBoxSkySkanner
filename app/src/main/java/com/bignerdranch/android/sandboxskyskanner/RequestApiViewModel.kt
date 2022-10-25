package com.bignerdranch.android.sandboxskyskanner

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.bignerdranch.android.sandboxskyskanner.data.remote.requestApi.RequestApi
//import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class RequestApiViewModel(application: Application):AndroidViewModel(application) {
    private val composibleDisposible = CompositeDisposable()

    override fun onCleared(){
        composibleDisposible.dispose()
        super.onCleared()
    }
    fun fetchRequestList(requestApi: RequestApi?){
        requestApi?.let{
            composibleDisposible.add(requestApi?.Request()
            ?.subscribeOn(Schedulers.io())
           // ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe({

            },{

            }))}

    }
}