package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Diu extends AppCompatActivity {
    String informacion=("El dispositivo intrauterino (DIU) es 99% efectivo." +
            "El dispositivo intrauterino no protege contra las enfermedades de transmisión sexual." +
            " Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además del dispositivo intrauterino"+
    "DIU significa “dispositivo intrauterino” (básicamente, un dispositivo dentro del útero). Es una pequeña pieza de plástico flexible en forma de T. En ocasiones, también se denomina AIU (anticonceptivo intrauterino).");
    private TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diu);
        tv11=(TextView)findViewById(R.id.tv11);
        tv11.setText(informacion);
    }
}
