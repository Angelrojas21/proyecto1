package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Diafragma extends AppCompatActivity {
    String informacion=("El diafragma es 88% efectivo. El diafragma no protege contra las enfermedades de transmisión sexual." +
            " Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además del diafragma."+
            "El diafragma es una barrera que cubre el cuello uterino y evita que el esperma se una a un óvulo." +
            " Para que un diafragma funcione de la mejor manera, debe usarse con espermicida (una crema o un gel que destruye el esperma).");
    private TextView tv14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diafragma);
        tv14=(TextView)findViewById(R.id.tv14);
        tv14.setText(informacion);
    }
}
