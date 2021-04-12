/*
En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones. 
En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas
Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; 
además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la temperatura más alta 
(dando a conocer al mismo tiempo la cantidad de grados).
 */
package ciudades.temperatura.vectores;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        String[] ciudades = new String[5];
        int[] temperaturasMin = new int[5];
        int[] temperaturasMax = new int[5];
        
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner (System.in);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int indiceTempMin = 0;
        int indiceTempMax = 0;

        for (int i = 0; i < ciudades.length; i++) {
            
            System.out.println("Ingrese la ciudad: ");
            ciudades[i] = scan.nextLine();
            
            System.out.println("Ingerse la temperatura minima de dicha ciudad: ");
            temperaturasMin[i] = scanInt.nextInt();
            if (temperaturasMin[i] < min) {
                min = temperaturasMin[i];
                indiceTempMin = i;
            }
            System.out.println("Ingrese la temperatura maxima alcazada de la ciudad: ");
            temperaturasMax[i] = scanInt.nextInt();
            if (temperaturasMax[i] > max) {
                max = temperaturasMax[i];
                indiceTempMax = i;
            }
        }
        System.out.println("Ciudad con temperatura mas Alta: " + ciudades[indiceTempMax] + " y con la temperatura mas baja: " + ciudades[indiceTempMin]);
    }
}
