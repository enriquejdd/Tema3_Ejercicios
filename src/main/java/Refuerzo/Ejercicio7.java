/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refuerzo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tipoa1 = 0.20; // Precio a sumar tipo A numero 1
        double tipoa2 = 0.30; // Precio a sumar tipo B numero 2
        double tipob1 = 0.30; // Precio a restar tipo B numero 1
        double tipob2 = 0.50; // Precio a restar tipo B numero 2
        int kilo = 4; // Precio del kilo

        System.out.println("¿Cuántos kilos de uvas tienes?");
        int kilos = teclado.nextInt();

        System.out.println("¿Qué tipo de uva es? A o B");
        String tipo = teclado.next();

        System.out.println("¿De que tamaño son?");
        int tamaño1 = teclado.nextInt();

        int kilo1 = kilo * kilos;

        if (tipo.equalsIgnoreCase("A")) {
            switch (tamaño1) {
                case 1:
                    double kilosa1 = kilos * tipoa1;
                    double kilofinala1 = kilo1 + kilosa1;

                    System.out.println("El precio es " + kilofinala1);
                    break;

                case 2:
                    double kilosa2 = kilos * tipoa2;
                    double kilofinala2 = kilo1 + kilosa2;

                    System.out.println("El precio es " + kilofinala2);
                    break;
            }
        } else {
            switch (tamaño1) {
                case 1:
                    double kilosb1 = kilos * tipob1;
                    double kilofinalb1 = kilo1 - kilosb1;

                    System.out.println("El precio es " + kilofinalb1);
                    break;

                case 2:
                    double kilosb2 = kilos * tipob2;
                    double kilofinalb2 = kilo1 - kilosb2;

                    System.out.println("El precio es " + kilofinalb2);
                    break;
            }
        }

//        if(tipo.equalsIgnoreCase("A")){                      
//            if (tamaño1 == 1){ // Tipo A tamaño 1
//                
//                double kilosa1 = kilos * tipoa1;
//                double kilofinala1 = kilo1 + kilosa1;
//                
//                System.out.println("El precio es " + kilofinala1);
//            }else { // Tipo A tamaño 2
//                
//                double kilosa2 = kilos * tipoa2;
//                double kilofinala2 = kilo1 + kilosa2;
//                
//                System.out.println("El precio es " + kilofinala2);
//            }
//        }else{
//            if (tamaño1 == 1){ // Tipo B tamaño 1
//                
//                double kilosb1 = kilos * tipob1;
//                double kilofinalb1 = kilo1 - kilosb1;
//                
//                System.out.println("El precio es " + kilofinalb1);
//            }else { // Tipo B tamaño 2
//                
//                double kilosb2 = kilos * tipob2;
//                double kilofinalb2 = kilo1 - kilosb2;
//                
//                System.out.println("El precio es " + kilofinalb2);
//            }
//        }
    }
}
