/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refuerzo;

import java.util.Random;


/**
 *
 * Repite el programa anterior, generando números aleatorios,
 * hasta que se cumpla la propiedad anterior. 
 * El programa debe informar del número de iteraciones realizadas y los números obtenidos.
 */
public class ejercicio4 {
    public static void main(String[] args) {
    Random aleatorio = new Random();
    int contador = 0;
    int numAleatorio3 = aleatorio.nextInt(20)+1;
    int numAleatorio1 = aleatorio.nextInt(10)+1;
    int numAleatorio2 = aleatorio.nextInt(10)+1;
                  
    int sumanum = numAleatorio1 + numAleatorio2;
        
    while (sumanum != numAleatorio3){
        numAleatorio3 = aleatorio.nextInt(20)+1;
        
        numAleatorio1 = aleatorio.nextInt(10)+1;
        numAleatorio2 = aleatorio.nextInt(10)+1;
        
        sumanum = numAleatorio1 + numAleatorio2;
            contador++;            
        }
    System.out.println("Necesito " + contador + " veces para ocurrir");
    } 
}
