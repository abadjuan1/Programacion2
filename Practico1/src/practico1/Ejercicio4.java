
package practico1;

import java.util.Scanner;


public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingresa tu nombre ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad ");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.print("Tu nombre es: " + nombre + " y tenes " + edad + " años");
    }

}
