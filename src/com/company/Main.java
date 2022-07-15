package com.company;

import com.company.model.NaveEspacial;
import com.company.model.vehiculoslanzadera;
import com.company.services.NavesService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<NaveEspacial> naveEspacials = new ArrayList<>();
        NavesService navesService = new NavesService();
        int op;
        boolean menu = true;


        while (menu){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\t\tESTACION ESPACIAL SOFKA\n");
            System.out.println("1 Registrar Nave\n2 Listar Naves Registradas");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1 ->{
                    navesService.CrearNave();
                }
                case 2 ->{
                    navesService.ListarNaves();
                }

                default -> throw new IllegalStateException("Unexpected value: " + op);
            }


        }

    }


}
