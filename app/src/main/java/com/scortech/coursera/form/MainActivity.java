package com.scortech.coursera.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etTelefono, etEmail, etDescripcion;
    DatePicker dpFechaNacimiento;
    Button bAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);
        dpFechaNacimiento = (DatePicker) findViewById(R.id.dpFechaNacimiento);
        bAceptar = (Button) findViewById(R.id.bAceptar);


        int day = dpFechaNacimiento.getDayOfMonth();
        int month = dpFechaNacimiento.getMonth() + 1;
        int year = dpFechaNacimiento.getYear();


        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
        Date d = new Date(year, month, day);
        final String strDate = dateFormatter.format(d);

        bAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, confirmation.class);
                intent.putExtra("pNombre", etNombre.getText().toString());
                intent.putExtra("pTelefono", etTelefono.getText().toString());
                intent.putExtra("pEmail", etEmail.getText().toString());
                intent.putExtra("pDescripcion", etDescripcion.getText().toString());
                intent.putExtra("pFechaNacimiento", strDate);
                startActivity(intent);
            }
        });


    }
}
