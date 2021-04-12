/*
Un empleado desea almacenar en un vector sus 12 sueldos del año. 
A partir de esto, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
 */
package sueldos.vectores;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double [] sueldos = new double [12];
        int i;
        double suma = 0;
        
        for (i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo del empleado numero " + (i+1));
            sueldos[i] = scan.nextDouble();
            suma += sueldos[i];
        }
        System.out.println("Suma total de los sueldos: " + Math.round(suma) + "\nPromedio Total: " + Math.round(suma/i));
    }    
}
