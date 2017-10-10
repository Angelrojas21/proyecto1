package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Epatitis extends AppCompatActivity {
String informacion=("Es un virus que puede causar enfermedad hepática y que se transmite a través de las relaciones sexuales o por compartir elementos de higiene como rasuradoras o cepillos dentales.");
    TextView tv17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epatitis);
        tv17=(TextView)findViewById(R.id.tv17);
        tv17.setText(informacion);
    }
}
