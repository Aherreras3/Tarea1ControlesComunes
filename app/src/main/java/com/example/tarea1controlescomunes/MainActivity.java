package com.example.tarea1controlescomunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rdbmasculino,rdbfemenino;
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
        if(view.getId()==R.id.btnenviar){
            validar();
        }
    }
    private void validar(){
        String selec="Seleccionado: \n";
        if(rdbmasculino.isChecked()==true){
            selec+="Opcion1\n";
        }
        if (rdbfemenino.isChecked()) {
            selec += "Opcion2\n";
        }
        Toast.makeText(getApplicationContext(),selec,Toast.LENGTH_SHORT).show();
    }
}