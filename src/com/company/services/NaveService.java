package com.company.services;

import com.company.model.NaveEspacial;
import com.company.model.NoTripulada;
import com.company.model.Tripulada;
import com.company.model.VehiculoLanzadera;

import java.util.ArrayList;
import java.util.Scanner;

public class NaveService {

    private int tp;
    ArrayList<NaveEspacial> naveEspacials = new ArrayList<>();

    public Void CrearNave(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\tRegistrar Nave\n");

        System.out.println("Digite el nombre de la nave: ");
        String nombre = scanner.nextLine();

        System.out.println("Digite la fecha de Actividad de la nave\nejemplo 1967-1973: ");
        String actividad = scanner.nextLine();

        System.out.println("Digite el pais de origen: ");
        String paisOrigen = scanner.nextLine();

        System.out.println("Digite el tipo de combustible y/o agentes oxidantes: ");
        String combustible = scanner.nextLine();

        System.out.println("Digite la potencia: ");
        float potencia = Float.parseFloat(scanner.nextLine());

        System.out.println("\n\tTipo de Nave\n\n1 Vehiculo Lanzadera \n2 Naves no tripuladas \n3 naves especiales tripuladas");
        tp = Integer.parseInt(scanner.nextLine());

        switch (tp){
            case 1 ->{
                System.out.println("Digite el peso en toneladas: ");
                float peso = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la Altura de la nave: ");
                float altura = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la Capacidad de carga util de esta nave: ");
                float capacidadCarga = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la cantidad de combustible por mision: ");
                int cantCombustible = Integer.parseInt(scanner.nextLine());

                VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera(altura, peso, capacidadCarga, cantCombustible,nombre, actividad, paisOrigen, combustible, potencia);
                naveEspacials.add(vehiculoLanzadera);
            }
            case 2 ->{

                System.out.println("Digite la Capacidad de carga util de esta nave: ");
                float capacidadCarga = Float.parseFloat(scanner.nextLine());

                NoTripulada noTripulada = new NoTripulada(nombre, actividad, paisOrigen, combustible, potencia, capacidadCarga);
                naveEspacials.add(noTripulada);
            }
            case 3 ->{
                System.out.println("Digite la Capacidad de tripulacion: ");
                int capacidadTripulacion = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite peso de la nave: ");
                float peso = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la cantidad de combustible por mision: ");
                int cantCombustible = Integer.parseInt(scanner.nextLine());

                Tripulada tripulada = new Tripulada(nombre, actividad, paisOrigen, combustible, potencia, capacidadTripulacion, peso, cantCombustible);
                naveEspacials.add(tripulada);
            }
        }
        return null;
    }

    public void ListarNaves(){
        System.out.println("\n\t\tListar Naves Registradas\n");
        for (int i = 0; i < naveEspacials.size(); i++) {
            naveEspacials.get(i).misionEspacial();
            naveEspacials.get(i).combustibleMision();
            System.out.println(naveEspacials.get(i).toString());
        }
    }

    public void clear(){

        System.out.println("test");

    }
}
