package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.nombre);
        et2 = (EditText)findViewById(R.id.password);

    }

    public void Guardar(View Guardar){

        String texto_uno = et1.getText().toString();
        String texto_dos = et2.getText().toString();

        if (texto_uno.length() == 0){
            Toast.makeText(this, "INGRESAR NOMBRE",Toast.LENGTH_LONG).show();
        }
        if (texto_dos.length() == 0){
            Toast.makeText(this, "INGRESAR PASSWORD",Toast.LENGTH_LONG).show();
        }

        if (texto_uno.length() != 0 && texto_dos.length() != 0){
            Toast.makeText(this, "DATOS GUARDADOS CORRECTAMENTE",Toast.LENGTH_LONG).show();
        }
    }
}