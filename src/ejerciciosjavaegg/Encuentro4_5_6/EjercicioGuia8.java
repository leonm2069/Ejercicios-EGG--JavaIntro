/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioGuia8 {
        
    public static void main(String[] args) {
        System.out.println("Ingrese su nota.");
        Scanner leer = new Scanner(System.in);
        int nota;
        do {
            nota = leer.nextInt();
            if (nota > 10 || nota < 0) {
                System.out.println("Nota incorrecta, vuelva a ingresarla.");
            }
        } while (nota > 10 || nota < 0);
        System.out.println("Nota correcta.");
    }
}
