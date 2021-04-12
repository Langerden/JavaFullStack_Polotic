/*
 * Realizar un programa que permita la carga de 15 números en un vector. 
 * Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
 */
package contar3.vectores;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int [] numeros = new int [15];
      int contador = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero :");
            numeros[i] = scan.nextInt();
            if(numeros[i] == 3)
                contador++;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero " + numeros[i] + " se agregó en la posición " + (i+1));
        }
        System.out.println("Cantidad de veces que se ingresó el numero 3: " + contador);
    }
}
