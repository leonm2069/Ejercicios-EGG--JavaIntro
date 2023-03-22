/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;


public class EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        int A = leer.nextInt();
        System.out.println("Ingrese el valor de B");
        int B = leer.nextInt();
        System.out.println("Ingrese el valor de C");
        int C = leer.nextInt();
        System.out.println("Ingrese el valor de D");
        int D= leer.nextInt();
        int aux;
        System.out.println("El valor de A es: " +A );
        System.out.println("El valor de B es: " +B );
        System.out.println("El valor de C es: " +C );
        System.out.println("El valor de D es: " +D);
        System.out.println("=======================");
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("El valor de A es: " +A );
        System.out.println("El valor de B es: " +B );
        System.out.println("El valor de C es: " +C );
        System.out.println("El valor de D es: " +D);
    }
}
