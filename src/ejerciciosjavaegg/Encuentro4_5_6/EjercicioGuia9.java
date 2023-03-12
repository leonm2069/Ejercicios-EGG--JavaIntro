package ejerciciosjavaegg.Encuentro4_5_6;

import java.util.Scanner;

public class EjercicioGuia9 {
    
    public static void main(String[] args) {
        
    System.out.println("Ingrese 20 números.");
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;
        for (int i=0; i<=20; i++){
           numero = leer.nextInt();
           if(numero==0){
               System.out.println("Se ha encontrado el número cero.");
            break;
          }
           if(numero>0){
           suma+=numero;
           }
        }
        System.out.println("El total es: " + suma);
    }
    
}
