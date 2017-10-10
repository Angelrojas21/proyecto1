package com.example.lenovo.prevencion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Enfermedades extends AppCompatActivity {
    String informacion = ("Las enfermedades de transmisión sexual son infecciones que se contagian de una persona a otra durante las relaciones sexuales vaginales, anales y orales. " +
            "Son muy comunes, y muchas personas que las tienen no presentan síntomas. " +
            "Las enfermedades de transmisión sexual pueden ser muy peligrosas y aveces mortales.");
    TextView tv16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfermedades);
        tv16 = (TextView) findViewById(R.id.tv16);
        tv16.setText(informacion);
    }

    public void lanza12(View v) {
        Intent actividad = new Intent(Enfermedades.this, Clamidia.class);
        startActivity(actividad);

    }

    public void lanza13(View v) {
        Intent actividad = new Intent(Enfermedades.this, Epatitis.class);
        startActivity(actividad);

    }

    public void lanza14(View v) {
        Intent actividad = new Intent(Enfermedades.this, Sida.class);
        startActivity(actividad);

    }

    public void lanza15(View v) {
        Intent actividad = new Intent(Enfermedades.this, Gonorrea.class);
        startActivity(actividad);

    }

    public void lanza16(View v) {
        Intent actividad = new Intent(Enfermedades.this, Sifilis.class);
        startActivity(actividad);

    }

    public void lanza17(View v) {
        Intent actividad = new Intent(Enfermedades.this, Verrugas.class);
        startActivity(actividad);

    }
}