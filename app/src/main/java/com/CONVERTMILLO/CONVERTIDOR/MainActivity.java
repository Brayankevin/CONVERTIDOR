package com.CONVERTMILLO.CONVERTIDOR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button PANTALLA1;
    Button PANTALLA2;
    Button PANTALLA3;
    Button PANTALLA4;
    Button PANTALLA5;
    Button PANTALLA6;
    Button PANTALLA7;
    Button PANTALLA8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PANTALLA1 = findViewById(R.id.CELSIO);
        PANTALLA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar1 = new Intent(MainActivity.this, celsius.class);
                startActivity(cambiar1);
            }
        });
        PANTALLA2 = findViewById(R.id.FHR);
        PANTALLA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar2 = new Intent(MainActivity.this, faren.class);
                startActivity(cambiar2);
            }
        });
        PANTALLA3 = findViewById(R.id.CELSIUS_KELVIN);
        PANTALLA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar3 = new Intent(MainActivity.this, celsius_a_kelvin.class);
                startActivity(cambiar3);
            }
        });
        PANTALLA4 = findViewById(R.id.KELVIN_CELSIUS);
        PANTALLA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar4 = new Intent(MainActivity.this, kelvin_celsius.class);
                startActivity(cambiar4);
            }
        });
        PANTALLA5 = findViewById(R.id.CENTIMETRO_METRO);
        PANTALLA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar5 = new Intent(MainActivity.this, centimetro_metro.class);
                startActivity(cambiar5);
            }
        });
        PANTALLA6 = findViewById(R.id.METRO_CENT);
        PANTALLA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar6 = new Intent(MainActivity.this, metro_centimetro.class);
                startActivity(cambiar6);
            }
        });
        PANTALLA8 = findViewById(R.id.PULG_CENT);
        PANTALLA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar7 = new Intent(MainActivity.this, pulgada_centimetro.class);
                startActivity(cambiar7);
            }
        });
        PANTALLA7 = findViewById(R.id.CENT_PULG);
        PANTALLA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar8 = new Intent(MainActivity.this, centimetro_pulgada.class);
                startActivity(cambiar8);
            }
        });
    }
}
