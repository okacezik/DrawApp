package com.okancezik.drawapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myArrayList = ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        letsdrawbutton.visibility = View.INVISIBLE
    }

    override fun onResume() {
        super.onResume()
        myArrayList.clear()
        letsdrawbutton.visibility = View.INVISIBLE
    }

    fun add(view: View){
        var candidate = candidateText.text.toString()
        if(candidate != ""){
            myArrayList.add(candidate)
            println(candidate)
            candidateText.text = null
            candidateText.hint = "enter candidate"
        }
        if(myArrayList.size > 1){
            letsdrawbutton.visibility = View.VISIBLE
        }
    }

    fun goDraw(view: View){
        val intent = Intent(this,DrawActivity::class.java)
        intent.putStringArrayListExtra("candidates",myArrayList)
        startActivity(intent)
    }
}