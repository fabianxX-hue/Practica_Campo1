
package com.mycompany.practica_campo1;
import java.util.Scanner;

public class Practica_campo1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("===CALCULADORA===");
        
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            
            int opcion = sc.nextInt();

            if (opcion == 3) {
                continuar = false;
                System.out.println("¡Gracias por usar la calculadora!");
                break;
            }
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            
            switch (opcion) {
                case 1:
                    double suma = sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + suma);
                    break;
                default:
                 System.out.println("Opción no válida. Intente de nuevo.");
            }
            
        }
        sc.close();
           
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
    
 
    
}
