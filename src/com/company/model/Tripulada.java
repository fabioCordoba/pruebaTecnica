package com.company.model;

public class Tripulada extends NaveEspacial{

    protected int capacidadTripulacion;
    protected float peso;
    protected  int cantCombustible;

    public Tripulada(String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia, int capacidadTripulacion, float peso, int cantCombustible) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.capacidadTripulacion = capacidadTripulacion;
        this.peso = peso;
        this.cantCombustible = cantCombustible;
    }

    public Tripulada(int capacidadTripulacion, float peso) {
        this.capacidadTripulacion = capacidadTripulacion;
        this.peso = peso;
        this.cantCombustible = cantCombustible;
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
                "capacidadTripulacion : " + capacidadTripulacion + " Personas\n" +
                "peso                 : " + peso+ '\n'+
                "----------------------------------------------" ;
    }

    @Override
    public void misionEspacial() {
        System.out.println("Mision Espacial: mandar seres humanos al espacio para tareas de reparacion, \nmantenimiento o investigacion, en misiones donde se precisa la destreza \ny de la toma de decisiones de personas, en detrimento de las máquinas\n");
    }

    @Override
    public void combustibleMision() {
        if (cantCombustible > 0){
            System.out.println("Esta nave utilizo " + cantCombustible + " Galones de combustible tipo "+ combustibleAO+'\n' );
        }
    }


}
