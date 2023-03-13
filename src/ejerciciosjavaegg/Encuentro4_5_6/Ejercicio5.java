/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese numeros");
            int num = leer.nextInt();
            suma += num;
            
        }while(suma <= limite);
        System.out.println("La suma supero el limite");
    }
}
