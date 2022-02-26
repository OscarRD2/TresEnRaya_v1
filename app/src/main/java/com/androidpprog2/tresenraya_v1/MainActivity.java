package com.androidpprog2.tresenraya_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    TextView Jugador1;
    TextView Jugador2;
    Integer[] botones;
    int[] tablero = new int[]{
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazamos elementos graficos con nuestro codigo.
        Jugador1 = (TextView) findViewById(R.id.Jugador1);
        Jugador2 = (TextView) findViewById(R.id.Jugador2);
        //Escondemos texto
        Jugador2.setVisibility(View.INVISIBLE);

        botones = new Integer[]{
                R.id.b1, R.id.b2, R.id.b3,
                R.id.b4, R.id.b5, R.id.b6,
                R.id.b7, R.id.b8, R.id.b9,
        };
    }


    public void insertarFicha(View v){
        //Turno jugador 1
        int numBoton = Arrays.asList(botones).indexOf(v.getId());
        v.setBackgroundResource(R.drawable.cruz);
        tablero[numBoton] = 1;
        //Turno jugador 2


    }

/*
        public void insertarFichaJ2(){
        Jugador1.setVisibility(View.INVISIBLE);
        Jugador2.setVisibility(View.VISIBLE);
       int pos = Arrays.asList(botones).indexOf(v.getId());
        Button b = (Button) findViewById(botones[pos]);
        b.setBackgroundResource(R.drawable.circulo);
        tablero[pos] = 2;
    }
*/
}