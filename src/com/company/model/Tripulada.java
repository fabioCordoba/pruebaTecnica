package com.company.model;

public class Tripulada extends NaveEspacial{

    protected int capacidadTripulacion;
    protected float peso;

    public Tripulada(String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia, int capacidadTripulacion, float peso) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.capacidadTripulacion = capacidadTripulacion;
        this.peso = peso;
    }

    public Tripulada(int capacidadTripulacion, float peso) {
        this.capacidadTripulacion = capacidadTripulacion;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return
                "Tipo                 : Tripulada" + '\n' +
                "nombre               : " + nombre + '\n' +
                "actividad            : " + actividad + '\n' +
                "paisOrigen           : " + paisOrigen + '\n' +
                "combustibleAO        : " + combustibleAO + '\n' +
                "potencia             : " + potencia + "Toneladas\n"+
                "capacidadTripulacion : " + capacidadTripulacion + '\n' +
                "peso                 : " + peso+ '\n' ;
    }
}
