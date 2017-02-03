
package patos;


public class PatoMexicano extends Pato implements ComportamientoVolar {
     public static final String color="Blanco";

    @Override
    public void volar() {
        System.out.println("Soy pato mexicano y no vuelo");
    }
   
      
}
