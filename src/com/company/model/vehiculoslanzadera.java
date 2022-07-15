package com.company.model;

import com.company.model.NaveEspacial;

public class vehiculoslanzadera extends NaveEspacial {

    protected float altura;
    protected float peso;
    protected float capacidadCarga;

    public vehiculoslanzadera(float altura, float peso, float capacidadCarga,String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.altura = altura;
        this.peso = peso;
        this.capacidadCarga = capacidadCarga;
    }

    public vehiculoslanzadera(float altura, float peso, float capacidadCarga) {
        this.altura = altura;
        this.peso = peso;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return
                "nombre        : " + nombre + '\n' +
                "actividad     : " + actividad + '\n' +
                "paisOrigen    : " + paisOrigen + '\n' +
                "combustibleAO : " + combustibleAO + '\n' +
                "potencia      : " + potencia + "Toneladas\n"+
                "altura        : " + altura + '\n' +
                "peso          : " + peso + '\n' +
                "capacidadCarga: " + capacidadCarga+ '\n' ;
    }
}
