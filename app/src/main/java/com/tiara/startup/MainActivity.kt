package com.tiara.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.tiara.startup.R.id.tvShowAge
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener { // ini saat kita hendak membuat view itu bisa di klik
            val yearOfBirth = txtYearOfBirth.text.toString().toInt()  // pertama harus di parsing dulu seperti biasa ...
            val currentYear = Calendar.getInstance().get(Calendar.YEAR) // disini kita ngeset kalender tahun terakhir sekarang
            val myAge = currentYear - yearOfBirth // disini dihitung usia kalian

            // disini buat kondisi kalau isi dari edit textnya itu 0 keluar hasil dengan text inputan invalid
            if (yearOfBirth == 0) {
                tvShowAge.text = "Input Invalid"
                // sedangkan kalau bukan angka 0 yang di inputkan maka akan keluar hasil dari perhitungan di atas
            } else
                tvShowAge.text = "Your age is $myAge years"
        }
    }
}
