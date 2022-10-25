package com.bignerdranch.android.sandboxskyskanner

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
//import androidx.lifecycle.ViewModelProviders
import com.bignerdranch.android.sandboxskyskanner.data.remote.requestApi.RequestApi

class requestApiFragment:Fragment(R.layout.fragmentapi) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val requestApiViewModel = ViewModelProviders.of(this).get(RequestApiViewModel::class.java)
        //requestApiViewModel.fetchRequestList((activity?.application as? SkyScanner)?.requestApi)
    }
}