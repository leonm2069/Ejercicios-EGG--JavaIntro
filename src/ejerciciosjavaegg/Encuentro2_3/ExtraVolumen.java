package ejerciciosjavaegg.Encuentro2_3;

import java.util.Scanner;

public class ExtraVolumen {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el radio y la altura:");
        float radio = leer.nextFloat();
        float altura = leer.nextFloat();
        double volumen = Math.PI *(Math.pow(radio, 2)) * altura ;
        System.out.println("El volumen es: " + volumen);
            
        }
}
