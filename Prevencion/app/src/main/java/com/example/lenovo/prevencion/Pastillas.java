package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pastillas extends AppCompatActivity {
    String informacion=("La píldora es 91% efectiva. La píldora no protege contra las enfermedades de transmisión sexual. " +
            "Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además de la píldora."+
            "La píldora anticonceptiva funciona al impedir la llegada del esperma al óvulo (lo que se denomina “fertilización”).\n" +
            "Las hormonas de la píldora evitan la ovulación. Sin ovulación, no hay óvulo que el esperma pueda fertilizar, de modo que no puede producirse un embarazo.");
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastillas);
        tv2=(TextView)findViewById(R.id.tv2);
        tv2.setText(informacion);
    }
}
