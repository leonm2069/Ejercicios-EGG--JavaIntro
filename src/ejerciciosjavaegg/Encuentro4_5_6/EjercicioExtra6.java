/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas a medir");
        int cantidadPersonas = leer.nextInt();
        float promedioAltura = 0;
        float alturaPersona;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresa la altura de la persona");
            alturaPersona = leer.nextFloat();
            promedioAltura += alturaPersona;
        }
        promedioAltura /= cantidadPersonas;
        System.out.println("El promedio de la altura de las personas es de " + promedioAltura);
    }
}
