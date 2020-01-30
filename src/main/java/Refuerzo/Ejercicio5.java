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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int deduccion1 = 10;
        int deduccion2 = 16;
        
        System.out.println("Indique el importe bruto");
        int importe = teclado.nextInt();
        
        if (importe >= 15000){
            int neto1 = importe-(importe * deduccion2)/100;
            
            System.out.println("El importe neto es " + neto1);
        }else{
            int neto2 = importe-(importe * deduccion1)/100;
            System.out.println("El importe neto es " + neto2);
        }
    }
}
