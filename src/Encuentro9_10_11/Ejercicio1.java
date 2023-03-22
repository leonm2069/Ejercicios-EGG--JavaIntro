/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

 */
package Encuentro9_10_11;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 1; i < 101; i++) {
            num[i-1] = i;
        }
        for (int i = 99; i > -1 ; i--) {
            System.out.println(num[i]);
        }
    }
}
