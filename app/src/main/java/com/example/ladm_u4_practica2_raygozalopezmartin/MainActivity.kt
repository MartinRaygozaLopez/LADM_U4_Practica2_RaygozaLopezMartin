package com.example.ladm_u4_practica2_raygozalopezmartin

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var lienzo : Lienzo
    lateinit var sensorManager : SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL)

        lienzo = Lienzo(this)
        setContentView(lienzo)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) { }

    override fun onSensorChanged(event: SensorEvent) {
        var Cx = event.values[0]

        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            lienzo.Cx = lienzo.Cx + (-Cx)
        }

        if(event.sensor.type == Sensor.TYPE_PROXIMITY) {
            lienzo.cielo = (event.values[0] >= 5f)
        }

        lienzo.invalidate()
    }
}
