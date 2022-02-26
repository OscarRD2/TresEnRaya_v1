package com.androidpprog2.tresenraya_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView Jugador1;
    TextView Jugador2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazamos elementos graficos con nuestro codigo.
        Jugador1 = (TextView) findViewById(R.id.Jugador1);
        Jugador2 = (TextView) findViewById(R.id.Jugador2);
        //Escondemos texto
        Jugador2.setVisibility(View.INVISIBLE);

    }
}