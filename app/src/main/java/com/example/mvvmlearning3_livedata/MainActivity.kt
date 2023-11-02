package com.example.mvvmlearning3_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val factsText = findViewById<TextView>(R.id.factsText);
        val showFactsBtn = findViewById<TextView>(R.id.showFactsBtn);

//        LiveData Observers has two params (LifecycleOwner, Observer Function)

        mainViewModel.factsLiveData.observe(this, {
            // Update UI

            factsText.text = it;

        })


        showFactsBtn.setOnClickListener {
            mainViewModel.getFacts()
        }




    }
}