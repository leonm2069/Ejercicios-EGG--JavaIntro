/*
Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector:");
        int n=leer.nextInt();
        int[] vector = new int [n];
        int suma=0;
        for(int i=0;i<n;i++){
            System.out.println("ingrese el dato de la fila: "+"["+i+"]");
            vector[i]= leer.nextInt();
            suma=suma+vector[i];
        }
        System.out.println("la suma de los datos del vector es: "+suma);
    }
    
}
  

