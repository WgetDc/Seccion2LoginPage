package com.example.seccion2loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "ingcorellana@gmail.com";
    String clave = "carlos123";
    EditText edtMain_email;
    EditText edtMain_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Oculta la ActionBar
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        edtMain_email = (EditText) findViewById(R.id.edtMain_email);
        edtMain_password = findViewById(R.id.edtMain_password);

    }

    public void goToHomePage(View view){
        if(correo.equals(edtMain_email.getText().toString()) && clave.equals(edtMain_password.getText().toString())){
            Intent activity = new Intent(this, homeActivity.class);
            startActivity(activity);
            Toast.makeText(this, "Bienvenido " + edtMain_email.getText().toString(), Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
        /*
        Ejemplo de como controlar y obtener lo que el usuario ingresa en c/u de los edt
        String getCorreo = edtMain_email.getText().toString();
        String getClave = edtMain_password.getText().toString();
        Toast.makeText(this, "El correo es: "+ getCorreo, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "La clave es: " + getClave, Toast.LENGTH_SHORT).show();
        */
    }



}