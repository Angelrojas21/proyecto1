package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Verrugas extends AppCompatActivity {
    String informacion=("Son protuberancias en la piel del área genital y alrededor del ano. Son causadas por ciertos tipos de virus del papiloma humano (VPH).");
    TextView tv21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verrugas);
        tv21=(TextView)findViewById(R.id.tv21);
        tv21.setText(informacion);
    }
}
