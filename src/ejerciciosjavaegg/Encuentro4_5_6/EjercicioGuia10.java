/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioGuia10 {
    
        public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        
        for (int i = 0; i < 4; i++) {
            numero = leer.nextInt();
            if (numero<=20 && numero>=1){
                System.out.print(numero);
                for (int j= 0; j < numero; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
            else {
                System.out.println("Debe estar entre 1 y 20 unidades.");
            }
        }
    }
}
