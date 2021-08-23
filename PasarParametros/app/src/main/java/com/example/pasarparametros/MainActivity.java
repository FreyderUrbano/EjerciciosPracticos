package com.example.pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et_dato);
    }

    //METODO PARA EL BOTON ENVIAR

    public void Enviar(View Enviar){
        Intent pasar = new Intent(this,DatosGuardados.class);
        pasar.putExtra("datos", et1.getText().toString());
        startActivity(pasar);
    }
}