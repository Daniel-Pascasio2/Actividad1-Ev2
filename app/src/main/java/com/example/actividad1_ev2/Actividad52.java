package com.example.actividad1_ev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad52 extends AppCompatActivity {

    TextView txtRecibe, txtCant;
    ArrayList<String> paisesSeleccionados;
    ArrayList<String> CapSeleccionados;
    Button btnRegresar;
    String continente, Lugar, Sel;
    int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_actividad52);
        btnRegresar=findViewById(R.id.btnRegresar1);
        txtCant=findViewById(R.id.txtCant);

        txtRecibe= findViewById(R.id.txtRecibe);
        paisesSeleccionados=new ArrayList<String>();
        paisesSeleccionados=getIntent().getStringArrayListExtra("PAIS");
        CapSeleccionados=getIntent().getStringArrayListExtra("CAPITAL");
        continente=getIntent().getStringExtra("CONTINENTE");
        Lugar=getIntent().getStringExtra("LUGAR");



        for (int i=0;i<paisesSeleccionados.size();i++){
            txtRecibe.setText(txtRecibe.getText()+"\n"+paisesSeleccionados.get(i));
             j=i;
              txtRecibe.setText(txtRecibe.getText()+"\n"+"Capital: "+CapSeleccionados.get(i));



        }
        Sel=String.valueOf(j+1);
        txtCant.setText(Sel);



        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2=new Intent(Actividad52.this, Actividad41.class);
                intent2.putExtra("CONTINENTE",continente);
                intent2.putExtra("LUGAR",Lugar);
                startActivity(intent2);

            }
        });






    }


}