package com.company.model;

import com.company.interfaces.ISonda;
/**
 * @author Fabio cordoba
 * Clase Sonda esta se extiende de la clase abtracta NaveEspacial y ademas implemanta metodos de la interface ISonda
 */
public class Sonda extends NaveEspacial implements ISonda {
    protected String destino;

    /**
     * Constructor de la clase Sonda
     * @param nombre
     * @param actividad
     * @param paisOrigen
     * @param combustibleAO
     * @param potencia
     * @param destino
     */
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

    /**
     * Este metodo viene de la clase NaveEspacial y permite definir la mision de esta nave
     * hace un llamado al metodo enviarDatos propio de la interface ISonda
     */
    @Override
    public void misionEspacial() {
        System.out.println(enviarDatos("Mision Espacial: estudiar y recopilar informacion del Destino a vistar\n"));
    }

    /**
     * Este metodo viene de la clase NaveEspacial y nos imprime informacion
     * referente al consumo de combustible de esta nave
     */
    @Override
    public void combustibleMision() {
        System.out.println("Esta nave utiliza como fuente de energia: "+ combustibleAO +'\n');
    }

    /**
     * Este metodo es implementado desde la interface ISonda y recibe un parametro de tipo String
     * @param data
     * @return
     */
    @Override
    public String enviarDatos(String data) {
        return "Enviando datos: \n"+data+"\ndesde la Sonda Espacial "+ nombre + " desde el destino" +destino+"\n";
    }

    @Override
    public String calcularOrbita(String data) {
        return null;
    }
}
