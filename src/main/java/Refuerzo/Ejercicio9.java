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
public class Ejercicio9 {

    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique un número del 1 al 12 para saber la cantidad de dás del mes.");
        int opcion = teclado.nextInt();

        while (opcion > 12) {
            System.out.println("el número elegido no indica nigún més. Escriba otro.");
            opcion = teclado.nextInt();
        }

        if (opcion == 1 || opcion == 3 || opcion == 5 || opcion == 7
                || opcion == 8 || opcion == 10 || opcion == 12) {
            switch (opcion) {
                case 1:
                    System.out.println("El més es Enero y tiene 31 días");
                    break;
                case 3:
                    System.out.println("El més es Marzo y tiene 31 días");
                    break;
                case 5:
                    System.out.println("El més es Mayo y tiene 31 días");
                    break;
                case 7:
                    System.out.println("El més es Julo y tiene 31 días");
                    break;
                case 8:
                    System.out.println("El més es Agosto y tiene 31 días");
                    break;
                case 10:
                    System.out.println("El més es Octubre y tiene 31 días");
                    break;
                case 12:
                    System.out.println("El més es Diciembre y tiene 31 días");
                    break;
            }
        } else if (opcion == 4 || opcion == 6 || opcion == 9 || opcion == 11) {
            switch (opcion) {
                case 4:
                    System.out.println("El més es Abril y tiene 30 días");
                    break;
                case 6:
                    System.out.println("El més es Junio y tiene 30 días");
                    break;
                case 9:
                    System.out.println("El més es Septiembre y tiene 30 días");
                    break;
                case 11:
                    System.out.println("El més es Noviembre y tiene 30 días");
                    break;
            }
        } else {
            System.out.println("El més es Febrero y tiene 28 días");
        }
    }
}
