
package practico1;

import java.util.Scanner;

public class Ejercicio9 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Solución: usar nextLine() en vez de nextInt()

        System.out.println("Hola, " + nombre);

        scanner.close();
        
        //El error estaba en usar nextInt() para leer un nombre (texto). Lo correcto es nextLine().
    }

}
