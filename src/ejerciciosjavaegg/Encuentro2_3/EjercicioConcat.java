package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class EjercicioConcat {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Ingrese palabra");
    String palabra = leer.nextLine();
   
    if (palabra.length() == 4 ) {
        palabra = palabra.concat("!");
        System.out.println(palabra);
    } else {
        palabra = palabra.concat("?");
        System.out.println(palabra);
    }
   
    }
}
