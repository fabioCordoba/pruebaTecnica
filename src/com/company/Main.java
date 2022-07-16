package com.company;

import com.company.model.NaveEspacial;
import com.company.services.NaveService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<NaveEspacial> naveEspacials = new ArrayList<>();
        NaveService naveService = new NaveService();

        int op;
        boolean menu = true;


        while (menu){

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\t\tESTACION ESPACIAL SOFKA\n");
            System.out.println("1 Registrar Nave\n2 Listar Naves Registradas\n3 Busqueda\n4 Busqueda Avanzada");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1 ->{
                    naveService.CrearNave();
                }
                case 2 ->{
                    naveService.ListarNaves();
                }
                case 3 ->{
                    naveService.Busqueda();
                }
                case 4 ->{
                    naveService.BusquedaAvanzada();
                }

                default -> throw new IllegalStateException("Unexpected value: " + op);
            }


        }

    }


}
