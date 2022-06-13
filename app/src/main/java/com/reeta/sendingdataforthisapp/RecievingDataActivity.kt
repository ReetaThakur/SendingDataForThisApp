package com.reeta.sendingdataforthisapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recieving_data.*

class RecievingDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recieving_data)
        var intent=intent
        var name=intent.getStringExtra("name")
        tvName.text=name
    }
}