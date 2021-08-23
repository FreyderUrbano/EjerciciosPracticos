package com.example.controlwebview;

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

        et1 = (EditText)findViewById(R.id.webname);

    }

    //metodo para boton buscar

    public void Navegar(View Navegar){
        Intent Ir = new Intent(this, SitioWeb.class);
        Ir.putExtra("SitioWeb", et1.getText().toString());
        startActivity(Ir);
    }
}