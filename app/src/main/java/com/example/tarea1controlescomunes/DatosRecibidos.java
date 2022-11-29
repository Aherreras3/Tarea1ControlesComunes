package com.example.tarea1controlescomunes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DatosRecibidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_recibidos);
        TextView lblsaludo = (TextView) findViewById(R.id.lblsaludo);
        TextView lblsaludo2 = (TextView) findViewById(R.id.lblsaludo2);
        TextView lblsaludo3 = (TextView) findViewById(R.id.lblsaludo3);
        TextView lblsaludo4 = (TextView) findViewById(R.id.lblsaludo4);
        TextView lblsaludo5 = (TextView) findViewById(R.id.lblsaludo5);
        TextView lblsaludo6 = (TextView) findViewById(R.id.lblsaludo6);
        TextView lblsaludo7 = (TextView) findViewById(R.id.lblsaludo7);
        TextView lblsaludo8 = (TextView) findViewById(R.id.lblsaludo8);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

//Construimos el mensaje a mostrar
        lblsaludo.setText(" Cedula \n " + bundle.getString("ID"));
        lblsaludo2.setText(" Nombres \n " + bundle.getString("NOMBRES"));
        lblsaludo3.setText(" Fecha \n " + bundle.getString("FN"));
        lblsaludo4.setText(" Ciudad \n " + bundle.getString("CIUDAD"));
        lblsaludo5.setText(" Género \n " + bundle.getString("MASCULINO"));
        lblsaludo6.setText(" Género \n " + bundle.getString("FEMENINO"));
        lblsaludo7.setText(" Correo \n " + bundle.getString("CORREO"));
        lblsaludo8.setText(" Telefono \n " + bundle.getString("TELEFONO"));
    }

}