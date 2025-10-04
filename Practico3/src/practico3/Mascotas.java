
package practico3;


public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.print("Nombre: " + nombre + " , especie: " + especie + " ,edad : " + edad);
    }
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más!");
    }
}
