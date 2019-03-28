package com.example.speakwhenactivityopens

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OpenActivity(view: View){
        val intent = Intent(this, NewActivity::class.java)
        // start your next activity
        startActivity(intent)

    }
}
