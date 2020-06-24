package com.example.bridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bridge.abstraction.Bike
import com.example.bridge.abstraction.Car
import com.example.bridge.abstraction.Truck
import com.example.bridge.abstraction.Vehicle
import com.example.bridge.implmentor.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blackTruck: Vehicle = Truck(Black(),800,20,10.5)
        blackTruck.vehicleColor()

        val blueCar: Vehicle = Car(Blue(),150,4,true)
        blueCar.vehicleColor()

        val redBike : Vehicle = Bike(Red(),2,2)
        redBike.vehicleColor()

        val yellowTruck:Vehicle = Truck(Yellow(),750,15,5.2)
        yellowTruck.vehicleColor()

        val greenCar : Vehicle = Car(Green(),100,3,false)
        greenCar.vehicleColor()



    }
}