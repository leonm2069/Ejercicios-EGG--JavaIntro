/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n= leer.nextInt();  
        int m= leer.nextInt();
        int[][] matriz = new int[n][m];
        int suma=0;
        for (int i=0; i< n;i++){
            for (int j=0;j<m;j++){
                matriz[i][j]=(int) (Math.random()*10);
                suma+=matriz[i][j];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("la suma de los elementos de la matriz es: "+suma);
    }  
}