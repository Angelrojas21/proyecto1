package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Condon extends AppCompatActivity {
    String informacion=("El condón es 82% efectivo. El condón ayuda a proteger contra las enfermedades de transmisión sexual." +
            " Para tener una capacidad de prevención del embarazo aún mayor, usa otro método anticonceptivo además del condón."+
            "El condón es una pequeña y delgada bolsa de látex (goma), plástico (poliuretano, nitrilo o poliisopreno) o piel de cordero que cubre el pene durante las relaciones sexuales y recoge el semen. " +
            "El condón evita que el esperma entre a la vagina, por lo que no puede encontrarse con un óvulo y producir un embarazo.\n" +
            "El condón también evita las enfermedades de transmisión sexual al cubrir el pene, lo que evita el contacto con el semen y los fluidos vaginales, y limita el contacto de piel a piel, que puede contagiar dichas enfermedades.");
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condon);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText(informacion);
    }
}
