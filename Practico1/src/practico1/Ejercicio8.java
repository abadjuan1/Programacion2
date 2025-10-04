
package practico1;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresa el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        // División entera
        int divisionEntera = num1 / num2;
        System.out.println("División entera: " + divisionEntera);

        // División con double
        double divisionReal = (double) num1 / num2;
        System.out.println("División real (con double): " + divisionReal);

        scanner.close();
    }

}
