package com.example.inputnama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //inisialisasi variable lateinit
    private lateinit var Username: EditText
    private lateinit var button : Button
    private lateinit var Welcome : TextView

    //Connect variable UI dengan android
    private fun initComponents(){
        Username = findViewById(R.id.Username)
        button = findViewById(R.id.button)
        Welcome = findViewById(R.id.Welcome)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()

//        Welcome.text = "Hallo"
        //kita akan merubah data di variable Welcome menjadi data app_name, jadi saat awal masuk page tampil : Belajar Android

        Welcome.text = resources.getString(R.string.app_name)
        //Baris pertama ini mengubah teks yang ditampilkan dalam elemen  TextView dengan ID "Welcome" menjadi "Hallo"
        button.setOnClickListener {
            val name = Username.text.toString()
            //mengambil teks di elemen EditText dengan ID "Username" dan mengonversinya menjadi string.
//            Welcome.setText("Hallo $name")
            //Setelah nama  diambil dan disimpan dalam variabel name, teks yang ditampilkan dalam elemen TextView
            //Resource akan diubah ke string yang diambil oleh fungsi getString di id nama
            Welcome.text = resources.getString(R.string.nama)
        }

    }

}