package com.example.saturn_frans.pertemuan_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.saturn_frans.MainActivity
import com.example.saturn_frans.R
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        Log.e("onCreate", "FourthActivity dibuat pertama kali")

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val btnShowSnackbar = findViewById<Button>(R.id.btnShowSnackbar)
        btnShowSnackbar.setOnClickListener {
            Snackbar.make(it, "Ini adalah Snackbar", Snackbar.LENGTH_SHORT)
                .setAction("Tutup") {
                    Log.e("Info Snackbar", "Snackbar ditutup")
                }
                .show()
        }
        val btnShowAlertDialog = findViewById<Button>(R.id.btnShowAlertDialog)
        btnShowAlertDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah Anda yakin ingin melanjutkan?")
                .setPositiveButton("Ya") { dialog, _ ->
                    Log.e("Info Dialog", "Anda memilih Ya!")
                    dialog.dismiss()
                }
                .setNegativeButton("Batal") { dialog, _ ->
                    Log.e("Info Dialog", "Anda memilih Tidak!")
                    dialog.dismiss()
                }
                .show()

        }
    }

        override fun onStart() {
            super.onStart()
            Log.e("onStart", "onStart: {nama_activity} terlihat di layar")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.e("onDestroy", "{nama_activity} dihapus dari stack")
        }

    }
