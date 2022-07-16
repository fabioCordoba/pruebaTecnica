package com.company.model;

/**
 * @author Fabio cordoba
 * Clase VehiculoLanzadera esta se extiende de la clase abtracta NaveEspacial
 */
public class VehiculoLanzadera extends NaveEspacial {

    protected float altura;
    protected float peso;
    protected float capacidadCarga;
    protected  int cantCombustible;

    public VehiculoLanzadera(float altura, float peso, float capacidadCarga, int cantCombustible, String nombre, String actividad, String paisOrigen, String combustibleAO, float potencia) {
        super(nombre, actividad, paisOrigen, combustibleAO, potencia);
        this.altura = altura;
        this.peso = peso;
        this.capacidadCarga = capacidadCarga;
        this.cantCombustible = cantCombustible;
    }

    public VehiculoLanzadera(float altura, float peso, float capacidadCarga, int cantCombustible) {
        this.altura = altura;
        this.peso = peso;
        this.capacidadCarga = capacidadCarga;
        this.cantCombustible = cantCombustible;
    }

    @Override
    public String toString() {
        return
                "Tipo          : Lanzadera" + '\n' +
                "nombre        : " + nombre + '\n' +
                "actividad     : " + actividad + '\n' +
                "paisOrigen    : " + paisOrigen + '\n' +
                "combustibleAO : " + combustibleAO + '\n' +
                "potencia      : " + potencia + " kN\n"+
                "altura        : " + altura + '\n' +
                "peso          : " + peso + '\n' +
                "capacidadCarga: " + capacidadCarga+ '\n'+
                "----------------------------------------------" ;
    }

    /**
     * Este metodo viene de la clase NaveEspacial y permite definir la mision de esta nave
     */
    @Override
    public void misionEspacial() {
        System.out.println("Mision Espacial: Vehiculo de Lanzamiento");
    }

    /**
     * Este metodo viene de la clase NaveEspacial y nos imprime informacion
     * referente al consumo de combustible de esta nave
     */
    @Override
    public void combustibleMision() {
        if (cantCombustible > 0){
            System.out.println("Esta nave utilizo " + cantCombustible + " Galones de  combustible tipo "+ combustibleAO+'\n' );
        }
    }
}
