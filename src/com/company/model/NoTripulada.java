package com.company.model;

import com.company.interfaces.ISonda;
/**
 * @author Fabio cordoba
 * Clase NoTripulada esta se extiende de la clase abtracta NaveEspacial y ademas implemanta metodos de la interface ISonda
 */
public class NoTripulada  extends NaveEspacial implements ISonda {

    protected float capacidadCarga;

    /**
     * Contructor de la clase NoTripulada
     * @param nombre
     * @param actividad
     * @param paisOrigen
     * @param combustibleAO
     * @param potencia
     * @param capacidadCarga
     */
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

    /**
     * Este metodo viene de la clase NaveEspacial y permite definir la mision de esta nave
     * hace un llamado al metodo enviarDatos propio de la interface ISonda
     */
    @Override
    public void misionEspacial() {
        System.out.println("Mision Espacial: estudiar otros cuerpos celestes");
        System.out.println(enviarDatos("Baterias y celdas solares"));
    }

    /**
     * Este metodo viene de la clase NaveEspacial y nos imprime informacion
     * referente al consumo de combustible de esta nave
     */
    @Override
    public void combustibleMision() {
        System.out.println("Esta nave utilizo "+ combustibleAO +" como combustible\n");
    }

    /**
     * Este metodo es implementado desde la interface ISonda y recibe un parametro de tipo String
     * @param data
     * @return
     */
    @Override
    public String enviarDatos(String data) {
        return "Estado del envio: \n"+data+"\ndesde nave no tripulada "+ nombre + " con carga util de " +capacidadCarga+" Toneladas\n";
    }

    @Override
    public String calcularOrbita(String data) {
        return null;
    }
}
