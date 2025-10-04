
package practico4;


public class Practico4 {

    
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Juan Perez", "Analista", 75000);
        Empleado e2 = new Empleado("Maria Gomez", "Desarrolladora");
        Empleado e3 = new Empleado("Carlos Diaz", "Tester");

        
        e1.actualizarSalario(10);     // Aumento del 10%
        e2.actualizarSalario(5000);   // Aumento fijo de $5000

        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }

}
