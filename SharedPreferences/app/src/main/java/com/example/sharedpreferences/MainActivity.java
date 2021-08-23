package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_SP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_SP = (EditText)findViewById(R.id.SP_a);

        SharedPreferences prefencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et_SP.setText(prefencias.getString("mail", ""));


    }

    //metodo para el boton GUARDAR PREFERENCIAS

    public void Guardar(View Guardar){
        SharedPreferences NuevosDatos = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor DatosGuardados = NuevosDatos.edit();
        DatosGuardados.putString("mail", et_SP.getText().toString());
        DatosGuardados.commit();
        finish();
    }
}