/*
    Escribir un programa que lea un número entero por teclado y muestre
    por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;                      
        double raizCuadrada = Math.sqrt(numero);
        
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raizCuadrada);
    }
}
