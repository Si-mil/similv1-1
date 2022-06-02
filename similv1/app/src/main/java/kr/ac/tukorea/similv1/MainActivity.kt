package kr.ac.tukorea.similv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var miljip : ImageView
    lateinit var end : ImageView
    var image = arrayOfNulls<ImageView>(10)
    var imageId = arrayOf(R.id.mainsammi,R.id.mainmaehwa,R.id.maineunhaeng,R.id.mainmokgam,R.id.maincityhall,
        R.id.mainnoin,R.id.mainbaegot,R.id.mainwolgot,R.id.mainoido,R.id.mainemart)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in imageId.indices){
            image[i]=findViewById<ImageView>(imageId[i])
        }
        image[0]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity1::class.java)
            startActivity(intent)
        }
        image[1]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity2::class.java)
            startActivity(intent)
        }
        image[2]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity3::class.java)
            startActivity(intent)
        }
        image[3]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity4::class.java)
            startActivity(intent)
        }
        image[4]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity5::class.java)
            startActivity(intent)
        }
        image[5]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity6::class.java)
            startActivity(intent)
        }
        image[6]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity7::class.java)
            startActivity(intent)
        }
        image[7]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity8::class.java)
            startActivity(intent)
        }
        image[8]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity9::class.java)
            startActivity(intent)
        }
        image[9]?.setOnClickListener {
            var intent = Intent(applicationContext,SecondActivity10::class.java)
            startActivity(intent)
        }



        miljip=findViewById<ImageView>(R.id.mainmiljip)
        end=findViewById<ImageView>(R.id.mainend)

        miljip.setOnClickListener {

        }
        end.setOnClickListener {
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }
}