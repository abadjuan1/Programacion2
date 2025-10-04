
package practico3;


public class Practico3 {

  
    public static void main(String[] args) {
        Estudiante a = new Estudiante();
        a.nombre = "Pedro";
        a.apellido = "Pascal";
        a.curso = "Python";
        a.calificacion = 9;
        a.mostrarInfo();
        System.out.println();
        a.puntos = 7;
        a.bajarCalificacion(a.puntos);
        a.mostrarInfo();
        System.out.println();
        
        //-----------------------------------------------------------------
    
        Mascotas c = new Mascotas();
        c.nombre = "Pipo";
        c.especie = "Perro";
        c.edad = 8;
        c.mostrarInfo();
        System.out.println();
        c.cumplirAnios();
        c.mostrarInfo();
        
        System.out.println(); 
    
        //-----------------------------------------------------------------
         Libro b = new Libro();
         b.setTitulo("El hobbit");
         b.setAutor("Tolkien");
         b.setAñoPublicacion(-85);
         b.mostrarInfo();
         System.out.println(); 
         b.setAñoPublicacion(1965);
         b.mostrarInfo();
         System.out.println();
         
         //-----------------------------------------------------------------
         
         Gallina maria = new Gallina();
         maria.idGallina = 1;
         maria.edad = 2;
         maria.huevosPuestos = 3;
         maria.mostrarEstado();
         System.out.println();
         maria.envejecer();
         maria.ponerHuevos();
         maria.mostrarEstado();
         System.out.println();
         
         Gallina marta = new Gallina();
         marta.idGallina = 2;
         marta.edad = 5;
         marta.huevosPuestos = 9;
         marta.mostrarEstado();
         System.out.println();
         marta.envejecer();
         marta.ponerHuevos();
         marta.mostrarEstado();
         System.out.println();
        //-----------------------------------------------------------------
          NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Explorer";
        nave.combustible = 50;

        nave.despegar();
        nave.avanzar(30); // intentar avanzar sin recargar
        nave.recargarCombustible(40);
        nave.avanzar(20); // ahora debería poder avanzar
        nave.mostrarEstado();
         
     }
}
