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
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el día de la semana con un número del 1 al 7");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El dia elegido es el Lunes");
                break;
            case 2:
                System.out.println("El dia elegido es el Martes");
                break;
            case 3:
                System.out.println("El dia elegido es el El dia elegido es el Miércoles");
                break;
            case 4:
                System.out.println("El dia elegido es el Jueves");
                break;
            case 5:
                System.out.println("El dia elegido es el Viernes");
                break;
            case 6:
                System.out.println("El dia elegido es el Sabado");
                break;
            case 7:
                System.out.println("El dia elegido es el Domingo");
                break;

        }

    }

}
