package com.example.practica_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sp1;
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.numero1);
        et2 = (EditText) findViewById(R.id.numero2);
        tv1 = (TextView) findViewById(R.id.tv1_res);
        sp1 = (Spinner) findViewById(R.id.spinner);

        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};

        ArrayAdapter<String> lista = new ArrayAdapter<String>(this, R.layout.spinner_item_calcular, opciones);
        sp1.setAdapter(lista);

    }

    //metodo para boton calcular
    public void Calcular(View Spinner) {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = sp1.getSelectedItem().toString();

        if (seleccion.equals("sumar")) {
            int suma = valor1_int + valor2_int;
            String Resultado = String.valueOf(suma);
            tv1.setText(Resultado);
        } else if (seleccion.equals("restar")) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (seleccion.equals("multiplicar")) {
            int multi = valor1_int * valor2_int;
            String res = String.valueOf(multi);
            tv1.setText(res);
        } else if (seleccion.equals("dividir")) {

            if (valor2_int != 0) {
                int divicion = valor1_int / valor2_int;
                String divi = String.valueOf(divicion);
                tv1.setText(divi);
            }else {
                Toast.makeText(this, "la division entre cero no exite", Toast.LENGTH_LONG).show();
            }
        }


    }
}