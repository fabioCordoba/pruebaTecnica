package com.company.model;
/**
 * @author Fabio cordoba
 * Clase Tripulada esta se extiende de la clase abtracta NaveEspacial
 */
public class Tripulada extends NaveEspacial{

    protected int capacidadTripulacion;
    protected float peso;
    protected  int cantCombustible;

    /**
     * Constructor de la clase
     * @param nombre
     * @param actividad
     * @param paisOrigen
     * @param combustibleAO
     * @param potencia
     * @param capacidadTripulacion
     * @param peso
     * @param cantCombustible
     */
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
                "potencia             : " + potencia + "kN\n"+
                "capacidadTripulacion : " + capacidadTripulacion + " Personas\n" +
                "peso                 : " + peso+ '\n'+
                "----------------------------------------------" ;
    }

    /**
     * Metodo propio de la clase Tripulada
     * @return
     */
    public String detallesMision(){
        return "La tripulacion intenta enviar detalles de la mision a la base en Tierra";
    }

    /**
     * Este metodo viene de la clase NaveEspacial y permite definir la mision de esta nave
     */
    @Override
    public void misionEspacial() {
        System.out.println("Mision Espacial: mandar seres humanos al espacio para tareas de reparacion, \nmantenimiento o investigacion, en misiones donde se precisa la destreza \ny de la toma de decisiones de personas, en detrimento de las máquinas");
    }

    /**
     * Este metodo viene de la clase NaveEspacial y nos imprime informacion
     * referente al consumo de combustible de esta nave
     */
    @Override
    public void combustibleMision() {
        if (cantCombustible > 0){
            System.out.println("Esta nave utilizo " + cantCombustible + " Galones de combustible tipo "+ combustibleAO+'\n' );
        }
    }


}
