/*
 Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal de una matriz de 6 x 6. 
Entiéndase por diagonal principal aquella que comienza en [0,0] y termina en [6,6].
 */
package diagonal.matriz;

/**
 *
 * @author Denu-Chan
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        int diagonal [][] = new int [6][6];
        
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 6; c++) {
                if(f == c)
                    diagonal[f][c] = 1;
                else
                    diagonal[f][c] = 0;
            }
        }
        
        for (int f = 0; f < 6; f++) {            
            for (int c = 0; c < 6 ; c++) {
                System.out.print(diagonal[f][c] + " ");
            }
            System.out.println("\n");
        }
    }
}
