package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img1;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView)findViewById(R.id.foto);
        btn1 = (Button)findViewById(R.id.boton);
    }

    //metodo ocultar

    public void Ocultar(View Ocultar){
        btn1.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.VISIBLE);
    }
}