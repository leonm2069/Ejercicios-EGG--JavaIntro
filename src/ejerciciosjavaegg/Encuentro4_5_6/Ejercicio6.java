/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean salir = true;
        do{
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int     opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de ambos numeros es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de ambos numeros es: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicaión de ambos numeros es: " + multiplicacion);
                    break;
                case 4:
                    double division = num1 / num2;
                    System.out.println("La división de ambos numeros es: " + division);
                    break;
                case 5:
                    System.out.println("Salir del menú: S/N");
                    String respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")){
                        System.out.println("Usted ha salido del menú");
                        salir = false;
                    }
                    break;
            }
        }while (salir);
    }
}
