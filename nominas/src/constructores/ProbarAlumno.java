
package constructores;

import javax.swing.*;



public class ProbarAlumno {
    
    public static void main(String[] args) {
        
        Alumno a=new Alumno();
        
        Alumno a2=new Alumno("Juan");
        
        System.out.println("Tu nombre es: "+ a.getNombre());
        
        JFrame ventana=new JFrame("Hola");
               ventana.setSize(400, 220);
               ventana.setVisible(true);
               
    }
    
}
