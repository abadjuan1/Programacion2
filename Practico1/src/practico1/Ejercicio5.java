
package practico1;

import java.util.Scanner;


public class Ejercicio5 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingresa el primer número entero: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = Integer.parseInt(sc.nextLine());

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2; // casteo para evitar división entera

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        sc.close();
    }
}
    


