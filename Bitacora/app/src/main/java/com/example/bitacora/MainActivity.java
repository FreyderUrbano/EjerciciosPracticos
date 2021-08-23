package com.example.bitacora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et_bitacora);

        String Archivos[] = fileList();

        if (ArchivoExiste(Archivos, "bitacora.txt")) {
            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("bitacora.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String bitacoraCompleta = "";

                while (linea != null) {
                    bitacoraCompleta = bitacoraCompleta + linea;
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(bitacoraCompleta);
            } catch (IOException e) {

            }

        }


    }

    private boolean ArchivoExiste(String Archivos[], String NombredelArchivo) {
        for (int i = 0; i < Archivos.length; i++)
            if (NombredelArchivo.equals(Archivos[i]))
                return true;
        return false;
    }

    //metodo para el boton guardar

    public void Guardar(View Guardar){
        try{
            OutputStreamWriter datos = new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
            datos.write(et1.getText().toString());
            datos.flush();
            datos.close();
        }catch (IOException e){

        }
        Toast.makeText(this, "DATOS GUARDADOS CORRECTAMENTE", Toast.LENGTH_SHORT).show();
        finish();

    }
}