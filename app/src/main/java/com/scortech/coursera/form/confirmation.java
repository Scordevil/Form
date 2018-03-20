package com.scortech.coursera.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmation extends AppCompatActivity {

    TextView tvNombre, tvTelefono, tvEmail, tvDescripcion, tvNacimiento;
    Button bEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        tvNacimiento = (TextView) findViewById(R.id.tvNacimiento);

        tvNombre.setText("Nombre: "+getIntent().getExtras().getString("pNombre"));
        tvTelefono.setText("Telefono: "+getIntent().getExtras().getString("pTelefono"));
        tvEmail.setText("Email: "+getIntent().getExtras().getString("pEmail"));
        tvDescripcion.setText("Descripcion: "+getIntent().getExtras().getString("pDescripcion"));
        tvNacimiento.setText("Nacimiento: "+getIntent().getExtras().getString("pFechaNacimiento"));

        bEditar = (Button) findViewById(R.id.bEditar);

        bEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirmation.this, Editar.class);
                intent.putExtra("pNombre", tvNombre.getText().toString());
                intent.putExtra("pTelefono", tvTelefono.getText().toString());
                intent.putExtra("pEmail", tvEmail.getText().toString());
                intent.putExtra("pDescripcion", tvDescripcion.getText().toString());
                startActivity(intent);
            }
        });
    }
}
