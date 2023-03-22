/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el tamaño del vector");
        int tamaño =leer.nextInt();
        int[] arreglo= new int[tamaño];
        rellenado(arreglo,tamaño);
        mostrar(arreglo,tamaño);
    }
    private static void rellenado(int[] arreglo,int tamaño) {
        for(int i=0; i<tamaño; i++){
            arreglo[i]=(int) (Math.random()*10);
        }
    } 
     
    private static void mostrar(int[] arreglo, int tamaño) {
        System.out.println("este es el vector:");
        for(int i=0; i<tamaño ; i++){
            System.out.println(arreglo[i]);
        }
    }
}