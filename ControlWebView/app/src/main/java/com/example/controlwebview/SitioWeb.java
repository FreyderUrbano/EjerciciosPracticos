package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class SitioWeb extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio_web);

        wv1 = (WebView)findViewById(R.id.vistaWeb);

        String URL = getIntent().getStringExtra("SitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://www." + URL + ".com");
    }

    //METODO PARA BOTON VOLVER

    public void Volver(View Volver){
        Intent Regresar = new Intent(this, MainActivity.class);
        startActivity(Regresar);
        //el siguiente codigo es para cerrar el segundo activity, al cerrarlo vuelve automaticamente al primer activity
        //finish();

    }
}