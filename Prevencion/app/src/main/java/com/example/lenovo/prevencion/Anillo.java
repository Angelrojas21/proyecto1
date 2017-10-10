package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Anillo extends AppCompatActivity {
    String informacion=("El anillo anticonceptivo es 91% efectivo. El anillo no protege contra las enfermedades de transmisión sexual. " +
            "Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además del anillo."+
            "El anillo NuvaRing evita embarazos al impedir la llegada del esperma al óvulo (lo que se denomina “fertilización”). Como la mayoría de las píldoras anticonceptivas, el anillo contiene las hormonas estrógeno y progestina, que son similares a las hormonas que el cuerpo genera de manera natural. El anillo se coloca dentro de la vagina, donde las hormonas se absorben a través de sus paredes.\n" +
            "Las hormonas de NuvaRing impiden la ovulación." +
            " Sin ovulación, no hay óvulo que el esperma pueda fertilizar, de modo que no puede producirse un embarazo.");
    private TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anillo);
        tv12=(TextView)findViewById(R.id.tv12);
        tv12.setText(informacion);
    }
}
