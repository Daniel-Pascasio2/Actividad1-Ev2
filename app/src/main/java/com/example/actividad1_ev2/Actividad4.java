package com.example.actividad1_ev2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Actividad4 extends AppCompatActivity {
    private TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        txt1= findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        txt3= findViewById(R.id.txt3);

            //getIntent().getStringExtra(Nombre) obtiene los valores de Actividad3, los almaceno en n1,n2 y n3
            String n1 = getIntent().getStringExtra("CONTINENTE");
            String n2 = getIntent().getStringExtra("LUGAR");
            String n3 = getIntent().getStringExtra("OPCION");

            txt1.setText(n1);
            txt2.setText(n2);
            txt3.setText(n3);

    }
}