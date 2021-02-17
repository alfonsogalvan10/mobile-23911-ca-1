package com.example.AdditionCalculatorCA1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresPermission
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            //Click Listener for the Add button
            findViewById<Button>(R.id.btnAdd).setOnClickListener{
                addition()
            }
    }

    private fun addition(){
        //Assign the TextViews
        val txtNumber1 : TextView = findViewById<TextView>(R.id.txtNumber1)
        val txtNumber2 : TextView = findViewById<TextView>(R.id.txtNumber2)
        val lblResult : TextView = findViewById<TextView>(R.id.lblResult)
        //Check for content, otherwise throw message
        if(txtNumber1.text.isEmpty() && txtNumber2.text.isEmpty())
        {
            Toast.makeText(this, "Set the numbers beforehand", Toast.LENGTH_SHORT).show()
        }
        else{
            lblResult.text = ""
            lblResult.text = (txtNumber1.text.toString().toInt() + txtNumber2.text.toString().toInt()).toString()
            //Log the result
            Log.i("ADDITION", "The result of this operation is " + lblResult.text)
            clearNumbers()
        }
    }

    //Clear the editable TextViews
    private fun clearNumbers(){
        findViewById<TextView>(R.id.txtNumber1).text = ""
        findViewById<TextView>(R.id.txtNumber2).text = ""
    }
}