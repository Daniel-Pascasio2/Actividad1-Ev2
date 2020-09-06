package com.example.actividad1_ev2;

public class Paises2 {

    //Declaracion de variables
    private String nCapital;
    private String nPais;
    boolean estado;

    //Creamo un constructor para asignarle valores  a las variables
    public Paises2(String nPais, String nContinente){
        this.nCapital=nContinente;
        this.nPais=nPais;
    }



    //Metodos de tipo get para retornar el valor seleccionado nombre y letra
    public String getnCapital(){
        return nCapital;
    }

    public String getnPais(){
        return nPais;
    }

    public void setChekeado(boolean chekeado){
        estado=chekeado;
    }

    public boolean isChekeado(){
        return estado;
    }



}
