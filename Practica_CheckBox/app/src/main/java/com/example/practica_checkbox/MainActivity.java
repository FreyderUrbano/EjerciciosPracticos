package com.example.practica_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  EditText et1,et2;
    private CheckBox che1,che2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.numero1);
        et2 = (EditText)findViewById(R.id.numero2);
        che1 = (CheckBox)findViewById(R.id.che1);
        che2 = (CheckBox)findViewById(R.id.che2);
        tv1 = (TextView)findViewById(R.id.tv_res);

    }
//metodo para boton calcular
    public void Calcular(View Checkbox){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";
        if (che1.isChecked() == true){
            int suma = valor1_int + valor2_int;
            resultado = " LA SUMA ES : " + suma + " / " ;
        }
        if (che2.isChecked() == true){
            int resta = valor1_int - valor2_int;
            resultado = resultado + " LA RESTA ES : "+ resta;
        }
        tv1.setText(resultado);
    }
}