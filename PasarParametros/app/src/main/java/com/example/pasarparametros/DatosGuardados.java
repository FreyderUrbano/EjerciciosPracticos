package com.example.pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DatosGuardados extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_guardados);

        tv1 = (TextView)findViewById(R.id.tv_datos);

        String datos_nuevos = getIntent().getStringExtra("datos");
        tv1.setText("HOLA " + datos_nuevos);
    }

    //metodo para el boton regresar

    public void Regresar(View Regresar){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}