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
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Menu Edad");
        System.out.println("17");
        System.out.println("18");
        System.out.println("25");
        System.out.println("35");
        System.out.println("45");
        System.out.println("55");
        System.out.println("65");
        System.out.println("66");
        System.out.println("");
        System.out.print("Introduzca su edad: ");
        int opcion = teclado.nextInt();

        while (opcion < 0 || opcion > 120 ) {
            System.out.println("Introduzca un valor menor a 120.");
            opcion = teclado.nextInt();
        }
        switch (opcion) {
            case 17:
                System.out.println("No puedes votar");
                break;

            case 18:
                System.out.println("Justo eres mayor de edad");
                break;

            case 25:
                System.out.println("A disfrutar la juventud");
                break;

            case 35:
                System.out.println("Si no trabajas, ponte las pilas");
                break;

            case 45:
                System.out.println("Deberías pensar en abrir un plan de pensiones");
                break;

            case 55:
                System.out.println("Viva la madurez");
                break;

            case 65:
                System.out.println("Enhorabuena Jubilado");
                break;

            case 66:
                System.out.println("A disfrutar la vejez");
                break;
        }
    }
}
