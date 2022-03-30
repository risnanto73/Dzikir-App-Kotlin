package com.timus.mydzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.timus.mydzikir.dzikir_pagi.DzikirPagiActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        cd_pagi.setOnClickListener{
            val i = Intent(this, DzikirPagiActivity::class.java)
            startActivity(i)
        }

    }
}