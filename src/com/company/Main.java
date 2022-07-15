package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<NaveEspacial> naveEspacials = new ArrayList<>();

        boolean menu = true;
        int op;

        while (menu){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\t\tESTACION ESPACIAL SOFKA\n");
            System.out.println("1 Registrar Nave\n2 Listar Naves Registradas");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1 ->{
                    System.out.println("\t\tRegistrar Nave\n");

                    System.out.println("Por favor indique el nombre de la nave: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Por favor indique la fecha de Actividad de la nave\nejemplo 1967-1973: ");
                    String actividad = scanner.nextLine();

                    System.out.println("Por favor indique el pais de origen: ");
                    String paisOrigen = scanner.nextLine();

                    System.out.println("Por favor indique el tipo de combustible y/o agentes oxidantes: ");
                    String combustible = scanner.nextLine();

                    System.out.println("Por favor indique la potencia: ");
                    float potencia = Float.parseFloat(scanner.nextLine());

                    //System.out.println(nombre + ", " + actividad + ", " + paisOrigen + ", " + combustible + ", " +potencia);

                    vehiculoslanzadera vehiculoslanzadera = new vehiculoslanzadera(nombre, actividad, paisOrigen, combustible, potencia);

                    naveEspacials.add(vehiculoslanzadera);

                }
                case 2 ->{
                    System.out.println("\n\t\tListar Naves Registradas\n");

                    for (int i = 0; i < naveEspacials.size(); i++) {
                        System.out.println(naveEspacials.get(i).toString());
                    }
                    //System.out.println(naveEspacials);
                }

                default -> throw new IllegalStateException("Unexpected value: " + op);
            }


        }

    }
}
