package com.example.logopostobon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    //Atributos
    MediaPlayer cancion;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        cancion=MediaPlayer.create(this,R.raw.sonidorefresco);
        cancion.start();

        TimerTask inicio= new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                finish();

            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicio,8000);
    }
}