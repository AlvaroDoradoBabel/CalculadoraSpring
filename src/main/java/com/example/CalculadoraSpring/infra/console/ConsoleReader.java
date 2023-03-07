package com.example.CalculadoraSpring.infra.console;

import com.example.CalculadoraSpring.service.OperacionService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.Scanner;

@Component
public class ConsoleReader {
    private OperacionService operacionService;

    public ConsoleReader(OperacionService operacionService) {
        this.operacionService = operacionService;
    }

    @PostConstruct
    public void init(){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        int opcion = 1;
        String entradaConsola;
        while(opcion!=0) {
            System.out.println("Menu por consola");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicat");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.println("Ingrese la accion a realizar");
            entradaConsola = sc.next();
            try {
                opcion = Integer.parseInt(entradaConsola);
            }catch (Exception e) {
                System.out.println("Opcion no valida, ingresa un número");
            }
            switch (opcion) {
                case 5:
                    System.out.println("Hasta luego");
                    opcion = 0;
                    break;
                case 1:
                    System.out.println("Ingrese numero");
                    n1 = sc.nextInt();
                    System.out.println("Ingrese numero");
                    n2 = sc.nextInt();
                    System.out.println(operacionService.sumar(n1,n2));

                    break;

                case 2:
                    System.out.println("Ingrese numero");
                    n1 = sc.nextInt();
                    System.out.println("Ingrese numero");
                    n2 = sc.nextInt();
                    System.out.println(operacionService.restar(n1,n2));
                    break;

                case 3:
                    System.out.println("Ingrese numero");
                    n1 = sc.nextInt();
                    System.out.println("Ingrese numero");
                    n2 = sc.nextInt();
                    //Multiplicar
                    System.out.println(operacionService.multiplicar(n1,n2));
                    break;

                case 4:
                    System.out.println("Ingrese numero");
                    n1 = sc.nextInt();
                    System.out.println("Ingrese numero");
                    n2 = sc.nextInt();
                    //Dividir
                    System.out.println(operacionService.dividir(n1,n2));
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }
}
