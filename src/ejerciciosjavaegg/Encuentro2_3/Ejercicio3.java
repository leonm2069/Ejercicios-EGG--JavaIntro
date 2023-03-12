/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        frase = frase.toUpperCase();
        System.out.println("La frase en mayúscula: " + frase);
        frase = frase.toLowerCase();
        System.out.println("La frase en minúscula: " + frase);
        
        
    } 
}
