package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Inyeccion extends AppCompatActivity {
    String informacion=("La inyección anticonceptiva es 94% efectiva. La inyección no protege contra las enfermedades de transmisión sexual." +
            " Para evitar el embarazo y las enfermedades de transmisión sexual, usa un condón además de la inyección."+
            "La inyección anticonceptiva (también conocida como “Depo Provera”, “inyección Depo” o “inyección anticonceptiva DMPA”) contiene la hormona progestina. Esta hormona evita el embarazo mediante la inhibición de la ovulación. Sin óvulo en las trompas, no puede haber embarazo. Además, esta hormona espesa el moco cervical, lo cual representa una barrera para el esperma. " +
            "Al no poder juntarse el esperma con el óvulo, no puede haber embarazo.");
    private TextView tv15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inyeccion);
        tv15=(TextView)findViewById(R.id.tv15);
        tv15.setText(informacion);
    }
}
