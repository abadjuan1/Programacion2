
package practico2;

import java.util.Scanner;


public class Ejercicio10 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = Integer.parseInt(sc.nextLine());

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        sc.close();
    }
    public static int actualizarStock(int stock, int vendida, int recibida) {
        return stock - vendida + recibida;
    }
}
