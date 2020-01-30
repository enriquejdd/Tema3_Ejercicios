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
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horasNormales = 17.4;
        double horasExtras = 22.6;

        System.out.println("¿Cuántas horas has trabajado esta semana?");
        int horas = teclado.nextInt();

        if (horas > 25) {
            double salarioFijo = horasNormales * 25; // las 25 horas para llegar a las extras
            double salarioExtra = (horas - 25) * horasExtras; // precio de las horas extras
            double salarioFinal = salarioFijo + salarioExtra; //suma de ambos partes del salario            
            double valorFinal = Math.round(salarioFinal * 100d) / 100d; //Regular los decimales          

            // Imprimos por pantalla el salario segun sus horas 
            System.out.println("El salario mensual de " + horas + " horas es " + valorFinal + "€");

        } else if (horas < 0 || horas > -25) {
            double salario = (horas - horas - horas) * horasNormales;
            double valorFinal2 = Math.round(salario * 100d) / 100d; // Regular los decimales

            // Imrpimimos en pantalla el salario
            System.out.println("El salario mensual es de " + horas + " horas es " + valorFinal2 + "€");

        } else if (horas <= -25) {
            double salarioFijo = horasNormales * 25; // las 25 horas para llegar a las extras
            double salarioExtra = ((horas + horas + horas) - 25) * horasExtras; // precio de las horas extras
            double salarioFinal = salarioFijo + salarioExtra; //suma de ambos partes del salario            
            double valorFinal = Math.round(salarioFinal * 100d) / 100d; //Regular los decimales          

            // Imprimos por pantalla el salario segun sus horas 
            System.out.println("El salario mensual de " + horas + " horas es " + valorFinal + "€");

        } else {
            double salario = horas * horasNormales; // Salario segun sus horas sin extras
            double valorFinal2 = Math.round(salario * 100d) / 100d; // Regular los decimales

            // Imrpimimos en pantalla el salario
            System.out.println("El salario mensual es de " + horas + " horas es " + valorFinal2 + "€");
        }

        System.out.println("¿Desea comprobar otro salario?");
        System.out.println("Si -- s");
        System.out.println("No -- n");
        String salida = teclado.next();

    }

}
