/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refuerzo;

import java.util.Scanner;

/**
 *
 * Un algoritmo que lea tres números e indique 
 * si el tercero es igual a la suma del primero y el segundo.
 */
public class ejercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        
        System.out.print("Escriba el primer número: ");
        int primernum = teclado.nextInt();
        
        System.out.print("Escriba el segundo número: ");
        int segundonum = teclado.nextInt();
    
        System.out.print("Escriba el tercer número: ");
        int tercernum = teclado.nextInt();
        
        int sumanum = primernum + segundonum;
        
        if (sumanum == tercernum){
            System.out.println("La suma de sus dos primeros números es igual al tercer número");
        }else{
            System.out.println("La suma de sus dos primeros números no es igual al tercer número");
        }
    }    
}
