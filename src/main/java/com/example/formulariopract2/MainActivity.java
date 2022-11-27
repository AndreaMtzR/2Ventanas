package com.example.formulariopract2;
//PROGRAMA DE SALUDO POR: ANDREA MARTINEZ RUIZ 27/08/2022

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText pat, mat, nombre, colonia, cp, calle, estado, municipio;
    private TextView d1, d2, d3, d4, d5, d6, d7, d8;
    private Button bAceptar;
    private Button LIMPIAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bAceptar = (Button) findViewById(R.id.bAceptar);
        setContentView(R.layout.activity_main);
        pat = (EditText) findViewById(R.id.pat);
        mat = (EditText)findViewById(R.id.mat);
        nombre =(EditText) findViewById(R.id.nombre);
        colonia = (EditText)findViewById(R.id.colonia);
        cp = (EditText)findViewById(R.id.cp);
        calle =(EditText) findViewById(R.id.calle);
        estado = (EditText)findViewById(R.id.estado);
        municipio = (EditText)findViewById(R.id.municipio);
        d1 = (TextView)findViewById(R.id.d1);
        d2 =(TextView) findViewById(R.id.d2);
        d3 =(TextView) findViewById(R.id.d3);
        d4 = (TextView)findViewById(R.id.d4);
        d5 = (TextView)findViewById(R.id.d5);
        d6 = (TextView)findViewById(R.id.d6);
        d7 =(TextView) findViewById(R.id.d7);
        d8 = (TextView)findViewById(R.id.d8);
    }

    public void Aceptar(View view) {

        String m1 = "", m2 = "", m3 = "", m4 = "", m5 = "", m6 = "", m7 = "", m8 = "";
        m1 = pat.getText().toString();
        m2 = mat.getText().toString();
        m3 = nombre.getText().toString();
        m4 = colonia.getText().toString();
        m5 = cp.getText().toString();
        m6 = calle.getText().toString();
        m7 = estado.getText().toString();
        m8 = municipio.getText().toString();

        if (this.aceptar(m1)) {
            m1 = (m1);
            d1.setText(m1);
        } else
            d1.setText("ingresa apellido pat");

        if (this.aceptar(m2)) {
            m2 = (m2);
            d2.setText(m2);
        } else
            d2.setText("ingresa apellido mat");
        if (this.aceptar(m3)) {
            m3 = (m3);
            d3.setText(m3);
        } else
            d3.setText("ingresa nombre");
        if (this.aceptar(m4)) {
            m4 = (m4);
            d4.setText(m4);
        } else
            d4.setText("ingresa colonia");
        if (this.aceptar(m5)) {
            m5 = (m5);
            d5.setText(m5);
        } else
            d5.setText("ingresa cp");
        if (this.aceptar(m6)) {
            m6 = (m6);
            d6.setText(m6);
        } else
            d6.setText("ingresa calle");
        if (this.aceptar(m7)) {
            m7 = (m7);
            d7.setText(m7);
        } else
            d7.setText("ingresa estado");
        if (this.aceptar(m8)) {
            m8 = (m8);
            d8.setText(m8);
        } else
            d8.setText("ingresa municipio");
    }

    public boolean aceptar(String t){
        boolean regla=true;
        if(t.equals("")){
            regla = false;
        }
        return regla;
    }

    public void Limpiar(View view) {

        pat.setText(" ");
        mat.setText(" ");
        nombre.setText(" ");
        colonia.setText(" ");
        cp.setText(" ");
        calle.setText(" ");
        estado.setText(" ");
        municipio.setText(" ");
    }




    }
