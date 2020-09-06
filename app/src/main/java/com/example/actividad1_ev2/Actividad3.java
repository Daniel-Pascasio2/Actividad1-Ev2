package com.example.actividad1_ev2;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad3 extends AppCompatActivity {

    public String continente;
    public String Lugar;
    public String Sel;

    private Button btnAtrasA2,btnSiguienteA4;
    private RadioButton rbRios,rbLagos,rbVolcanes,rbRadioButton,rbCheckBox;
    private TextView txtContinente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actividad3);
            //Declaracion de variables
            btnAtrasA2 = findViewById(R.id.btnAtrasA2);
            btnSiguienteA4= findViewById(R.id.btnSiguienteA4);
            rbRios = findViewById(R.id.rbRios);
            rbLagos = findViewById(R.id.rbLagos);
            rbVolcanes = findViewById(R.id.rbVolcanes);
            rbRadioButton = findViewById(R.id.rbRadioButton);
            rbCheckBox = findViewById(R.id.rbCheckBox);
            txtContinente = findViewById(R.id.txtContinente);

            //getIntent().getStringExtra(Nombre) obtiene los valores de Actividad3, los almaceno en n1,n2 y n3
            String n1 = getIntent().getStringExtra("CONTINENTE");
            txtContinente.setText("Continente: "+n1);

            btnAtrasA2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Objeto intent para retornar al MainActivity (Aca modificar para que retorne al Activity2)
                    Intent i = new Intent(Actividad3.this, Actividad2.class);
                    startActivity(i);
                }

            });
            btnSiguienteA4.setOnClickListener(new View.OnClickListener() {
                //creo objeto para desplazarme a la activity4
                Intent c = new Intent(Actividad3.this, Actividad4.class);
                //variables booleanas que almacenaran si un rbLUGAR y rbOPCION se han seleccionado
                boolean xt=false;
                boolean yt=false;

                @Override

                public void onClick(View vas) {
                        //Los RadioBUtton de LUGARES
                        if(rbRios.isChecked()){
                            Lugar=rbRios.getText().toString();
                            xt=true;
                        }else if(rbLagos.isChecked()){
                            Lugar=rbLagos.getText().toString();
                            xt=true;
                        }else if(rbVolcanes.isChecked()){
                            Lugar=rbVolcanes.getText().toString();
                            xt=true;
                        }
                        //Los RadioButton de OPCIONES
                        if(rbRadioButton.isChecked()){
                            Sel=rbRadioButton.getText().toString();
                            yt=true;
                        }else if(rbCheckBox.isChecked()){
                            Sel=rbCheckBox.getText().toString();
                            yt=true;
                        }
                    //si algun rb LUGARES se selecciono, es true, sino muestra mensaje TOAST
                    if(xt==true){
                        //si algun rb OPCIONES se selecciono, es true, sino muestra mensaje TOAST
                        if(yt==true)
                        {
                            //llamo al objeto intent "c", y con putExtra(name,value), envio al otro Activity dichos datos
                            //En este caso son Continente,Lugar y Seleccion
                            continente=getIntent().getStringExtra("CONTINENTE");
                            c.putExtra("CONTINENTE",continente);
                            c.putExtra("LUGAR",Lugar);//
                            c.putExtra("OPCION",Sel);//Condicion
                            //Ahora iniciamos la proxima actividad declarada en "c"
                            startActivity(c);
                        }else{

                            Mensajes("Seleccione un tipo de GROUP");
                        }

                    }else
                    {
                        Mensajes("Seleccione un Lugar");
                    }
                }
            });


        }
        //Metodo para enviar mensajes TOAST
        public void Mensajes(String Mensaje)
        {
            String mnsj=Mensaje;

            final Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            mnsj, Toast.LENGTH_SHORT);
            toast1.show();
        }

}
