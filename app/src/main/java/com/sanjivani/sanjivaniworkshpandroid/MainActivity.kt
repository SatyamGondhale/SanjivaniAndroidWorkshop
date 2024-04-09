package com.sanjivani.sanjivaniworkshpandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewSample: TextView
    lateinit var editTextName: EditText
    lateinit var inputEmail: EditText
    lateinit var inputPhone: EditText
    lateinit var submitDetailsButton: Button
    lateinit var genderRadioGroup: RadioGroup
    lateinit var feelingSleepy: CheckBox
    lateinit var leaveUsAlone: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MAIN_ACTIVITY", "onCreate Called")
        setContentView(R.layout.activity_main)
        textViewSample = findViewById(R.id.sampleTextView)
        editTextName = findViewById(R.id.editTextSample)
        inputEmail = findViewById(R.id.inputEmail)
        inputPhone = findViewById(R.id.inputPhone)
        submitDetailsButton = findViewById(R.id.submitDetails)
        genderRadioGroup = findViewById(R.id.inputGenderRadioGroup)
        feelingSleepy = findViewById(R.id.sleepyCheckBox)
        leaveUsAlone = findViewById(R.id.leaveAloneCheckBox)
        textViewSample.text = "Sign Up Form"
        submitDetailsButton.setOnClickListener {
            val getName = editTextName.text
            val getEmail = inputEmail.text
            val getPhone = inputPhone.text
            val getSelectedRadioButtonId = genderRadioGroup.checkedRadioButtonId
            val checkBoxSleepyValue = feelingSleepy.isChecked
            val checkAloneValue = leaveUsAlone.isChecked
            val getRadioValue = findViewById<RadioButton>(getSelectedRadioButtonId)

            val intent: Intent = Intent(this@MainActivity, SecondScreen::class.java)
            intent.putExtra("data",getName.toString()+" "+getEmail.toString()+" "+getPhone)
            startActivity(intent)
            Log.i("MAIN_ACTIVITY_INPUT", getName.toString()+" "+getEmail.toString()+" "+getPhone+ " "+getRadioValue+""+checkBoxSleepyValue+" "+checkAloneValue)
        }
        var getText = editTextName.text
        Log.i("MAIN_ACTIVITY_INPUT", getText.toString())

    }

    override fun onStart() {
        super.onStart()
        Log.i("MAIN_ACTIVITY", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MAIN_ACTIVITY", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MAIN_ACTIVITY", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAIN_ACTIVITY", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MAIN_ACTIVITY", "onDestroy Called")
    }
}