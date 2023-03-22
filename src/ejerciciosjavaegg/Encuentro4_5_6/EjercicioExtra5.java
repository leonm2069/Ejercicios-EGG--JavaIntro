/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("A-Cuota mayor");
        System.out.println("B-Cuota moderada");
        System.out.println("C-Cuota menor");
        System.out.println("Ingrese la opcion que le corresponda");
        String opcion = leer.next();
        double costo;
        double descuento;
        switch(opcion){
            case "A":
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextDouble();
                descuento = costo * 0.5;
                System.out.println("El costo del tratamiento con un descuento del 50% es: " + descuento);
                break;
            case "B":
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextDouble();
                descuento = costo * 0.65;
                System.out.println("El costo del tratamiento con un descuento del 35% es: " + descuento);
                break;
            case "C":
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextDouble();
                System.out.println("El costo del tratamiento sin descuento es: " + costo);
                break;
            default:
                System.out.println("La opcion ingresada no corresponde a ningun tipo de socio");
        }
        
    }
}
