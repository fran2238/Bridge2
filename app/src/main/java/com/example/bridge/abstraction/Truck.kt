package com.example.bridge.abstraction

import com.example.bridge.implmentor.Color

class Truck (c: Color, w: Int, l: Int, sizeOfHanger:Double):Vehicle(c){
    private val weight = w
    private val length = l
    private val size = sizeOfHanger

    override fun vehicleColor() {

        println("LastBilen vejer $weight kg og er $length lang og har en afhænger på $size meter")
        color.vehicleColor()
    }

}