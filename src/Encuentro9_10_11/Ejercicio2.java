/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int [] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector [i] = (int) (Math.random()*100);
        }
        System.out.println("Ingrese el numero que quiere buscar");
        int num = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == num){
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
            }
        }
    }
}
