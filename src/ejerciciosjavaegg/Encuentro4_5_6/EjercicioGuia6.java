package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioGuia6 {
       public static void main(String[] args) {
        System.out.println("Ingresa un número entero.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingresa otro número entero.");
        int num2 = leer.nextInt();
        
        if(num1>=25 || num2>=25)
        System.out.println("Uno o ambos números son mayor o igual a 25.");
        
    
        else{
            System.out.println("Los números son menores a 25.");  
        }
   }

}
