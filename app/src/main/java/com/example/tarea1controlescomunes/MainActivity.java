package com.example.tarea1controlescomunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnenviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, DatosRecibidos.class);
        EditText txtid = (EditText)findViewById(R.id.txtid);
        EditText txtnombres = (EditText)findViewById(R.id.txtnombres);
        EditText txtfecha = (EditText)findViewById(R.id.txtfecha);
        EditText txtciudad = (EditText)findViewById(R.id.txtciudad);
        RadioButton rdbmasculino = (RadioButton) findViewById(R.id.rdbmasculino);
        RadioButton rdbfemenino = (RadioButton)findViewById(R.id.rdbfemenino);
        EditText txtcorreo = (EditText)findViewById(R.id.txtcorreo);
        EditText txttelefono = (EditText)findViewById(R.id.txttelefono);


        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();

        b.putString("ID", txtid.getText().toString());
        b.putString("NOMBRES", txtnombres.getText().toString());
        b.putString("FN", txtfecha.getText().toString());
        b.putString("CIUDAD", txtciudad.getText().toString());
        b.putString("MASCULINO", rdbmasculino.getText().toString());
        b.putString("FEMENINO", rdbfemenino.getText().toString());
        b.putString("CORREO", txtcorreo.getText().toString());
        b.putString("TELEFONO", txttelefono.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);

    }

}