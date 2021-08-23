package com.example.practica_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.numero1);
        et2 = (EditText)findViewById(R.id.numero2);
        rb1 = (RadioButton)findViewById(R.id.suma);
        rb2 = (RadioButton)findViewById(R.id.resta);
        rb3 = (RadioButton)findViewById(R.id.multiplicacion);
        rb4 = (RadioButton)findViewById(R.id.divicion);
        tv1 = (TextView)findViewById(R.id.textView);
    }

    //CODIGO PARA EL BOTON ACTUALIZAR

    public  void  Calcular(View boton){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if (rb1.isChecked() == true){
            int suma = valor1_int + valor2_int;
             String Res = String.valueOf(suma);
             tv1.setText(Res);
        }else if(rb2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            String Res = String.valueOf(resta);
            tv1.setText(Res);
        }else if (rb3.isChecked() == true){
            int multiplicacion = valor1_int * valor2_int;
            String Multi = String.valueOf(multiplicacion);
            tv1.setText(Multi);
        }else if(rb4.isChecked() == true){

            if (valor2_int != 0){
                int divicion = valor1_int/valor2_int;
                String Divi = String.valueOf(divicion);
                tv1.setText(Divi);
            } else {
                Toast.makeText(this,"EL SEGUNDO VALOR DEBE SER DIFERENTE DE CERO",Toast.LENGTH_LONG).show();
            }

        }
    }
}