package com.example.bridge.abstraction

import com.example.bridge.implmentor.Color
import java.io.PrintWriter

class Bike (c: Color, w: Int, l: Int): Vehicle(c){

   private val weight = w
    private val length = l

    override fun vehicleColor() {
        println("Cyklen vejer $weight og har en længde på $length")
        color.vehicleColor()
    }

}