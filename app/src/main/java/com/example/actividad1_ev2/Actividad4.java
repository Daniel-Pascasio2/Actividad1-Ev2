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
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {

    String lugar, dato, lugar1;
    Button btnAtrasA4,btnContinuarA5;
    RadioGroup rgButtons;
    RadioButton rbPais1,rbPais2,rbPais3,rbPais4,rbPais5,rbPais6,rbPais7;
    TextView txtCont, txtSeleccion,txtE, txtSelectLugares;
    String nombreContinente;
    //ListView listaPaises;
    String rock,capitala,paisa;
    ListView lvlLugares1;


    ArrayList<String> paisesAmerica = new ArrayList<String>(7);
    ArrayList<String> paisesAsia = new ArrayList<String>(7);
    ArrayList<String> paisesOceania = new ArrayList<String>(7);
    ArrayList<String> paisesAfrica = new ArrayList<String>(7);
    ArrayList<String> paisesEuropa = new ArrayList<String>(7);

    ArrayList<String> capitalesAmerica = new ArrayList<String>(7);
    ArrayList<String> capitalesAsia = new ArrayList<String>(7);
    ArrayList<String> capitalesOceania = new ArrayList<String>(7);
    ArrayList<String> capitalesAfrica = new ArrayList<String>(7);
    ArrayList<String> capitalesEuropa = new ArrayList<String>(7);

    ArrayList<String> Lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        txtSelectLugares=findViewById(R.id.txtSelectLugares);
        lvlLugares1=findViewById(R.id.lvlLugaresc);

        txtCont = findViewById(R.id.txtConti);
        //txtSeleccion = findViewById(R.id.txtSeleccion);
        txtE = findViewById(R.id.txtE);

        rbPais1 = findViewById(R.id.rbPais1);
        rbPais2 = findViewById(R.id.rbPais2);
        rbPais3 = findViewById(R.id.rbPais3);
        rbPais4 = findViewById(R.id.rbPais4);
        rbPais5 = findViewById(R.id.rbPais5);
        rbPais6 = findViewById(R.id.rbPais6);
        rbPais7 = findViewById(R.id.rbPais7);
        btnAtrasA4 = findViewById(R.id.btnAtrasA4);
        btnContinuarA5 = findViewById(R.id.btnContinuarA5);
        //listaPaises = findViewById(R.id.listaPaises);
        final Intent i = new Intent(Actividad4.this, Actividad3.class);
        dato = getIntent().getStringExtra("CONTINENTE");
        txtCont.setText(dato);
        nombreContinente = txtCont.getText().toString();


        //Obtenemos el valor de el Radio o checkbox seleccionado
        rock = getIntent().getStringExtra("OPCION");
        lugar = getIntent().getStringExtra("LUGAR"); //Condicion en base esto
        lugar1=getIntent().getStringExtra("LUGAR");
        txtSelectLugares.setText(lugar1);

        if(dato.equals("Europa")){
            if(lugar.equals("Volcanes")){
                llenarVolcanesEuropa();
            }
            if(lugar.equals("Lagos")){
                llenarLagosEuropa();
            }
            if(lugar.equals("Rios")){
                llenarRiosEuropa();

            }



        }

        if(dato.equals("Asia")){

            //Validacion de los lugares

            if(lugar.equals("Volcanes")){
                llenarVolcanesAsia();
            }
            if(lugar.equals("Lagos")){
                llenarLagosAsia();
            }
            if(lugar.equals("Rios")){
                llenarRiosAsia();

            }


        }

        if(dato.equals("Africa")){

            if(lugar.equals("Volcanes")){
                llenarVolcanesAfrica();
            }
            if(lugar.equals("Lagos")){
                llenarLagosAfrica();
            }
            if(lugar.equals("Rios")){
                llenarRiosAfrica();

            }



        }

        if(dato.equals("America")){

            if(lugar.equals("Volcanes")){
                llenarVolcanesAmericano();
            }
            if(lugar.equals("Lagos")){
                llenarLagosAmericano();
            }
            if(lugar.equals("Rios")){
                llenarRiosAmericano();

            }

        }


        if(dato.equals("Oceania")){

            if(lugar.equals("Volcanes")){
                llenarVolcanesOceania();
            }
            if(lugar.equals("Lagos")){
                llenarLagosOceania();
            }
            if(lugar.equals("Rios")){
                llenarRiosOceania();

            }



        }

        //Creando objeto de el RadioGroup
        final RadioGroup ListadoRB = (RadioGroup)findViewById(R.id.rgButtons);
        i.putExtra("CONTINENTE",dato);
        llenarContinententeAmericano();
            llenarCapitalesAmericano();

        llenarContinententeAfricano();
              llenarCapitalesAfrica();

        llenarContinententeEuropa();
            llenarCapitalesEuropa();

        llenarContinententeOceania();
            llenarCapitalesOceania();

        llenarContinententeAsia();
            llenarCapitalesAsia();



        switch (dato){

            case "America":

                rbPais1.setText(paisesAmerica.get(0));
                rbPais2.setText(paisesAmerica.get(1));
                rbPais3.setText(paisesAmerica.get(2));
                rbPais4.setText(paisesAmerica.get(3));
                rbPais5.setText(paisesAmerica.get(4));
                rbPais6.setText(paisesAmerica.get(5));
                rbPais7.setText(paisesAmerica.get(6));


                /*
                ArrayAdapter adaptador1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,paisesAmerica);
                listaPaises.setAdapter(adaptador1);*/

                break;
            case "Africa":

                rbPais1.setText(paisesAfrica.get(0));
                rbPais2.setText(paisesAfrica.get(1));
                rbPais3.setText(paisesAfrica.get(2));
                rbPais4.setText(paisesAfrica.get(3));
                rbPais5.setText(paisesAfrica.get(4));
                rbPais6.setText(paisesAfrica.get(5));
                rbPais7.setText(paisesAfrica.get(6));



                /*
                ArrayAdapter adaptador2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,paisesAfrica);
                listaPaises.setAdapter(adaptador2);*/
                break;
            case "Europa":
                rbPais1.setText(paisesEuropa.get(0));
                rbPais2.setText(paisesEuropa.get(1));
                rbPais3.setText(paisesEuropa.get(2));
                rbPais4.setText(paisesEuropa.get(3));
                rbPais5.setText(paisesEuropa.get(4));
                rbPais6.setText(paisesEuropa.get(5));
                rbPais7.setText(paisesEuropa.get(6));





                /*
                ArrayAdapter adaptador3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,paisesEuropa);
                listaPaises.setAdapter(adaptador3);*/
                break;
            case"Asia":
                rbPais1.setText(paisesAsia.get(0));
                rbPais2.setText(paisesAsia.get(1));
                rbPais3.setText(paisesAsia.get(2));
                rbPais4.setText(paisesAsia.get(3));
                rbPais5.setText(paisesAsia.get(4));
                rbPais6.setText(paisesAsia.get(5));
                rbPais7.setText(paisesAsia.get(6));





                /*
                ArrayAdapter adaptador4 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,paisesAsia);
                listaPaises.setAdapter(adaptador4);*/
                break;
            case "Oceania":

                rbPais1.setText(paisesOceania.get(0));
                rbPais2.setText(paisesOceania.get(1));
                rbPais3.setText(paisesOceania.get(2));
                rbPais4.setText(paisesOceania.get(3));
                rbPais5.setText(paisesOceania.get(4));
                rbPais6.setText(paisesOceania.get(5));
                rbPais7.setText(paisesOceania.get(6));



                /*
                ArrayAdapter adaptador5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,paisesOceania);
                listaPaises.setAdapter(adaptador5);*/

                break;
        }

        ListadoRB.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group,int checkedId)
            {

                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if (isChecked)
                {
                    switch (dato){
                        //(checkedId-2131165368)
                        case "America":

                            capitala=capitalesAmerica.get((checkedId-2131165376));
                            paisa = checkedRadioButton.getText().toString();

                            break;
                        case"Asia":

                            //txtE.setText((checkedId-2131165368));
                            capitala=capitalesAsia.get((checkedId-2131165376));
                            paisa = checkedRadioButton.getText().toString();


                            break;
                        case"Europa":
                            //txtE.setText((checkedId-2131165368));
                            capitala=capitalesEuropa.get((checkedId-2131165376));
                            paisa = checkedRadioButton.getText().toString();

                            break;
                        case"Oceania":
                            //txtE.setText((checkedId-2131165368));
                            capitala=capitalesOceania.get((checkedId-2131165376));
                            paisa = checkedRadioButton.getText().toString();


                            break;
                        case"Africa":
                            //txtLugar.setText(capitalesAfrica.get((checkedId-2131165370)));
                            //txtE.setText((checkedId-2131165368));
                            capitala=capitalesAfrica.get((checkedId-2131165376));
                            paisa = checkedRadioButton.getText().toString();


                            break;
                    }

                }
            }
        });

       ArrayAdapter<String> adapterLu=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Lugares);
       lvlLugares1.setAdapter(adapterLu);

        btnAtrasA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto intent para retornar al MainActivity (Aca modificar para que retorne al Activity2)
                i.putExtra("CONTINENTE",nombreContinente);
                startActivity(i);
            }

        });
        btnContinuarA5.setOnClickListener(new View.OnClickListener() {
            Intent h = new Intent(Actividad4.this,Activity5.class);
            @Override
            public void onClick(View view) {
                h.putExtra("CAPITAL",capitala);
                h.putExtra("PAIS",paisa);
                startActivity(h);
            }

        });
        //h.putExtra("PAIS",paisa);
        /*
        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {

                String selItem = (String) listaPaises.getSelectedItem();
                switch (dato){

                    case("America"):
                        txtLugar.setText(capitalesAmerica.get(position));
                        break;
                    case("Africa"):
                        txtLugar.setText(capitalesAfrica.get(position));
                        break;
                    case("Europa"):
                        txtLugar.setText(capitalesEuropa.get(position));
                        break;
                    case("Oceania"):
                        txtLugar.setText(capitalesOceania.get(position));
                        break;
                    case("Asia"):
                        txtLugar.setText(capitalesAsia.get(position));
                        break;
                }

            }

        });*/





    }//Fin OnCreate


    public void llenarContinententeAmericano(){

        //Creamos el objeto
        paisesAmerica = new ArrayList<String>(7);
        //llenamos el arraylist con objetos de la clase Continentes
        paisesAmerica.add("Canada");//1
        paisesAmerica.add("Argentina");//2
        paisesAmerica.add("Brasil");//3
        paisesAmerica.add("El Salvador");//4
        paisesAmerica.add("Mexico");//5
        paisesAmerica.add("Chile");//6
        paisesAmerica.add("Belice");//7

    }
    public void llenarCapitalesAmericano(){

        //Creamos el objeto
        capitalesAmerica = new ArrayList<String>(7);
        //llenamos el arraylist con objetos de la clase Continentes
        capitalesAmerica.add("Ottawa");//1
        capitalesAmerica.add("Buenos Aires");//2
        capitalesAmerica.add("Brazilia");//3
        capitalesAmerica.add("San Salvador");//4
        capitalesAmerica.add("Mexico DF");//5
        capitalesAmerica.add("Santiago de Chile");//6
        capitalesAmerica.add("Belmopan");//7

    }

    public void llenarContinententeAfricano(){

        //Creamos el objeto
        //llenamos el arraylist con objetos de la clase Continentes
        paisesAfrica.add(("Angola"));
        paisesAfrica.add(("Argelia"));
        paisesAfrica.add(("Egipto"));
        paisesAfrica.add(("Benin"));
        paisesAfrica.add(("Congo"));
        paisesAfrica.add(("Ghana"));
        paisesAfrica.add(("Camerún"));

    }
    public void llenarCapitalesAfrica(){

        capitalesAfrica.add(("Luanda"));
        capitalesAfrica.add(("Argel"));
        capitalesAfrica.add(("El Cairo"));
        capitalesAfrica.add(("Porto Novo"));
        capitalesAfrica.add(("Brazzaville"));
        capitalesAfrica.add(("Accra"));
        capitalesAfrica.add(("Libreville"));
    }

    public void llenarContinententeEuropa(){

        paisesEuropa.add("Alemania");
        paisesEuropa.add("Belgica");
        paisesEuropa.add("Bulgaria");
        paisesEuropa.add("Croacia");
        paisesEuropa.add("Dinamarca");
        paisesEuropa.add("Eslovenia");
        paisesEuropa.add("España");
    }

    public void llenarCapitalesEuropa(){


        capitalesEuropa.add(("Berlin"));
        capitalesEuropa.add(("Bruselas"));
        capitalesEuropa.add(("Sofia"));
        capitalesEuropa.add(("Zagreb"));
        capitalesEuropa.add(("Copenhague"));
        capitalesEuropa.add(("Liubliana"));
        capitalesEuropa.add(("Madrid"));



    }
    public void llenarContinententeOceania(){

        paisesOceania.add("Australia");
        paisesOceania.add("Kiribati");
        paisesOceania.add("Nauru");
        paisesOceania.add("Palau");
        paisesOceania.add("Samoa");
        paisesOceania.add("Tonga");
        paisesOceania.add("Tuvalu");

    }
    public void llenarCapitalesOceania(){

        capitalesOceania.add(("Canberra"));
        capitalesOceania.add(("Bairiki"));
        capitalesOceania.add(("Yaren"));
        capitalesOceania.add(("Koror"));
        capitalesOceania.add(("Apia"));
        capitalesOceania.add(("Nukualofa"));
        capitalesOceania.add(("Fongafale"));
    }
    public void llenarContinententeAsia(){

        paisesAsia.add("Armenia");
        paisesAsia.add("Camboya");
        paisesAsia.add("China");
        paisesAsia.add("India");
        paisesAsia.add("Irak");
        paisesAsia.add("Israel");
        paisesAsia.add("Japon");
    }
    public void llenarCapitalesAsia(){

        capitalesAsia.add("Erevan");
        capitalesAsia.add("Phnom Penh");
        capitalesAsia.add("Pekin");
        capitalesAsia.add("Nueva Delhi");
        capitalesAsia.add("Bagdad");
        capitalesAsia.add("Jerusalen");
        capitalesAsia.add("Tokio");
    }

    //Seleccion de lugar

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















    //Fin selecciones Array



    }