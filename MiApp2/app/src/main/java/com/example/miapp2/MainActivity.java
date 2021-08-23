package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText)findViewById(R.id.nota2);
        nota3 = (EditText)findViewById(R.id.nota3);
        resultado = (TextView)findViewById(R.id.resultado);
    }

    public void evaluacion (View view){
        String Fisica_String = nota1.getText().toString();
        String Quimica_String = nota2.getText().toString();
        String Mate_String = nota3.getText().toString();

        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);
        int Mate_int = Integer.parseInt(Mate_String);

        int promedio = (Fisica_int + Quimica_int + Mate_int)/3;

        if (promedio >= 4){
            resultado.setText("EL ALUMNO APROBO CON :" + promedio);
        }else if(promedio < 3){
            resultado.setText("EL ALUMNO REPROBO CON :" + promedio);
        }
    }
}