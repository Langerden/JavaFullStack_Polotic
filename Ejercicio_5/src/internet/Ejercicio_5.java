/*
Un gerente de una empresa prestadora de servicios de internet necesita un programa
que permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa. 
Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio. Los tipos de servicio son 3:
i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
iii. Internet 100 megas (Cuyo valor fijo es de $1600)
El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) 
e informar por pantalla el DNI del mismo junto con el monto a pagar y el número de servicio con el que cuenta.
 */
package internet;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        long dniCliente = 0;
        byte tipoServicio = 0;
        String servicio = "";
        double totalPagar = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese el DNI del cliente: ");
            dniCliente = scan.nextLong();
            System.out.println("Ahora ingrese el tipo de servicio\n1) 30 Megas\n2) 50 Megas\n3) 100 Megas\nOpcion: ");
            tipoServicio = scan.nextByte();
            switch(tipoServicio){
                case 1:
                    servicio = "Internet 30 megas";
                    totalPagar = (890 - (890*0.1));
                    break;
                case 2:
                    servicio = "Internet 50 megas";
                    totalPagar = (1050 - (1050*0.05));
                    break;
                case 3:
                    servicio = "Internet 100 megas";
                    totalPagar = 1600;
                    break;
                default:
                    System.out.println("No se ingresó una opcion valida del menu");
                    servicio = "-";
                    totalPagar = 0;
            }
            System.out.println("DNI: " + dniCliente + "| Total a Pagar: " + totalPagar + "| Servicio: " + servicio);
        }
    }
}
