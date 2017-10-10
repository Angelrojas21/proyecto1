package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sida extends AppCompatActivity {
    String informacion=("El VIH es una infección que destruye el sistema inmunológico y conduce al SIDA. No existe una cura, pero el tratamiento te puede ayudar a mantenerte sano.");
    TextView tv19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sida);
        tv19=(TextView)findViewById(R.id.tv19);
        tv19.setText(informacion);
    }
}
