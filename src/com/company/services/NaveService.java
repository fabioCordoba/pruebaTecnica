package com.company.services;

import com.company.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class NaveService {

    private int tp, par;
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

        System.out.println("\n\tTipo de Nave\n\n1 Vehiculo Lanzadera \n2 Naves no tripuladas \n3 naves especiales tripuladas\n4 Sonda Espacial");
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
            case 4->{
                System.out.println("Digite el Destino de la Sonda: ");
                String destino = scanner.nextLine();

                Sonda sonda = new Sonda(nombre, actividad, paisOrigen, combustible, potencia,destino);
                naveEspacials.add(sonda);
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

    public void Busqueda(){
        Scanner scanner = new Scanner(System.in);

        String parametro;

        System.out.println("\n\t\tBusqueda Simple\n");
        System.out.println("Digite Nombre de Nave: ");
        String sea = scanner.nextLine();

        System.out.println("\n\t\tResultados de la Busqueda\n");
        for (int i = 0; i < naveEspacials.size(); i++) {
            if(naveEspacials.get(i).getNombre().equals(sea)){
                naveEspacials.get(i).misionEspacial();
                naveEspacials.get(i).combustibleMision();
                System.out.println(naveEspacials.get(i).toString());
            }
        }

    }

    public void BusquedaAvanzada(){
        String parametro;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\tBusqueda Avanzada4:\n1 nombre\n2 actividad\n3 paisOrigen\n4 combustibleAO");
        par = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite palabra: ");
        String sea = scanner.nextLine();

        switch (par){
            case 1 ->{
                parametro = "nombre";
                System.out.println("\n\t\tResultados de la Busqueda\n");
                for (int i = 0; i < naveEspacials.size(); i++) {
                    if(naveEspacials.get(i).getNombre().equals(sea)){
                        naveEspacials.get(i).misionEspacial();
                        naveEspacials.get(i).combustibleMision();
                        System.out.println(naveEspacials.get(i).toString());
                    }
                }

            }
            case 2 ->{
                parametro = "actividad";
                System.out.println("\n\t\tResultados de la Busqueda\n");
                for (int i = 0; i < naveEspacials.size(); i++) {
                    if(naveEspacials.get(i).getActividad().equals(sea)){
                        naveEspacials.get(i).misionEspacial();
                        naveEspacials.get(i).combustibleMision();
                        System.out.println(naveEspacials.get(i).toString());
                    }
                }
            }
            case 3 ->{
                parametro = "paisOrigen";
                System.out.println("\n\t\tResultados de la Busqueda\n");
                for (int i = 0; i < naveEspacials.size(); i++) {
                    if(naveEspacials.get(i).getPaisOrigen().equals(sea)){
                        naveEspacials.get(i).misionEspacial();
                        naveEspacials.get(i).combustibleMision();
                        System.out.println(naveEspacials.get(i).toString());
                    }
                }
            }
            case 4 ->{
                parametro = "combustibleAO";
                System.out.println("\n\t\tResultados de la Busqueda\n");
                for (int i = 0; i < naveEspacials.size(); i++) {
                    if(naveEspacials.get(i).getCombustibleAO().equals(sea)){
                        naveEspacials.get(i).misionEspacial();
                        naveEspacials.get(i).combustibleMision();
                        System.out.println(naveEspacials.get(i).toString());
                    }
                }
            }
        }
    }

    public void limpiar(){
        System.out.println("Presione Enter para continuar...");
        new java.util.Scanner(System.in).nextLine();

        for (int i = 0; i < 13; i++) {
            System.out.println("\n");
        }
    }
}
