
package practico3;


public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    int puntos;
    
    public void mostrarInfo(){
        System.out.print("Nombre y apellido: " + nombre + " " + apellido + " curso : " + curso + ", calificacion: " + calificacion); 
    }
    
    public int subirCalificacion(int puntos){
        return calificacion += puntos;
    } 
    public int bajarCalificacion(int puntos){
        return calificacion -= puntos;
    } 
}
