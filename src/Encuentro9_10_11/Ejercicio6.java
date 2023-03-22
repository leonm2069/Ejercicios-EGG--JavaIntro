/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);

        int[][]matriz = new int[3][3];
        int[] sumas = new int[8];

        System.out.println("Introduce los numeros del cuadrado magico (del 1 al 9):");

        // Introducir los numeros del cuadrado por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();

                // Comprobar que los numeros estan entre 1 y 9
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Error: Introduce numeros del 1 al 9.");
                    return;
                }
            }
        }
        
        // Calcular las sumas de las filas, las columnas y las diagonales
        sumas[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        sumas[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
        sumas[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
        sumas[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
        sumas[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
        sumas[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
        sumas[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
        sumas[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        // Comprobar si las sumas son iguales
        for (int i = 1; i < sumas.length; i++) {
            if (sumas[i] != sumas[0]) {
                System.out.println("El cuadrado no es magico.");
                return;
            }
        }
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j<matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("El cuadrado es magico.");
    }
}

