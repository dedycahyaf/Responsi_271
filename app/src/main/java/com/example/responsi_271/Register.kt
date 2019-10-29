package com.example.responsi_271

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_register.*
import java.text.SimpleDateFormat
import java.util.*

class Register : AppCompatActivity() {
    var edDate : EditText? = null
    @RequiresApi(Build.VERSION_CODES.N)
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edDate = this.regi_tgllahir

        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            @RequiresApi(Build.VERSION_CODES.N)
            override fun onDateSet (
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ){
                cal.set(Calendar.YEAR,year)
                cal.set(Calendar.MONTH,monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                updateDateInView()

            }
        }

        edDate!!.setOnClickListener(object : View.OnClickListener{
            @RequiresApi(Build.VERSION_CODES.N)
            override fun onClick (view: View){
                DatePickerDialog (this@Register,dateSetListener,

                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
        })

        btn_regi.setOnClickListener(){
            var nama = regi_nama.text.toString()
            var alamat = regi_alt.text.toString()
            var tgl_lahir = regi_tgllahir.text.toString()
            var tempat_l = tempatlahir.text.toString()
            intent = Intent(this, Preview::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("alamat",alamat)
            intent.putExtra("tgl_lhr",tgl_lahir)
            intent.putExtra("tmp_lhr",tempat_l)
            startActivity(intent)
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun updateDateInView (){
        val myFormat = "MM/dd/yyyy"
        val sdf = SimpleDateFormat (myFormat, Locale.US)

        edDate!!.setText(sdf.format(cal.getTime()))
    }
}


