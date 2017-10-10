package com.example.lenovo.prevencion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Metodos extends AppCompatActivity {
    String informacion=("Los métodos anticonceptivos son diferentes maneras de prevenir embarazos. Hay muchos métodos distintos que funcionan muy bien y son fáciles de usar. Entonces, ¿estás preparado (a) para dejar de preocuparte por el embarazo? Estamos aquí para ayudarte a que comprendas todo.");
private TextView tv10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos);
        tv10=(TextView)findViewById(R.id.tv10);
        tv10.setText(informacion);
    }
    public void lanza2 (View v){
        Intent actividad=new Intent(Metodos.this,Condon.class);
        startActivity(actividad);
    }
    public void lanza3(View v){
        Intent actividad=new Intent(Metodos.this,Pastillas.class);
        startActivity(actividad);
    }
    public void lanza4(View v){
        Intent actividad= new Intent(Metodos.this,Parche.class);
        startActivity(actividad);

    }
    public void lanza5(View v){
        Intent actividad= new Intent(Metodos.this,Diu.class);
        startActivity(actividad);
    }
    public void lanza6(View v){
        Intent actividad= new Intent(Metodos.this,Anillo.class);
        startActivity(actividad);
    }
    public void lanza7(View view){
        Intent actividad= new Intent(Metodos.this,Capuchon.class);
        startActivity(actividad);
    }
    public void lanza8(View view){
        Intent actividad=new Intent(Metodos.this,Diafragma.class);
        startActivity(actividad);
    }
    public void lanza9(View v){
        Intent actividad=new Intent(Metodos.this,Inyeccion.class);
        startActivity(actividad);

    }
}
