package com.example.actividad1_ev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    private TextView txtPais,txtCapital;
    Button btnRegresar;
    String Lugar,continente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        txtPais = findViewById(R.id.txtPais);
        txtCapital = findViewById(R.id.txtCapital);
        btnRegresar=findViewById(R.id.btnRegresar1);

        continente=getIntent().getStringExtra("CONTINENTE");
        txtPais.setText(getIntent().getStringExtra("PAIS"));
        txtCapital.setText(getIntent().getStringExtra("CAPITAL"));
        Lugar=getIntent().getStringExtra("LUGAR");

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2=new Intent(Activity5.this, Actividad4.class);
                intent2.putExtra("CONTINENTE",continente);
                intent2.putExtra("LUGAR",Lugar);
                startActivity(intent2);

            }
        });
    }
}