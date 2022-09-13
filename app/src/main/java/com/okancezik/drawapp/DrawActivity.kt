package com.okancezik.drawapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_draw.*

class DrawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw)
    }

    fun draw(view: View){

        val candidates = intent.getStringArrayListExtra("candidates")

        var index = (0..candidates!!.size-1).random()
        println(index) //control
        var winner = candidates.get(index)
        winnerText.text = "Winner is ${winner}"
    }
}