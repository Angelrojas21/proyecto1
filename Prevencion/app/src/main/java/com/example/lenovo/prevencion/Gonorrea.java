package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Gonorrea extends AppCompatActivity {
    String informacion=("Es una enfermedad de transmisión sexual común causada por una infección bacteriana. A menudo no presenta síntomas, pero es fácil de tratar una vez diagnosticada.");
    TextView tv18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonorrea);
        tv18=(TextView)findViewById(R.id.tv18);
        tv18.setText(informacion);
    }
}
