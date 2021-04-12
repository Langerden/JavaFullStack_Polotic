/*
a. Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro). Utilizar para esto alguna estructura repetitiva.
b. Realizar un programa que dado por teclado un límite numérico por teclado (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).
c. Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200…202…204…etc.
d. Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.
e. Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra “salir”.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int limitB = 0;        
        String words = "salir";
        
        System.out.println("EJERCICIO A");       
        for(int i = 0; i <= 35; i++){
            System.out.println("El numero es: " + i);
        }
        
        System.out.println("EJERCICIO B\nIngrese un numero para mostrar todos sus numeros previos: ");
        limitB = scan.nextInt();
        while(limitB >= 0){
            System.out.println("El numero es: " + limitB);
            limitB--;
        }
        
        System.out.println("EJERCICIO C");
        for(int i = 200; i <= 250; i+=2){
            System.out.println("El numero es: " + i);
        }
        
        System.out.println("EJERCICIO D");
        for(int i = 10; i > 0; i--){
            System.out.println("Cuenta regresiva " + i);
        }
        
        System.out.println("EJERCICIO E");
        do {
            System.out.println("Ingrese una palabra (en caso de querer salir, escriba salir): ");
            words = scan.nextLine();            
            System.out.println("La palabra ingresada es: " + words);
        } while (!"salir".equals(words.toLowerCase()));
        System.out.println("Bye bye :D");
        scan.close();
    }
}
