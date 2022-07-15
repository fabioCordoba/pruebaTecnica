package com.company.model;

public class NoTripulada  extends NaveEspacial{

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
                "potencia      : " + potencia + "Toneladas\n"+
                "capacidadCarga: " + capacidadCarga+ '\n' ;
    }
}
