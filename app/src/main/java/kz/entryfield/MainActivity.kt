package kz.entryfield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var buttonVisibility: Button? = null
    private var buttonCheck: Button? = null
    private var editTextLogin: EditText? = null
    private var editTextPassword: EditText? = null
    private var textView: TextView? = null

    private var buttonFlag = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews(){
        buttonVisibility = findViewById(R.id.buttonVisibility)
        buttonCheck = findViewById(R.id.buttonCheck)
        editTextLogin = findViewById(R.id.editTextLogin)
        editTextPassword = findViewById(R.id.editTextPassword)
        textView = findViewById(R.id.textView)
    }

    private fun initializeLiseners(){
        buttonVisibility?.setOnClickListener {
            if(buttonFlag == 1) {
                buttonFlag = 0

                buttonCheck?.visibility = View.INVISIBLE
                editTextLogin?.visibility = View.INVISIBLE
                editTextPassword?.visibility = View.INVISIBLE
                textView?.visibility = View.INVISIBLE
            }
            else {
                buttonFlag = 1

                buttonCheck?.visibility = View.VISIBLE
                editTextLogin?.visibility = View.VISIBLE
                editTextPassword?.visibility = View.VISIBLE
                textView?.visibility = View.VISIBLE
            }
        }

        editTextLogin?.setOnClickListener {
            if(editTextLogin?.text.toString().equals("Login")){
                editTextLogin?.setText("")
            }
        }

        editTextPassword?.setOnClickListener {
            if(editTextPassword?.text.toString().equals("Password")){
                editTextPassword?.setText("")
            }
        }

        buttonCheck?.setOnClickListener{
            if(editTextLogin?.text.toString().equals("icarus") && editTextPassword?.text.toString().equals("fallen")) {
                textView?.setText("It is so sad =(")
            }
            else {
                textView?.setText("")
            }
        }
    }
}