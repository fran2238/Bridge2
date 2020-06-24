package com.example.bridge.abstraction

import com.example.bridge.implmentor.Color

abstract  class Vehicle(c: Color) {

  protected var color: Color = c

    abstract fun vehicleColor ()
}