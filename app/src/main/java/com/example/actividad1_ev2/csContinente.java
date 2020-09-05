package com.example.actividad1_ev2;

public class csContinente {
    private String nombreContinente;
    private char con;

    //creando el constructor
    public csContinente(String nombreContinente, char con){
        this.nombreContinente=nombreContinente;
        this.con=con;
    }

    //metodos getter para cada elemento
    public String getNombreContinente(){
        return nombreContinente;
    }

    public char getCon(){
        return con;
    }
}
