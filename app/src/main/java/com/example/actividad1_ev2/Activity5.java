package com.example.actividad1_ev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    private TextView txtPais,txtCapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        txtPais = findViewById(R.id.txtPais);
        txtCapital = findViewById(R.id.txtCapital);

        txtPais.setText(getIntent().getStringExtra("PAIS"));
        txtCapital.setText(getIntent().getStringExtra("CAPITAL"));
    }
}