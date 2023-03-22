/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejerciciosjavaegg.Encuentro7_8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        String op;
        do {
            analisis();
            System.out.println("Quieres seguir mostrando personas?No/Si");
            op = leer.next();

        } while (op.equalsIgnoreCase("No") == false);

    }

    public static void analisis() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona y su edad a analizar");
        String nombre = leer.nextLine();
        int edad = leer.nextInt();
        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " No es mayor de edad");
        }

    }


}
