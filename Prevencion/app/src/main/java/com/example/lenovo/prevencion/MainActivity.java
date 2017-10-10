package com.example.lenovo.prevencion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanza(View v){
        Intent actividad=new Intent(MainActivity.this,Enfermedades.class);
        startActivity(actividad);
    }
    public void lanza1(View view){
        Intent actividad=new Intent(MainActivity.this,Metodos.class);
        startActivity(actividad);
    }
}
