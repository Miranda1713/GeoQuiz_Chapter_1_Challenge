package com.flagg.msu.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton  = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            // Do something in response to the click here
            val snackBar = Snackbar.make(
                it,
                "Correct",
                Snackbar.LENGTH_SHORT
            )
            snackBar.show()
        }

        falseButton.setOnClickListener {
            // Do something in response to the click here
            val snackBar = Snackbar.make(
                it,
                "Incorrect",
                Snackbar.LENGTH_SHORT
            )
            snackBar.show()
        }
    }


    }