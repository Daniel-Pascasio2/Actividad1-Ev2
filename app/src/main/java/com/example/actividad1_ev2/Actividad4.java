package com.example.actividad1_ev2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {

    String lugar, dato;
    TextView txtCont, txtSeleccion, txtLugar;
    String nombreContinente;
    ListView lvlPais;
    String rock;

    ArrayList<Pais> listaContPais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);




            //getIntent().getStringExtra(Nombre) obtiene los valores de Actividad3, los almaceno en n1,n2 y n3



        txtCont=findViewById(R.id.txtConti);
        txtSeleccion= findViewById(R.id.txtSeleccion);
        txtLugar=findViewById(R.id.txtLugar);
        lvlPais=findViewById(R.id.lvlPaises);

        //Obtenemos el valor de el continente seleccionado
        dato=getIntent().getStringExtra("CONTINENTE");
        txtCont.setText(dato);
        nombreContinente=txtCont.getText().toString();

        //Obtenemos el valor de el Radio o checkbox seleccionado
        rock=getIntent().getStringExtra("OPCION");
        lugar = getIntent().getStringExtra("LUGAR");




        if(nombreContinente.equals("Europa")){
            txtLugar.setText(lugar);
            txtSeleccion.setText(rock);
            llenarContinententeEuropa();

        }

        if(nombreContinente.equals("Asia")){
            txtLugar.setText(lugar);
            txtSeleccion.setText(rock);
            llenarContinententeAsia();

        }

        if(nombreContinente.equals("Africa")){
            txtLugar.setText(lugar);
            txtSeleccion.setText(rock);
            llenarContinententeAfricano();

        }

        if(nombreContinente.equals("America")){

            txtSeleccion.setText(rock);
            txtLugar.setText(lugar);
            llenarContinententeAmericano();

        }

        if(nombreContinente.equals("Oceania")){
            txtLugar.setText(lugar);
            txtSeleccion.setText(rock);
            llenarContinententeOceania();

        }

        AdaptadorPaises adaptadorP=new AdaptadorPaises(this);
        lvlPais.setAdapter(adaptadorP);





    }

    public void llenarContinententeOceania(){

    }

    public void llenarContinententeAmericano(){

        //Creamos el objeto
        listaContPais=new ArrayList<Pais>();

        //llenamos el arraylist con objetos de la clase Continentes
        listaContPais.add(new Pais("America", "Canada"));
        listaContPais.add(new Pais("America", "Argentina"));
        listaContPais.add(new Pais("America", "Brasil"));
        listaContPais.add(new Pais("America", "El Salvador"));
        listaContPais.add(new Pais("America", "Mexico"));
        listaContPais.add(new Pais("America", "Chile"));
        listaContPais.add(new Pais("America", "Belice"));


    }

    public void llenarContinententeAfricano(){

        //Creamos el objeto
        listaContPais=new ArrayList<Pais>();

        //llenamos el arraylist con objetos de la clase Continentes
        listaContPais.add(new Pais("Americano", "Canada"));
        listaContPais.add(new Pais("Americano", "Argentina"));
        listaContPais.add(new Pais("Americano", "Brasil"));
        listaContPais.add(new Pais("Americano", "El Salvador"));
        listaContPais.add(new Pais("Americano", "Mexico"));
        listaContPais.add(new Pais("Americano", "Chile"));
        listaContPais.add(new Pais("Americano", "Belice"));

    }

    public void llenarContinententeAsia(){

    }

    public void llenarContinententeEuropa(){

        //Creamos el objeto
        listaContPais=new ArrayList<Pais>();

        //llenamos el arraylist con objetos de la clase Continentes
        listaContPais.add(new Pais("Europa", "Alemania"));
        listaContPais.add(new Pais("Europa", "Belgica"));
        listaContPais.add(new Pais("Europa", "Bulgaria"));
        listaContPais.add(new Pais("Europa", "Croacia"));
        listaContPais.add(new Pais("Europa", "Dinamarca"));
        listaContPais.add(new Pais("Europa", "Eslovenia"));
        listaContPais.add(new Pais("Europa", "España"));


    }



    //Creamos una clase y heredamos de la clase ArrayAdapter para llenar el listView con los componentes View de xmlContinente
    class AdaptadorPaises extends ArrayAdapter<Pais>{
        AppCompatActivity appCompatActivity;

        //Creamos un constructor y usamos super para poder acceder a los elementos de la clase ArrayAdapter
        AdaptadorPaises(AppCompatActivity context){
            super(context, R.layout.xmlpaisesc, listaContPais);
            appCompatActivity=context;
        }

        //Creamos un metodo de tipo View para poder generara los componentes en el ListView


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=appCompatActivity.getLayoutInflater();
            View item=inflater.inflate(R.layout.xmlpaisesc, null);

            TextView txtNom=item.findViewById(R.id.txtNomContinen);
            //Mostramos la informacion de cada elemento dependiendo de su posicion
            txtNom.setText(listaContPais.get(position).getnPais());


          /*
            RadioButton radios=item.findViewById(R.id.rdbPaisX);
           if(rock.equals("Checkbox")){

            }

            if(rock.equals("radios")){
                RadioButton radio=item.findViewById(R.id.rdbPaisX);
                radio.setText(listaContPais.get(position).getnContinente());


            }

             ImageView imagenCon=item.findViewById(R.id.imagenCont);

          if(listaContPais.get(position).getImagenC()=="Americano"){
                imagenCon.setImageResource(R.mipmap.america);
            }

            if(listaContPais.get(position).getImagenC()=="Europa"){
                imagenCon.setImageResource(R.mipmap.europa);
            }

            if(listaContPais.get(position).getImagenC()=="Asia"){
                imagenCon.setImageResource(R.mipmap.asia);
            }

            if(listaContPais.get(position).getImagenC()=="Africa"){
                imagenCon.setImageResource(R.mipmap.africa);
            }

            if(listaContPais.get(position).getImagenC()=="Oceania"){
                imagenCon.setImageResource(R.mipmap.oceania);
            } */



            return (item);
        }
    }



}