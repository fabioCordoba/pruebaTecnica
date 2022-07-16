package com.company.model;

import com.company.interfaces.ISonda;

public class NoTripulada  extends NaveEspacial implements ISonda {

    protected float capacidadCarga;


    public NoTripulada(String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia, float capacidadCarga) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.capacidadCarga = capacidadCarga;
    }

    public NoTripulada(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return
                "Tipo          : No Tripulada" + '\n' +
                "nombre        : " + nombre + '\n' +
                "actividad     : " + actividad + '\n' +
                "paisOrigen    : " + paisOrigen + '\n' +
                "combustibleAO : " + combustibleAO + '\n' +
                "potencia      : " + potencia + " Toneladas\n"+
                "capacidadCarga: " + capacidadCarga+ '\n' +
                "----------------------------------------------";
    }

    @Override
    public void misionEspacial() {
        System.out.println("Mision Espacial: estudiar otros cuerpos celestes");
        System.out.println(enviarDatos("Baterias y celdas solares"));
    }

    @Override
    public void combustibleMision() {
        System.out.println("Esta nave utilizo "+ combustibleAO +" como combustible\n");
    }

    @Override
    public String enviarDatos(String data) {
        return "Estado del envio: \n"+data+"\ndesde nave no tripulada "+ nombre + " con carga util de " +capacidadCarga+" Toneladas\n";
    }

    @Override
    public String calcularOrbita(String data) {
        return null;
    }
}
