/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String palabra = leer.nextLine();
    
    if(palabra.equals("eureka")){
        System.out.println("Correcto");
    }else{
        System.out.println("Incorrecto");
    }
    
    }
}
