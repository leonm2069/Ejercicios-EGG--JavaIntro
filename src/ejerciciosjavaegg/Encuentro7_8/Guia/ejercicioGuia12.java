/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.
 */
package ejerciciosjavaegg.Encuentro7_8.Guia;

import java.util.Scanner;

public class ejercicioGuia12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        esMultiplo(leer.nextInt(),leer.nextInt());
        
    }
    public static void esMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
    }
        
}
