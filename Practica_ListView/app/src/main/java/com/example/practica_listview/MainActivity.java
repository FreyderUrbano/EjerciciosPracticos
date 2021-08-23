package com.example.practica_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"SAMUEL","VALERIA","CLARA","PACHO","LUCIANA","FREYDER","FABIO","FABIO RICARDO"};
    private String seleccion [] = {"4","13","65","33","1","37","34","66"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> lista = new ArrayAdapter<>(this , R.layout.list_item_nombres, nombres);
        lv1.setAdapter(lista);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText(" LA EDAD DE " + lv1.getItemAtPosition(position) + " ES: " + seleccion[position] + " AÑOS ");
            }
        });
    }

}