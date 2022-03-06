package org.techtown.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.button)
        val editTextPassword=findViewById<EditText>(R.id.editTextNumberPassword)
        val editTextEmail=findViewById<EditText>(R.id.editTextNumberPassword2)
        val Textview=findViewById<TextView>(R.id.textView);

        button.setOnClickListener{
            val emailText=editTextEmail.text.toString()
            val passwordText=editTextPassword.text.toString()

            if(emailText!="1234@gmail.com"){
                Log.d("Memo_Application","이메일 틀림")
                Textview.setText("이메일 틀림")
            }else if(passwordText!="1234") {
                Log.d("Memo_Application", "비밀번호 틀림")
                Textview.setText("비번 틀림")
            }else{
                Log.d("Memo_Application","통과")
                val intent = Intent(this, MemoActivity::class.java)
                startActivity(intent)
                this.finish()
            }
        }
    }
}