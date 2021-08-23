package com.example.guardardatosentarjetasd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et_titulo;
    private EditText et_datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_titulo = (EditText)findViewById(R.id.titulo_datos);
        et_datos = (EditText)findViewById(R.id.datos_guardados);

    }

    //BOTON GUARDAR

    public void Guardar(View Guardar){
        String titulo = et_titulo.getText().toString();
        String datos = et_datos.getText().toString();

        try {
            File TSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this,TSD.getPath(), Toast.LENGTH_SHORT).show();
            File ruta = new File(TSD.getPath(),titulo);
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(titulo, Activity.MODE_PRIVATE));
            archivo.write(datos);
            archivo.flush();
            archivo.close();

            Toast.makeText(this,"GUARDADO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            et_titulo.setText("");
            et_datos.setText("");

        }catch (IOException e){
            Toast.makeText(this, "NO SE PUDO GUARDAR", Toast.LENGTH_SHORT).show();
        }
    }

    //boton consultar

    public void Consultar(View Consultar){
        String titulo = et_titulo.getText().toString();

        try {
            File TSD = Environment.getExternalStorageDirectory();
            File ruta = new File(TSD.getPath(), titulo);
            InputStreamReader archivo = new InputStreamReader(openFileInput(titulo));

            BufferedReader leer = new BufferedReader(archivo);

            String linea = leer.readLine();
            String contenidoCompleto = "";

            while(linea != null){
                contenidoCompleto = contenidoCompleto + linea + "\n";
                linea = leer.readLine();

            }
            leer.close();
            leer.close();
            et_datos.setText(contenidoCompleto);


        }catch (IOException e){
            Toast.makeText(this, "ERROR AL LEER EL ARCHIVO", Toast.LENGTH_LONG).show();

        }
    }
}