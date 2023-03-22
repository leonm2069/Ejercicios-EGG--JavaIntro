package Encuentro9_10_11;

import java.util.Scanner;

public class ejercicioGuia13 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de integrantes del equipo");
        int cantidad = leer.nextInt();
        String[] equipo = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los nombres de los integrantes");
            equipo[i] = leer.next();
            
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: "+ equipo[i] );
        }
            
    }
    	
}
