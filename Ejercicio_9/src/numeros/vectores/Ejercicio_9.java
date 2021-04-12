/*
 * Realizar un programa que permita la carga de 10 números en un vector. 
 * Una vez cargados, se necesita que el programa determine cual es el mayor y cuál es el menor de ellos
 */
package numeros.vectores;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] numeros = new int [10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero :");
            numeros[i] = scan.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero " + numeros[i] + " se agregó en la posición " + (i+1));
        }
    }
}