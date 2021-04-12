/*
 *Llevar a cabo un programa que incluya un vector que almacene los nombres: 
 *Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. 
 *Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
 */
package nombres.vectores;
import java.util.Scanner;

/**
 * @author Denu-Chan
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        String [] nombres = new String [8];
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese su nombre: ");
            nombres[i] = scan.nextLine();
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }
    }
}
