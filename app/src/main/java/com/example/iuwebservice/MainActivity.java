package com.example.iuwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviar(View view){
        Intent intent = new Intent(MainActivity.this,ValidarLogin.class);
        EditText txtNombre=(EditText)findViewById(R.id.txtNombre);
        EditText txtPass=(EditText)findViewById(R.id.PsContrasena);
        Bundle b = new Bundle();
        b.putString("usuario",txtNombre.getText().toString());;
        b.putString("pass",txtNombre.getText().toString());;
        intent.putExtras(b);
        startActivity(intent);
    }
}