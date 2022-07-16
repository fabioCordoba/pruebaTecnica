package com.company.model;

import com.company.interfaces.ISonda;

public class Sonda extends NaveEspacial implements ISonda {
    protected String destino;

    public Sonda(String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia, String destino) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.destino = destino;
    }

    public Sonda(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return
                "Tipo                 : Sonda Espacial" + '\n' +
                "nombre               : " + nombre + '\n' +
                "actividad            : " + actividad + '\n' +
                "paisOrigen           : " + paisOrigen + '\n' +
                "combustibleAO        : " + combustibleAO + '\n' +
                "potencia             : " + potencia + "Toneladas\n"+
                "destino              : " + destino+ '\n'+
                "----------------------------------------------";
    }

    @Override
    public void misionEspacial() {
        System.out.println(enviarDatos("Mision Espacial: estudiar y recopilar informacion del Destino a vistar\n"));
    }

    @Override
    public void combustibleMision() {
        System.out.println("Esta nave utiliza como fuente de energia: "+ combustibleAO +'\n');
    }

    @Override
    public String enviarDatos(String data) {
        return "Enviando datos: \n"+data+"\ndesde la Sonda Espacial "+ nombre + " desde el destino" +destino+"\n";
    }

    @Override
    public String calcularOrbita(String data) {
        return null;
    }
}
