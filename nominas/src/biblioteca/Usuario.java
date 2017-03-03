/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author T-102
 */
public class Usuario {
    
    private String nombre;
    private String titulo[];

    
   public Usuario(String nombre) {
        this.nombre = nombre;
    } 
    
    public Usuario(String nombre,String titulo[]) {
        this.nombre = nombre;
        this.titulo = titulo;
    }

     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String[] getTitulo() {
        return titulo;
    }

    public void setTitulo(String[] titulo) {
        this.titulo = titulo;
    }
    
    
    
    
}
