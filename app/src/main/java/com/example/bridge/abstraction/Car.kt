package com.example.bridge.abstraction

import com.example.bridge.implmentor.Color

class Car(c: Color, w: Int, l: Int,trailer:Boolean):Vehicle(c){

    private val weight = w
    private val length = l
    private var trailer:String= haveTrailer(trailer)




    override fun vehicleColor() {
        println("Bilen vejer $weight kg, og er $length m lang og  $trailer en trailer")
        color.vehicleColor()
    }

    private fun haveTrailer(t:Boolean):String{
        return if (t){
            "Kan Have"
        }else{
            "Kan Ikke Have "
        }
    }
}