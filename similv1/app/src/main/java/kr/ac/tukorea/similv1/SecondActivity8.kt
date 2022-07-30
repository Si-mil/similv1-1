package kr.ac.tukorea.similv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var back: ImageView
        lateinit var end: ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second8)
        back=findViewById<ImageView>(R.id.back)
        end=findViewById<ImageView>(R.id.end)
        back.setOnClickListener {
            finish()
        }
        end.setOnClickListener {
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }
}