/*
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
i. Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del alumno y que en la última columna se calculen los promedios.
ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.
 */
package notas.matrices;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_16 {

    public static void main(String[] args) {
        double notas[][] = new double[4][4];
        double suma = 0;
        double promedio = 0;
        Scanner scan = new Scanner(System.in);

        for (int f = 0; f < 4; f++) {
            System.out.println("Ingrese las 3 notas del alumno " + f);
            for (int c = 0; c < 3; c++) {
                notas[f][c] = scan.nextDouble();
                suma += notas[f][c];
            }
            notas[f][3] = suma/3;            
            suma = 0;
        }
        
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("El promedio de notas para el alumno es de: " +notas[f][3]);
        }   
    }
}
