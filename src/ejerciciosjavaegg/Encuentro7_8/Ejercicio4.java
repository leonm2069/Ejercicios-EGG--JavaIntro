/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package ejerciciosjavaegg.Encuentro7_8;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            //Ejecutamos la funcion, como devuelve true o false, se puede colocar en un if"
        if (esPrimo(num)){
            System.out.println("El numero "+num+" es primo");
        }else{
            System.out.println("El numero "+num+" no es primo");
        }
    }
    public static boolean esPrimo (int num){
 
        //Un numero menor o igual que 1, no es primo.
        if (num<=1){
            return false;
        }
 
        //Declaramos esta variable aqui ya que despues es usada"
        int cont=0;
        for (int divisor=(int)Math.sqrt(num);divisor>1;divisor--){
            //contabilizados los divisibles"
                if (num%divisor==0){
                cont+=1;
            }
        }
        //Según el numero de divisibles es o no primo"
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    
    }
}
