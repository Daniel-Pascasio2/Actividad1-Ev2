package com.example.actividad1_ev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {
    private String continente;
    private ListView lvListaContinentes;
    private Button btnRegresar;
    //referenciamos la clase que creamos
    private ArrayList<csContinente> listacontinentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        btnRegresar=findViewById(R.id.btnRegresar);
        //creando el arreglo
        ValoresListaContinentes();

        AdaptadorContinentes adaptador = new AdaptadorContinentes(this);
        final ListView lv1 = (ListView)findViewById(R.id.lvListaContinentes);
        lv1.setAdapter(adaptador);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Actividad2.this ,listacontinentes.get(i).getNombreContinente(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Actividad2.this, Actividad3.class);
                continente=listacontinentes.get(i).getNombreContinente();
                intent.putExtra("CONTINENTE", continente);
                startActivity(intent);
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Actividad2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void ValoresListaContinentes(){
        listacontinentes=new ArrayList<csContinente>();
        listacontinentes.add(new csContinente("America",'A'));
        listacontinentes.add(new csContinente("Europa",'B'));
        listacontinentes.add(new csContinente("Asia",'C'));
        listacontinentes.add(new csContinente("Africa",'D'));
        listacontinentes.add(new csContinente("Oceania",'E'));
    }

    class AdaptadorContinentes extends ArrayAdapter<csContinente> {
        AppCompatActivity appCompatActivity;

        AdaptadorContinentes(AppCompatActivity context){
            super(context, R.layout.continente, listacontinentes);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.continente, null);

            TextView textView1 = (TextView)item.findViewById(R.id.txtNombreContinente);
            textView1.setText(listacontinentes.get(position).getNombreContinente());

            ImageView imageView2 = (ImageView)item.findViewById(R.id.imgContinente);
            if (listacontinentes.get(position).getCon()=='A')
                imageView2.setImageResource(R.mipmap.america);
            if (listacontinentes.get(position).getCon()=='B')
                imageView2.setImageResource(R.mipmap.europa);
            if (listacontinentes.get(position).getCon()=='C')
                imageView2.setImageResource(R.mipmap.asia);
            if (listacontinentes.get(position).getCon()=='D')
                imageView2.setImageResource(R.mipmap.africa);
            if (listacontinentes.get(position).getCon()=='E')
                imageView2.setImageResource(R.mipmap.australia);
            return(item);
        }
    }
}