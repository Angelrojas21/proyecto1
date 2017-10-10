package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Capuchon extends AppCompatActivity {
    String informacion=("El capuchón cervical es 71-86% efectivo. El capuchón cervical no protege contra las enfermedades de transmisión sexual." +
            " Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además del capuchón cervical."+
            "El capuchón cervical cubre el cuello uterino y evita que el esperma se una a un óvulo. " +
            "Para que el capuchón cervical funcione de la mejor manera, debe usarse con espermicida (una crema o un gel que destruye el esperma).");
    private TextView tv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capuchon);
        tv13=(TextView)findViewById(R.id.tv13);
        tv13.setText(informacion);
    }
}
