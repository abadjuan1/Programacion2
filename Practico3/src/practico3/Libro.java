
package practico3;


public class Libro {
    private String autor;
    private String titulo;
    private int anioPublicacion;
    
     public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAñoPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0){
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año inválido. No se actualizó.");
            getAnioPublicacion();
        }
    }
 


   
    
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
    

}
