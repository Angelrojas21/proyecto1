package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sifilis extends AppCompatActivity {
    String informacion=("La sífilis es una infección bacteriana común. Se cura fácilmente con medicamentos, pero puede ser peligrosa si no se trata.");
    TextView tv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifilis);
        tv20=(TextView)findViewById(R.id.tv20);
        tv20.setText(informacion);
    }
}
