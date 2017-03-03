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
public class Estudiant extends Usuario implements Prestamo {
    
    
  
    public Estudiant(String nombre, String[] titulo) {
        super(nombre, titulo);
    }

    @Override
    public String[] getTitulo() {
        return super.getTitulo(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
