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
public class Piramide {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = teclado.nextInt();
        
        System.out.println();
        for (int altura = 1; altura <= numFilas; altura++) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                System.out.print(" ");
            }

            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (altura * 1) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
