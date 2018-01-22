package com.dmb.sqlitedavidmb.Model;

/**
 * Created by davidmari on 22/1/18.
 */

public class Subject {
    private String nombre;
    private int horas;

    public Subject(String nombre, int horas){
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
