
package practico2;

import java.util.Scanner;


public class Ejercicio8 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double base = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (ej: 10 para 10%): ");
        double impuesto = Double.parseDouble(sc.nextLine()) / 100;

        System.out.print("Ingrese el descuento en porcentaje (ej: 5 para 5%): ");
        double descuento = Double.parseDouble(sc.nextLine()) / 100;

        double total = calcularPrecioFinal(base, impuesto, descuento);

        System.out.println("El precio final del producto es: " + total);

        sc.close();
    }
    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }
}
