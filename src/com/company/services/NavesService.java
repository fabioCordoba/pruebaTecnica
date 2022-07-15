package com.company.services;

import com.company.model.NaveEspacial;
import com.company.model.vehiculoslanzadera;

import java.util.ArrayList;
import java.util.Scanner;

public class NavesService {

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

        System.out.println("\n\tTipo de Nave\n1 Vehiculo Lanzadera \n2 Naves no tripuladas \n3 naves especiales tripuladas");
        tp = Integer.parseInt(scanner.nextLine());

        switch (tp){
            case 1 ->{
                System.out.println("Digite el peso en toneladas: ");
                float peso = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la Altura de la nave: ");
                float altura = Float.parseFloat(scanner.nextLine());

                System.out.println("Digite la Capacidad de carga util de esta nave: ");
                float capacidadCarga = Float.parseFloat(scanner.nextLine());

                //System.out.println(nombre + ", " + actividad + ", " + paisOrigen + ", " + combustible + ", " +potencia + ", " + peso + ", " +altura+ ", " +capacidadCarga);

                vehiculoslanzadera vehiculoslanzadera = new vehiculoslanzadera(altura, peso, capacidadCarga, nombre, actividad, paisOrigen, combustible, potencia);
                naveEspacials.add(vehiculoslanzadera);
            }
            case 2 ->{
                System.out.println("Naves no tripuladas: ");
            }
            case 3 ->{
                System.out.println("naves especiales tripuladas: ");
            }
        }
        return null;
    }

    public void ListarNaves(){
        System.out.println("\n\t\tListar Naves Registradas\n");
        for (int i = 0; i < naveEspacials.size(); i++) {
            System.out.println(naveEspacials.get(i).toString());
        }
    }
}
