package com.company.model;

/**
 * @author Fabio Cordoba
 * Esta es una clase Abstracta donde se definen los atributos y funciones de una NaveEspacial
 */

public  abstract  class NaveEspacial {

    public String nombre;
    public String actividad;
    public String paisOrigen;
    public String combustibleAO;
    public float potencia;

    public NaveEspacial() {
    }

    /**
     * Constructor de la entidad NaveEspacial
     * @param nombre
     * @param actividad
     * @param paisOrigen
     * @param combustibleAO
     * @param potencia
     */
    public NaveEspacial(String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.paisOrigen = paisOrigen;
        this.combustibleAO = combustibleAO;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getCombustibleAO() {
        return combustibleAO;
    }

    public void setCombustibleAO(String combustibleAO) {
        this.combustibleAO = combustibleAO;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    /**
     * Metodos Abstractos para las entidades NavesEspaciales
     */
    public abstract void misionEspacial();
    public abstract void combustibleMision();

    @Override
    public String toString() {
        return
                "nombre       : " + nombre + '\n' +
                "actividad    : " + actividad + '\n' +
                "paisOrigen   : " + paisOrigen + '\n' +
                "combustibleAO: " + combustibleAO + '\n' +
                "potencia     : " + potencia + " Toneladas\n"+
                "----------------------------------------------";
    }



}
