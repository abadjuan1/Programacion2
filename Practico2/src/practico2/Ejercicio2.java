
package practico2;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int n2 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el tercer número: ");
        int n3 = Integer.parseInt(sc.nextLine());

        int mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;

        System.out.println("El mayor es: " + mayor);
    }

}
