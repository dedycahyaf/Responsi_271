package com.example.responsi_271

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class Preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        var intent = intent
        var nama = intent.getStringExtra("Nama")
        var alamat = intent.getStringExtra("alamat")
        var tgl_lahir = intent.getStringExtra("Tanggal Lahir")
        var tempat_l = intent.getStringExtra("Tempat Lahir")


    }
}
