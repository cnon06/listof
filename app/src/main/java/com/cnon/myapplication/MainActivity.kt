package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import java.util.concurrent.Flow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // listof a sonradan değer atanamıyor.
        // listofnotnull  null değer alır ama size metodunda sayılmaz

        var thg2 = listOfNotNull(1,2.36,"Sinan",567L,'h',null)

        var thg = listOf<Any>(1,2.36,"Sinan",567L,'h')

        for (i in thg)
        {
            println(i)
        }

        println("..............................................")

        println(thg.get(3))
        println(thg[2])
        println(thg.size)
        println(thg2.size)


        var sayi1 : Int= thg.get(0) as Int
       // var sayi2 : Int= thg.get(1) as Int

        println(sayi1*2)


    }


}