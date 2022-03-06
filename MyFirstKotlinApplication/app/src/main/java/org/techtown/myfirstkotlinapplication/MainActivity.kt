package org.techtown.myfirstkotlinapplication

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    val random= Random();
    val array=arrayOfNulls<Int>(46)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num1=findViewById<Button>(R.id.button1);
        val num2=findViewById<Button>(R.id.button2);
        val num3=findViewById<Button>(R.id.button3);
        val num4=findViewById<Button>(R.id.button4);
        val num5=findViewById<Button>(R.id.button5);
        val num6=findViewById<Button>(R.id.button6);

        findViewById<FloatingActionButton>(R.id.floatingActionButton2).setOnClickListener{
            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)

            for(i in array.indices){
                array[i]=null
            }

        }
    }
    fun setLottoNum(lottoNum: Button) {
        var intData:Int=0
        var ch:Int=0
        while(ch==0) {
            intData=(random.nextInt(45) + 1)
            if(array[intData]==null){
                array[intData]=1
                ch=1
            }
        }
        lottoNum.text = "${intData}"

        if(intData>40)//초
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(0, 255, 0))

        else if(intData>30)//회
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(48, 39, 32))

        else if(intData>20)//발
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,0,0))

        else if(intData>10)//파
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,0,255))

        else if(intData>0)//sh
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(248, 224, 38))

        //Color.rgb(0,0,255) 파 Color.rgb(0, 255, 0)초 Color.rgb(255,0,0)빨
   //Color.rgb(48, 39, 32)회 Color.rgb(248, 224, 38) 노
    }
}