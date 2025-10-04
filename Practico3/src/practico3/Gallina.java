
package practico3;


public class Gallina {
int idGallina;
int edad;
int huevosPuestos;

public void ponerHuevos(){
    huevosPuestos += 1;
}
public void envejecer(){
    edad +=1;
}

public void mostrarEstado(){
    System.out.println("Gallina: " + idGallina);
    System.out.println("Edad: " + edad);
    System.out.println("Cantidad de huevos: " + huevosPuestos);
}
}
