/*
Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 3 columnas) con razas de perros. 
Una vez cargada, se debe permitir al usuario ingresar por teclado una raza de perro que quiera buscar; 
el programa deberá poder encontrarla y mostrar un mensaje con la posición (fila, columna) donde la encontró. 
En caso de que la raza de perro no se encuentre en la matriz, se deberá informar la situación mediante un mensaje por pantalla.
 */
package raza.vectores;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_15 {


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String [][] razas = new String [3][3];
        boolean found = false;
        String searchDog = "";
        
        for (int f = 0; f < 3; f++) {
            System.out.println("Ingrese 3 razas de perros: ");
            for (int c = 0; c < 3; c++) {
                razas[f][c] = scan.nextLine();
            }   
        }
        
        System.out.println("Ingrese la raza a buscar: ");
        searchDog = scan.nextLine();
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if(searchDog.toUpperCase().equals(razas[f][c].toUpperCase()))
                {
                    System.out.println("RAZA: " + razas[f][c] + " FILA NRO : " + f + " COLUMNA NRO: " + c);
                    found = true;
                }
                break;                
            }   
        }        
        if(!found)
            System.out.println("No se ingresó la raza " + searchDog);
    }
}
