package com.example.actividad1_ev2;

public class Pais {

    //Declaracion de variables

    private String nPais;
    boolean estado;




    //Creamo un constructor para asignarle valores  a las variables
    public Pais(String nPais){
        this.nPais=nPais;
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
