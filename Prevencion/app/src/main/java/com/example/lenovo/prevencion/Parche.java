package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Parche extends AppCompatActivity {
String informacion=("El parche es 91% efectivo. El parche no protege contra las enfermedades de transmisión sexual. " +
        "Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además del parche."+
        "El parche anticonceptivo evita embarazos al impedir la llegada del esperma al óvulo (lo que se denomina “fertilización”). Como la mayoría de las píldoras anticonceptivas, el parche contiene las hormonas estrógeno y progestina, que son similares a las hormonas que genera el cuerpo de manera natural. " +
        "El parche se coloca en determinadas partes del cuerpo, y las hormonas se absorben a través de la piel.");
    TextView tv10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parche);
        tv10=(TextView)findViewById(R.id.tv10);
        tv10.setText(informacion);
    }
}
