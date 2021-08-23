package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Mensaje1(View fotoUno){
        Toast.makeText(this, "FOTO BOTON NUMERO 1",Toast.LENGTH_SHORT).show();
    }
    public void Mensaje2(View fotoDos){
        Toast.makeText(this,"FOTO BOTON NUMERO DOS", Toast.LENGTH_SHORT).show();
    }
}