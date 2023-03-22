/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vectorA = new int [n];
        int[] vectorB = new int [n];
        for(int i=0;i<n;i++){
            System.out.println("ingrese los datos del vectorA en la posicion: "+"["+i+"]");
            vectorA[i]=leer.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("ingrese los datos del vectorB en la posicion: "+"["+i+"]");
            vectorB[i]=leer.nextInt();
            
        }
       for(int i=0;i<n;i++){
            if (vectorA[i]==vectorB[i]){
                System.out.println("los vectores son iguales");
            }else{
                System.out.println("los vectores son diferentes");
            }
       }
    } 
}
    

