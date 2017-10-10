package com.example.lenovo.prevencion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Clamidia extends AppCompatActivity {
    String informacion=("Es una enfermedad de transmisión sexual muy común causada por una infección bacteriana." +
            " A menudo no presenta síntomas, pero es fácil de tratar una vez diagnosticada."+
            "La clamidiasis se transmite a través de las relaciones sexuales vaginales y anales y el sexo oral. La bacteria se encuentra en el esperma (semen), el líquido preeyaculatorio y las secreciones vaginales. La clamidia puede infectar el pene, la vagina, el cuello uterino, el ano, la uretra, los ojos y la garganta. La mayoría de las personas con clamidiasis no tienen síntomas y se sienten perfectamente bien, de modo que es posible que ni siquiera sepan que están infectadas.");
    private TextView TV17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clamidia);
        TV17=(TextView)findViewById(R.id.TV17);
        TV17.setText(informacion);
    }
}
