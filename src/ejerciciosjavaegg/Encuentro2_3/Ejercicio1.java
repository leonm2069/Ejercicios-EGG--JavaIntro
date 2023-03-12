/*
 Escribir un programa que pida dos números enteros por teclado y calcule
 la suma de los dos. El programa deberá después mostrar el resultado de
 la suma
 */
package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + suma);
        
    }
}
