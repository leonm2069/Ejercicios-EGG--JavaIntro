/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;


public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min;
        int hr;
        int dia;
        System.out.println("Ingrese el tiempo en minutos:");
        min= leer.nextInt();
        hr= (min%1440)/60;
        System.out.println("Equivalen a "+ hr + " Horas");
        dia= min/1440;
        System.out.println("Equivalen a "+ dia + " Días");
    }
}

