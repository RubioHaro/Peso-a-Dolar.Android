package com.edu.cecyt9.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Datos extends AppCompatActivity {

    Double NumeroRec;
    TextView Muestrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Muestrame = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        NumeroRec = recibe.getDouble("Numero");
        Muestrame.setText("Nombre: Rubio Haro Rodrigo ;) (Roy)" + "\n" +
                "Resultado: " + NumeroRec.toString()
        );
    }

    public void Correo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Resultado del Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Nombre: Rubio Haro Rodrigo ;) (Roy)    Resultado: " + NumeroRec );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "chavo002009@gmail.com"} );
        startActivity(intent);
    }
}
