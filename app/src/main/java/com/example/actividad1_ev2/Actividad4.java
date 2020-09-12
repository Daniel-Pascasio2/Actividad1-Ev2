package com.example.actividad1_ev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {

   TextView txtCont, txtp1, txtSelectLugares;
   String nombreContinente,lugarSeleccionado;
   ListView lvlPais,lvlLugares;
   Button btnContinuar,btnRegresar;
   String rock,PaisSeleccionado,CapitalSeleccionado;
    ArrayAdapter adapter;

    ArrayList<Pais> listaContPais;
    ArrayList<String> listaC;

    ArrayList<String> Lugares;


    ArrayList<Paises2> llenarPaisesA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        txtCont=findViewById(R.id.txtConti);
        txtSelectLugares=findViewById(R.id.txtSelectLugares);
        lvlLugares=findViewById(R.id.lvlLugares);
        btnContinuar=findViewById(R.id.btnContinuar);
        btnRegresar=findViewById(R.id.btnRegresar);

        lvlPais=findViewById(R.id.lvlPaises);

        //Obtenemos el valor de el continente seleccionado
        String dato=getIntent().getStringExtra("CONTINENTE");
        txtCont.setText(dato);
        nombreContinente=dato;

        //Obtenemos el valor de el Radio o checkbox seleccionado
        rock=getIntent().getStringExtra("OPCION");
        lugarSeleccionado=getIntent().getStringExtra("LUGAR");
        txtSelectLugares.setText(lugarSeleccionado);



//Invocamos al new
        if(nombreContinente.equals("Europa")){

            llenarContinententeEuropa();

            if(lugarSeleccionado.equals("Volcanes")){
                llenarVolcanesEuropa();
            }
            if(lugarSeleccionado.equals("Lagos")){
                llenarLagosEuropa();
            }
            if(lugarSeleccionado.equals("Rios")){
                llenarRiosEuropa();

            }

        }

        if(nombreContinente.equals("Asia")){

            llenarContinententeAsia();

            if(lugarSeleccionado.equals("Volcanes")){
                llenarVolcanesAsia();
            }
            if(lugarSeleccionado.equals("Lagos")){
                llenarLagosAsia();
            }
            if(lugarSeleccionado.equals("Rios")){
                llenarRiosAsia();

            }


        }

        if(nombreContinente.equals("Africa")){

            llenarContinententeAfricano();


            if(lugarSeleccionado.equals("Volcanes")){
                llenarVolcanesAfrica();
            }
            if(lugarSeleccionado.equals("Lagos")){
                llenarLagosAfrica();
            }
            if(lugarSeleccionado.equals("Rios")){
                llenarRiosAfrica();

            }


        }

        if(nombreContinente.equals("Americano")){


            llenarContinententeAmericano(); //Nombres de los paises...
            if(lugarSeleccionado.equals("Volcanes")){
                llenarVolcanesAmericano();
            }
            if(lugarSeleccionado.equals("Lagos")){
                llenarLagosAmericano();
            }
            if(lugarSeleccionado.equals("Rios")){
                llenarRiosAmericano();

            }





        }

        if(nombreContinente.equals("Oceania")){

            llenarContinententeOceania();
            if(lugarSeleccionado.equals("Volcanes")){
                llenarVolcanesOceania();
            }
            if(lugarSeleccionado.equals("Lagos")){
                llenarLagosOceania();
            }
            if(lugarSeleccionado.equals("Rios")){
                llenarRiosOceania();

            }

        }


        listaC=new ArrayList<String>();
        for (int i=0;i<llenarPaisesA.size();i++) {
            listaC.add(llenarPaisesA.get(i).getnPais());
        }

      //  AdaptadorPaises adaptadorP=new AdaptadorPaises(this);
      //  lvlPais.setAdapter(adaptadorP);

        adapter=new ArrayAdapter(Actividad4.this,android.R.layout.simple_list_item_single_choice,listaC);
        lvlPais.setAdapter(adapter);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Lugares);
        lvlLugares.setAdapter(adapter);

        lvlPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                PaisSeleccionado=llenarPaisesA.get(i).getnPais();
                CapitalSeleccionado=llenarPaisesA.get(i).getnCapital();

            }
        });








         btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent=new Intent(Actividad4.this, Activity5.class);
                intent.putExtra("PAIS", PaisSeleccionado);
                intent.putExtra("CAPITAL", CapitalSeleccionado);
                intent.putExtra("CONTINENTE",nombreContinente);
                intent.putExtra("LUGAR",lugarSeleccionado);

                startActivity(intent);

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actividad4.this, Actividad3.class);
                intent.putExtra("CONTINENTE",nombreContinente);
                startActivity(intent);
            }
        });





    } //Fin Oncreate

    private void llenarRiosOceania() {
        Lugares= new ArrayList<String>();
        Lugares.add("Rio Murray");//1
        Lugares.add("Rio Darling");//2
        Lugares.add("Rio Waikato");//3
        Lugares.add("Rio Clutha");//4


    }

    private void llenarVolcanesOceania() {
        Lugares= new ArrayList<String>();
        Lugares.add("Volcan Ruapehu");//1
        Lugares.add("Volcan Monte Tarawera");//2
        Lugares.add("Volcan Monte Veve");//3
        Lugares.add("Volcan Agrihan");//4

    }

    private void llenarLagosOceania() {
        Lugares= new ArrayList<String>();
        Lugares.add("Lago Torrens");//1
        Lugares.add("Lago Mackay");//2
        Lugares.add("Lago Frome");//3
        Lugares.add("Lago Gaidner");//4

    }

    private void llenarRiosAmericano() {
        Lugares= new ArrayList<String>();
        Lugares.add("Rio Misisipi");//1
        Lugares.add("Rio Amazonas");//2
        Lugares.add("Rio Grande");//3
        Lugares.add("Rio Bravo");//4


    }

    private void llenarVolcanesAmericano() {
        Lugares= new ArrayList<String>();
        Lugares.add("Volcan Colima");//1
        Lugares.add("Volcan Santa Maria");//2
        Lugares.add("Volcan Misti");//3
        Lugares.add("Volcan Popocatepetl");//4
    }

    private void llenarLagosAmericano() {

        Lugares= new ArrayList<String>();
        Lugares.add("Lago Superior");//1
        Lugares.add("Lago Ontario");//2
        Lugares.add("Lago Michigan");//3
        Lugares.add("Lago Maracaibo");//4


    }

    private void llenarRiosAfrica() {

        Lugares= new ArrayList<String>();
        Lugares.add("Rio Nilo");//1
        Lugares.add("Rio Congo");//2
        Lugares.add("Rio Zenegal");//3
        Lugares.add("Rio Niger");//4


    }

    private void llenarLagosAfrica() {

        Lugares= new ArrayList<String>();
        Lugares.add("Lago Bangweulu");//1
        Lugares.add("Lago Victoria");//2
        Lugares.add("Lago Tanganica");//3
        Lugares.add("Lago Malaui");//4

    }

    private void llenarVolcanesAfrica() {

        Lugares= new ArrayList<String>();
        Lugares.add("Volcan Kilimanjaro");//1
        Lugares.add("Volcan Monte Camerun");//2
        Lugares.add("Volcan Eni Koussi");//3
        Lugares.add("Volcan Monte Camerun");//4


    }

    private void llenarLagosAsia() {

        Lugares= new ArrayList<String>();
        Lugares.add("Lago Baikal");//1
        Lugares.add("Lago Baljash");//2
        Lugares.add("Lago Kara Bogaz Gol");//3
        Lugares.add("Lago Caspio");//4

    }

    private void llenarVolcanesAsia() {

        Lugares= new ArrayList<String>();
        Lugares.add("Volcan Merapi");//1
        Lugares.add("Volcan Damavand");//2
        Lugares.add("Volcan Monte Apo");//3
        Lugares.add("Volcan Monte Fuji");//4


    }

    private void llenarRiosAsia() {

        Lugares= new ArrayList<String>();
        Lugares.add("Rio Indu");//1
        Lugares.add("Rio Amur");//2
        Lugares.add("Rio Ganges");//3
        Lugares.add("Rio Obi");//4

    }

    private void llenarRiosEuropa() {

        Lugares= new ArrayList<String>();
        Lugares.add("Rio Sena");//1
        Lugares.add("Rio Volga");//2
        Lugares.add("Rio Danubio");//3
        Lugares.add("Rio Tamesis");//4

    }

    private void llenarLagosEuropa() {
        Lugares= new ArrayList<String>();
        Lugares.add("Lago Ladoga");//1
        Lugares.add("Lago Onega");//2
        Lugares.add("Lago Peipus");//3
        Lugares.add("Lago Simaa");//4

    }

    private void llenarVolcanesEuropa() {

        Lugares= new ArrayList<String>();
        Lugares.add("Volcan Vesubio");//1
        Lugares.add("Volcan Hekla");//2
        Lugares.add("Volcan Etna");//3
        Lugares.add("Volcan Solfatara");//4

    }


    //Metodos para llenar arreglos


    public void llenarContinententeAmericano(){

        //Creamos el objeto
        llenarPaisesA= new ArrayList<Paises2>();
        //llenamos el arraylist con objetos de la clase Continentes
        llenarPaisesA.add(new Paises2("Canada", "Ottawa"));//1
        llenarPaisesA.add(new Paises2("Argentina", "Buenos Aires"));//2
        llenarPaisesA.add(new Paises2("Brasil", "Brazilia" ));//3
        llenarPaisesA.add(new Paises2("El Salvador", "San Salvador"));//4
        llenarPaisesA.add(new Paises2("Mexico", "Mexico DF"));//5
        llenarPaisesA.add(new Paises2("Chile","Santiago de Chile"));//6
        llenarPaisesA.add(new Paises2("Belice","Belmopan"));//7

    }


    public void llenarContinententeAfricano(){



        //Creamos el objeto
        llenarPaisesA= new ArrayList<Paises2>();
        //llenamos el arraylist con objetos de la clase Continentes
        llenarPaisesA.add(new Paises2("Angola", "Luanda"));//1
        llenarPaisesA.add(new Paises2("Argelia", "Argel"));//1
        llenarPaisesA.add(new Paises2("Egipto", "El Cairo"));//1
        llenarPaisesA.add(new Paises2("Benin", "Porto Novo"));//1
        llenarPaisesA.add(new Paises2("Congo", "Brazzaville"));//5
        llenarPaisesA.add(new Paises2("Ghana", "Accra"));//5
        llenarPaisesA.add(new Paises2("Camerún", "Libreville"));//5


    }


    public void llenarContinententeEuropa(){

        //Creamos el objeto
        llenarPaisesA= new ArrayList<Paises2>();
        //llenamos el arraylist con objetos de la clase Continentes
        llenarPaisesA.add(new Paises2("Alemania", "Berlin"));//1
        llenarPaisesA.add(new Paises2("Belgica", "Bruselas"));//1
        llenarPaisesA.add(new Paises2("Bulgaria", "Sofia"));//1
        llenarPaisesA.add(new Paises2("Croacia", "Zagreb"));//1
        llenarPaisesA.add(new Paises2("Dinamarca", "Copenhague"));//1
        llenarPaisesA.add(new Paises2("Eslovenia", "Liubliana"));//1
        llenarPaisesA.add(new Paises2("España", "Madrid"));//1


    }


    public void llenarContinententeOceania(){

        //Creamos el objeto
        llenarPaisesA= new ArrayList<Paises2>();
        //llenamos el arraylist con objetos de la clase Continentes
        llenarPaisesA.add(new Paises2("Australia", "Canberra"));//1
        llenarPaisesA.add(new Paises2("Kiribati", "Bairiki"));//1
        llenarPaisesA.add(new Paises2("Nauru", "Yaren"));//1
        llenarPaisesA.add(new Paises2("Palau", "Koror"));//1
        llenarPaisesA.add(new Paises2("Samoa", "Apia"));//1
        llenarPaisesA.add(new Paises2("Tonga", "Nukualofa"));//1
        llenarPaisesA.add(new Paises2("Tuvalu", "Fongafale"));//1


    }

    public void llenarContinententeAsia(){

        //Creamos el objeto
        llenarPaisesA= new ArrayList<Paises2>();
        //llenamos el arraylist con objetos de la clase Continentes
        llenarPaisesA.add(new Paises2("Armenia", "Erevan"));//1
        llenarPaisesA.add(new Paises2("Camboya", "Phnom Penh"));//1
        llenarPaisesA.add(new Paises2("China", "Pekin"));//1
        llenarPaisesA.add(new Paises2("India", "Nueva Delhi"));//1
        llenarPaisesA.add(new Paises2("Irak", "Bagdad"));//1
        llenarPaisesA.add(new Paises2("Israel", "Jerusalen"));//1
        llenarPaisesA.add(new Paises2("Japon", "Tokio"));//1


    }


    //Finalizacion metodos llenado



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

            TextView txtNom=item.findViewById(R.id.txtNom);
            //Mostramos la informacion de cada elemento dependiendo de su posicion
            txtNom.setText(listaContPais.get(position).getnPais());


            return (item);
        }
    }






}