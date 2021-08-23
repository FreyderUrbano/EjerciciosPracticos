package com.example.basededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_codigo, et_nombre, et_precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_codigo = (EditText) findViewById(R.id.et_codigo);
        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_precio = (EditText) findViewById(R.id.et_precio);


    }

    //boton guardar

    public void Guardar(View Guardar) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase base = admin.getReadableDatabase();

        String codigo = et_codigo.getText().toString();
        String descripcion = et_nombre.getText().toString();
        String precio = et_precio.getText().toString();

        if (!codigo.isEmpty() && !descripcion.isEmpty() && !precio.isEmpty()) {
            ContentValues registro = new ContentValues();

            registro.put("codigo", codigo);
            registro.put("descripcion", descripcion);
            registro.put("precio", precio);

            base.insert("articulos", null, registro);
            base.close();
            et_codigo.setText("");
            et_nombre.setText("");
            et_precio.setText("");

            Toast.makeText(this, "REGISTO EXITOSO", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "LLENAR TODOS LOS DATOS", Toast.LENGTH_LONG).show();

        }
    }

    //metodo para el boton consultar

    public void Consultar(View Consultar) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if (!codigo.isEmpty()) {
            Cursor fila = base.rawQuery("select descripcion, precio from articulos where codigo =" + codigo ,null);

            if (fila.moveToFirst()) {
                et_nombre.setText(fila.getString(0));
                et_precio.setText(fila.getString(1));
                base.close();
            } else {
                Toast.makeText(this, "NO EXISTE EL PRODUCTO", Toast.LENGTH_LONG).show();
                base.close();
            }


        } else {
            Toast.makeText(this, "INTRODUCIR CODIGO DEL ARTICULO", Toast.LENGTH_LONG).show();
        }
    }

    //metodo para boton eliminar

    public void Eliminar(View Eleiminar){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null,1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();

        if (!codigo.isEmpty()){

            int cantidad = base.delete("articulos", "codigo=" + codigo, null );
            base.close();
            et_codigo.setText("");
            et_nombre.setText("");
            et_precio.setText("");

            if (cantidad == 1){
                Toast.makeText(this,"ARTICULO ELIMINADO CON EXITO",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"EL ARTICULO NO EXISTE",Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(this,"ingresar codigo",Toast.LENGTH_LONG).show();
        }

    }

    //metodo modificar

    public void Modificar(View Modificar){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null,1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String nombre = et_nombre.getText().toString();
        String precio = et_precio.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()){

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("descripcion",nombre);
            registro.put("precio",precio);

            int cantidad = base.update("articulos", registro, "codigo=" + codigo,null);
            base.close();

            if (cantidad == 1){
                Toast.makeText(this,"ARTICULO MODIFICADO EXITOSAMENTE",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"NO SE MODIFICO EL ARTICULO",Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this,"DEBE LLENAR TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show();
        }
    }
}