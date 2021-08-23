package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.numero1);
        et2 = (EditText) findViewById(R.id.numero2);
        tv1 = (TextView) findViewById(R.id.resultado);
        rb1 = (RadioButton) findViewById(R.id.suma);
        rb2 = (RadioButton) findViewById(R.id.resta);
        rb3 = (RadioButton)findViewById(R.id.multi);
        rb4 = (RadioButton)findViewById(R.id.divi);
    }

    //metodo para boton calcular
    public void Calcular(View viem){
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if (rb1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rb2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if (rb3.isChecked() == true){
            int multiplicacion = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        }else if(rb4.isChecked() == true){
            int divicion = valor1_int / valor2_int;
            String resultado = String.valueOf(divicion);
            tv1.setText(resultado);

        }
    }
}