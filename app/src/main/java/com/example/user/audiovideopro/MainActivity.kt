package com.example.user.audiovideopro

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private var indexPlayPause: Boolean = true

    fun playOnline(v: View) {
        var mp = MediaPlayer()
        mp.setDataSource("http://www.mfiles.co.uk/mp3-downloads/emil-khoury-feel-my-love.mp3")
        mp.prepare()
        when (indexPlayPause) {
            true -> {
                mp.start()
                indexPlayPause = false
                buttonPlay.text = "Pause"
            }
            false -> {
                mp.pause()
                indexPlayPause = true
                buttonPlay.text = "Play"
            }
        }
    }
}
