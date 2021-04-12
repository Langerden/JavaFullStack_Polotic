/*
Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodía y otro por la noche. 
Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles.
i. Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.
ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita.
iii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que
así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada con éxito” y se debe descontar del total de asientos los solicitados por el usuario. En caso de no haber más asientos disponibles, se debe informar otro cartel que diga “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.
iv. Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra “finish”.
 */
package vuelos.matrices;

import java.util.Scanner;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        int cantidadAsientos = 0;
        int asientosSolicitados = 0;
        int optionDestino = 0;
        int[][] vuelos = new int[6][3];
        boolean reserva = false;
        String destino = "";
        Scanner scan = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el vuelo: " + f );
                cantidadAsientos = scan.nextInt();
                vuelos[f][c] = cantidadAsientos;
            }
        }
        
        System.out.println("Ingrese el destino al cual se dirige:\n1)España\n2)Paris\n3)Francia\n4)Japon\n5)China\n6)Brazil");
        optionDestino = scan.nextInt();
        switch (optionDestino) {
            case 1:
                destino = "España";
                break;
            case 2:
                destino = "Paris";
                break;
            case 3:
                destino = "Francia";
                break;
            case 4:
                destino = "Japon";
                break;
            case 5:
                destino = "China";
                break;
            case 6:
                destino = "Brazil";
                break;
        }

        System.out.println("Ingrese la cantidad de asientos solicitados: ");
        asientosSolicitados = scan.nextInt();

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                if (optionDestino == f && vuelos[f][c] > asientosSolicitados) {
                    vuelos[f][c] -= asientosSolicitados;
                    reserva = true;
                }
            }
        }

        if (reserva) {
            System.out.println("Su reserva fue realizada con éxito a " + destino);
        } else {
            System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
        }
    }
}