/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num = leer.nextInt();
        if(num % 2 == 0){
            System.out.println("El nuemro es PAR");
        }else{
        System.out.println("El numero es IMPAR");
        }
    }
}
