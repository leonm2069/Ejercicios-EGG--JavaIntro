/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println(nombre);
    }
    
}
