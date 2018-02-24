package com.example.user.audiovideopro

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video.*

class VideoAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView.setVideoPath("C:\\Users\\Abdallah.Sarayrah\\Downloads\\video.mp4")
        videoView.setMediaController(MediaController(this))
        videoView.start()
    }
}
