package com.example.actividad1_ev2;

public class Pais {

    //Declaracion de variables
    private String nContinente;
    private String nPais;

    //Creamo un constructor para asignarle valores  a las variables
    public Pais(String nContinente, String nPais){
        this.nContinente=nContinente;
        this.nPais=nPais;
    }



    //Metodos de tipo get para retornar el valor seleccionado nombre y letra
    public String getnContinente(){
        return nContinente;
    }

    public String getnPais(){
        return nPais;
    }
}
