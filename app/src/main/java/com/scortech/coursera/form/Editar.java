package com.scortech.coursera.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Editar extends AppCompatActivity {

    EditText etNombre, etTelefono, etEmail, etDescripcion;
    DatePicker dpFechaNacimiento;
    Button bAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);
        dpFechaNacimiento = (DatePicker) findViewById(R.id.dpFechaNacimiento);
        bAceptar = (Button) findViewById(R.id.bAceptar);


        etNombre.setText(getIntent().getExtras().getString("pNombre"));
        etTelefono.setText(getIntent().getExtras().getString("pTelefono"));
        etEmail.setText(getIntent().getExtras().getString("pEmail"));
        etDescripcion.setText(getIntent().getExtras().getString("pDescripcion"));

        bAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
