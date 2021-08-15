package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import com.example.myapplication.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
// DAGGER 2 include


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
    //    val buttonReg = findViewById<Button>(R.id.butReg)
  //  buttonReg.setOnClickListener(this::registerView)
    }



    fun registerView(view: View){
        startActivity( Intent(this, LoginActivity::class.java))

    }


}
