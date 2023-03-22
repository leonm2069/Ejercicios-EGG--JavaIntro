/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos 
para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
package Encuentro9_10_11;

import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main(String[] args) {
        double[] promedios = new double[10];
        Scanner leer = new Scanner(System.in);
        int contAprob=0;
        int contDes=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1));
            System.out.println("Primer trabajo práctico evaluativo");
            double nota1 = leer.nextDouble() * 0.1;
            System.out.println("Segundo trabajo práctico evaluativo");
            double nota2 = leer.nextDouble() * 0.15;
            System.out.println("Primer Integrador");
            double nota3 = leer.nextDouble() * 0.25;
            System.out.println("Segundo integrador");
            double nota4 = leer.nextDouble() * 0.5;
            
            double promedio = nota1 + nota2 + nota3 + nota4;
         if (promedio>=7){
             contAprob+=1;            
         }else{
             contDes+=1;
         }
            promedios[i] = promedio;
        }
        for (int i=0 ; i<3 ; i++){
            System.out.println(promedios[i]);
        }
        System.out.println("la cantidad de alumnos aprobados es: "+contAprob);
        System.out.println("la cantidad de alumnos desaprobados es: "+contDes);
    }    
        

    
}
