package com.example.ex6

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val usnEditText = findViewById<EditText>(R.id.usnEditText)
        val courseSpinner = findViewById<Spinner>(R.id.courseSpinner)
        val maleRadio = findViewById<RadioButton>(R.id.maleRadio)
        val femaleRadio = findViewById<RadioButton>(R.id.femaleRadio)
        val termsCheckBox = findViewById<CheckBox>(R.id.termsCheckBox)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val courses = arrayOf(
            "Select Course",
            "MCA",
            "BCA",
            "B.Tech",
            "M.Tech"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            courses
        )

        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        courseSpinner.adapter = adapter

        submitButton.setOnClickListener {

            val name = nameEditText.text.toString().trim()
            val usn = usnEditText.text.toString().trim()
            val course = courseSpinner.selectedItem.toString()

            val gender = when {
                maleRadio.isChecked -> "Male"
                femaleRadio.isChecked -> "Female"
                else -> ""
            }

            if (name.isEmpty()) {
                nameEditText.error = "Enter your name"
                return@setOnClickListener
            }

            if (usn.isEmpty()) {
                usnEditText.error = "Enter your USN"
                return@setOnClickListener
            }

            if (course == "Select Course") {
                Toast.makeText(
                    this,
                    "Please select a course",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            if (gender.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please select gender",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            if (!termsCheckBox.isChecked) {
                Toast.makeText(
                    this,
                    "Please accept the terms",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            resultTextView.text = """
                Registration Successful

                Name: $name
                USN: $usn
                Course: $course
                Gender: $gender
            """.trimIndent()
        }

        clearButton.setOnClickListener {

            nameEditText.text.clear()
            usnEditText.text.clear()

            courseSpinner.setSelection(0)

            maleRadio.isChecked = false
            femaleRadio.isChecked = false

            termsCheckBox.isChecked = false

            resultTextView.text = ""
        }
    }
}