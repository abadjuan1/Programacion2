
package practico2;

import java.util.Scanner;


public class Practico2 {

  //EJERCICIO 1 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(sc.nextLine());

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (bisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

}
