package com.example.speakwhenactivityopens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.speech.tts.TextToSpeech
import android.util.Log
import java.util.*

class NewActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    lateinit var tts: TextToSpeech


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tts = TextToSpeech(this, this)
        Handler().postDelayed({
            speakOut()
        }, 500)
        setContentView(R.layout.activity_new)
    }

    private fun speakOut() {
        var text: String = "Welcome to new Activity"
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
    }

    public override fun onPause() {
        // Shutdown TTS
        if (tts != null) {
            tts!!.stop()
        }
        super.onPause()
    }
    override fun onInit(status: Int) {

        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)


    }
}
}
