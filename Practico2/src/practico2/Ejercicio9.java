
package practico2;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
    
   public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
   }
   
   public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }
}

