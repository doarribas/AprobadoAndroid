package com.example.pruebasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b0 = findViewById(R.id.button0);

        // Pagina 37
        Evento e = new Evento();
        //ArrayList array = new ArrayList();

        b1.setOnClickListener(e);
        b2.setOnClickListener(e);
        b3.setOnClickListener(e);
        b4.setOnClickListener(e);
        b5.setOnClickListener(e);
        b6.setOnClickListener(e);
        b7.setOnClickListener(e);
        b8.setOnClickListener(e);
        b9.setOnClickListener(e);
        b0.setOnClickListener(e);

        //int random = (int) Math.floor(Math.random()*(100-0+1)+0);
/*        if (pulsado < random)
            textView.setText("Te has quedado corto");
        else if (pulsado > random)
            textView.setText("Te has pasado");
        else
            textView.setText("¡Acertaste!");*/
    }

    class Evento implements View.OnClickListener {

        public void onClick(View v) {
            Button b = (Button) v;
            TextView textView = findViewById(R.id.textView);
            textView.setText("El Nº es " + b.getText());
        }
    }
}