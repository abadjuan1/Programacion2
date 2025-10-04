
package practico2;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int num;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(sc.nextLine());
            if (num % 2 == 0) {
                suma += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + suma);

        sc.close();
    }

}
