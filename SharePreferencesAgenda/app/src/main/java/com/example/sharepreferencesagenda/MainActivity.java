package com.example.sharepreferencesagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombres;
    private EditText et_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombres = (EditText)findViewById(R.id.nombre);
        et_datos = (EditText)findViewById(R.id.datos);
    }

    //METODO PARA EL BOTON GUARDAR

    public void Guardar(View Guardar){
        String nombre = et_nombres.getText().toString();
        String datos = et_datos.getText().toString();

        SharedPreferences memoria = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = memoria.edit();
        obj_editor.putString(nombre, datos);
        obj_editor.commit();

        Toast.makeText(this,"CONTACTO GUARDADO", Toast.LENGTH_LONG).show();
    }
    //METODO PARA EL BOTON BUSCAR

    public void Buscar(View Buscar){
        String nombre = et_nombres.getText().toString();

        SharedPreferences buscar = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String datos = buscar.getString(nombre, "");

        if (datos.length() == 0){
            Toast.makeText(this, "NO SE ENCONTRO EL CONTACTO",Toast.LENGTH_LONG).show();
        }else{
            et_datos.setText(datos);
        }
    }
}