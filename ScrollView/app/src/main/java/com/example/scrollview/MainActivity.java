package com.example.scrollview;

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
    public void Seleccion(View Frutas){
        switch (Frutas.getId()){
            case R.id.btn_pera:
                Toast.makeText(this, "PERAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_piña:
                Toast.makeText(this, "PIÑAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_naranja:
                Toast.makeText(this, "NARANJAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_mandarina:
                Toast.makeText(this, "MANDARINAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_manzana:
                Toast.makeText(this, "MANZANAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_mango:
                Toast.makeText(this, "MANGOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_kiwi:
                Toast.makeText(this, "KIWIS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_fresa:
                Toast.makeText(this, "FRESAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_frambuesa:
                Toast.makeText(this, "FRAMBUESAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_cereza:
                Toast.makeText(this, "CEREZAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_banana:
                Toast.makeText(this, "BANANAS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_uvas:
                Toast.makeText(this, "UVAS", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}