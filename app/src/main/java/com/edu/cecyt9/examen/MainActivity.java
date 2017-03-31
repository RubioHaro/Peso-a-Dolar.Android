package com.edu.cecyt9.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Number;
    Double Result;
    Double Number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number = (EditText) findViewById(R.id.Number);
    }

    public void Convertir(View v){
        if(Number.getText().toString().equals("")){
            Toast toast =  Toast.makeText(getApplicationContext(), "No se detecto numero", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent send = new Intent(this, Datos.class);
            Bundle data = new Bundle();
            Number2 = Double.parseDouble(Number.getText().toString());
            Result = (Number2 / 15);
            data.putDouble("Numero", Result);
            send.putExtras(data);
            finish();
            startActivity(send);
        }
    }
}
