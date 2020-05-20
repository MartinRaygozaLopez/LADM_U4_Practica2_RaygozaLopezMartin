package com.example.ladm_u4_practica2_raygozalopezmartin

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import androidx.core.content.ContextCompat.getSystemService

class Lienzo(interfaz: Context?) : View(interfaz) {
    var Cx = 440f
    var cielo = true

    override fun onDraw(c : Canvas) {
        var p = Paint()

        if(cielo) {
            //Cielo dia
            c.drawColor(Color.rgb(81,209,246))
            p.color = Color.YELLOW
            c.drawCircle(1080f, 0f, 300f, p)

            p.color = Color.rgb(255,255,255)
            p.style = Paint.Style.FILL
            c.drawCircle(400f, 250f, 30f, p)
            c.drawCircle(380f, 230f, 30f, p)
            c.drawCircle(340f, 230f, 30f, p)
            c.drawCircle(300f, 220f, 35f, p)
            c.drawCircle(280f, 250f, 30f, p)
            c.drawCircle(300f, 270f, 30f, p)
            c.drawCircle(335f, 280f, 30f, p)
            c.drawCircle(373f, 278f, 20f, p)
            c.drawCircle(353f, 270f, 20f, p)

            c.drawCircle(900f, 450f, 30f, p)
            c.drawCircle(880f, 430f, 30f, p)
            c.drawCircle(840f, 430f, 30f, p)
            c.drawCircle(800f, 420f, 35f, p)
            c.drawCircle(780f, 450f, 30f, p)
            c.drawCircle(800f, 470f, 30f, p)
            c.drawCircle(835f, 480f, 30f, p)
            c.drawCircle(873f, 478f, 20f, p)
            c.drawCircle(853f, 470f, 20f, p)

            c.drawCircle(300f, 550f, 30f, p)
            c.drawCircle(280f, 530f, 30f, p)
            c.drawCircle(240f, 530f, 30f, p)
            c.drawCircle(200f, 520f, 35f, p)
            c.drawCircle(180f, 550f, 30f, p)
            c.drawCircle(200f, 570f, 30f, p)
            c.drawCircle(235f, 580f, 30f, p)
            c.drawCircle(273f, 578f, 20f, p)
            c.drawCircle(253f, 570f, 20f, p)

        } else {
            //Cielo noche
            c.drawColor(Color.rgb(37,40,80))
            //Luna
            p.color = Color.rgb(225,225,225)
            p.style = Paint.Style.FILL
            c.drawCircle(800f, 200f, 150f, p)
            p.color = Color.rgb(37,40,80)
            p.style = Paint.Style.FILL
            c.drawCircle(900f, 200f, 150f, p)


            //Estrellas
            p.color = Color.rgb(255,255,255)
            p.style = Paint.Style.FILL
            c.drawCircle(400f, 250f, 10f, p)
            c.drawCircle(200f, 150f, 10f, p)
            c.drawCircle(173f, 520f, 10f, p)
            c.drawCircle(941f, 334f, 10f, p)
            c.drawCircle(504f, 270f, 10f, p)
            c.drawCircle(431f, 612f, 10f, p)
            c.drawCircle(855f, 242f, 10f, p)
            c.drawCircle(423f, 321f, 10f, p)
            c.drawCircle(752f, 542f, 10f, p)
            c.drawCircle(913f, 431f,10f, p)
        }

        //Carretera
        p.color = Color.rgb(125, 125, 125)
        c.drawRect(0f,900f,1080f, 1200f, p)

        //Lineas blancas
        p.color = Color.rgb(255, 255, 255)
        p.strokeWidth = 8f
        c.drawLine(0f,900f,1080f, 900f, p)
        c.drawLine(0f,1200f,1080f, 1200f, p)
        c.drawLine(10f,1050f,110f, 1050f, p)
        c.drawLine(160f,1050f,250f, 1050f, p)
        c.drawLine(300f,1050f,390f, 1050f, p)
        c.drawLine(440f,1050f,530f, 1050f, p)
        c.drawLine(580f,1050f,670f, 1050f, p)
        c.drawLine(720f,1050f,810f, 1050f, p)
        c.drawLine(860f,1050f,950f, 1050f, p)
        c.drawLine(1000f,1050f,1090f, 1050f, p)

        //Pasto
        p.color = Color.rgb(17, 194, 7)
        c.drawRect(0f,1206f,1080f, 1600f, p)

        //Carro
        c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.carro), Cx, 1050f, p)
    }
}