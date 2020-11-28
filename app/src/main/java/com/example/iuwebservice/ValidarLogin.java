package com.example.iuwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.iuwebservice.WebService.Asynchtask;
import com.example.iuwebservice.WebService.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class ValidarLogin extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar_login);

        Bundle bundle = this.getIntent().getExtras();

        Map<String,String> datos = new HashMap<String, String>();
        WebService ws = new WebService("https://api.androidhive.info/contacts/"
                                        + bundle.getString("name")+"&pass"+ bundle.getString("pass"),
                                        datos, ValidarLogin.this, ValidarLogin.this);
        ws.execute("GET");
    }
    @Override
    public void processFinish(String result) throws JSONException{
        TextView txtSaludo =(TextView)findViewById(R.id.lbmensaje);
        txtSaludo.setText("Respuesta WS:" +result);
    }
}