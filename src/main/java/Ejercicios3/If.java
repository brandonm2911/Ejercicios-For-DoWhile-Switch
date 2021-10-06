package Ejercicios3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio del semestre: ");
        int promedioSemestre = scanner.nextInt();
        System.out.print("Ingrese el valor del examen final: ");
        int examenFinal = scanner.nextInt();
        if((promedioSemestre >= 90) || (examenFinal >= 90))
            System.out.println("La calificacion del estudiante es A");
        
        System.out.print("Por favor ingrese la calificacion: ");
        float calificacion = scanner.nextFloat();
        float valorCentinela = 10.0f;
        
        if(!(calificacion == valorCentinela))
            System.out.printf("La siguiente calificacion es %d\n", calificacion);
        
        if(calificacion != valorCentinela)
            System.out.printf("La siguiente calificacion es %d\n", calificacion);
    }
}
