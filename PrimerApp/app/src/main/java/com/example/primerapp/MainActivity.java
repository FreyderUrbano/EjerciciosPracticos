package com.example.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText espacio1;
    private EditText espacio2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        espacio1 = (EditText) findViewById(R.id.primero);
        espacio2 = (EditText) findViewById(R.id.segundo);
        resultado = (TextView) findViewById(R.id.res);


//PRIMER EJEMPLO
        /*int mate = 5;
        int quim = 5;
        int fisica = 5;
        int promedio = 0;

        promedio = (mate + quim + fisica) / 3;

        if (promedio >= 6) {
            Toast.makeText(this, "APROBADO", Toast.LENGTH_SHORT).show();
        } else if (promedio <= 5) {
            Toast.makeText(this, "REPROBADO", Toast.LENGTH_LONG).show();
        }*/
    }

    //este metodo realiza la suma


    public void Suma(View view) {
        String valor1 = espacio1.getText().toString();
        String valor2 = espacio2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = (num1 + num2);

        String resultadoSuma = String.valueOf(suma);
        resultado.setText(resultadoSuma);
    }

}