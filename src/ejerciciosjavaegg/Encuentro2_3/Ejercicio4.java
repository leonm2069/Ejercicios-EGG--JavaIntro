/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados");
        double C = leer.nextDouble();
        double F;
        F = 32 + (9*C/5);
        System.out.println("Equivalente en grados Fahrenheit: "+ F);
              
    }
}
