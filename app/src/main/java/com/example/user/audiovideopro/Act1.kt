package com.example.user.audiovideopro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_act1.*

class Act1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act1)
    }

    fun openAct(v: View) {
        var i = Intent(this, Act2::class.java)
        i.putExtra("x", editText.text.toString())
        startActivity(i)
    }
}
