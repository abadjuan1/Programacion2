
package practico3;


public class NaveEspacial {
  
    

    String nombre;
    int combustible;
    int limiteCombustible = 100; // límite máximo

    void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println(nombre + " no puede despegar, no tiene combustible.");
        }
    }

    void avanzar(int distancia) {
        int consumo = distancia * 2; // por ejemplo, 2 unidades por distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar.");
        }
    }

    void recargarCombustible(int cantidad) {
        if (combustible + cantidad > limiteCombustible) {
            combustible = limiteCombustible;
            System.out.println("Tanque lleno. No se puede superar el límite.");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades de combustible.");
        }
    }

    void mostrarEstado() {
        System.out.println("Estado de la nave:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}

