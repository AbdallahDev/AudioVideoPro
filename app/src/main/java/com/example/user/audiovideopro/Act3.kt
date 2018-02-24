package com.example.user.audiovideopro

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Act3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act3)
    }

    fun openGoogle(v: View) {
        var u = Uri.parse("http://www.google.jo")
        var i = Intent(Intent.ACTION_VIEW, u)
        startActivity(i)
    }
}
