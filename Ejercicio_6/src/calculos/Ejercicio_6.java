/*
Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. 
Para esto necesita un programa que, para cada cálculo, permita el ingreso de los dos números por separado
al igual que la operación que desea hacer entre ambos. 
Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
 */
package calculos;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        double operation = 0;
        char operator;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el primer numero: ");
            num1 = scan.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scan.nextInt();
            System.out.println("Indique el tipo de operador (+ - / *): ");
            operator = scan.next().charAt(0);
            
            switch(operator){
                case '+':
                    operation = num1 + num2;
                    break;
                case '-':
                    operation = num1 - num2;
                    break;
                case '*':
                    operation = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0)
                        operation = num1 / num2;
                    else
                        operation = 0;
                    break;
                default:
                    operation = 0;
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("Resultado de la operacion: " + operation);
        }
    }
}
