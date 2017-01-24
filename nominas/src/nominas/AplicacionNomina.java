
package nominas;


public class AplicacionNomina {
    
    public static void main(String[] args) {
        int x=2;
        Trabajador worker=new Trabajador();
        
        worker.nombre="Pedro";
        worker.paterno="Lopez";
        worker.numeroSeguro=90;
        if(worker.numeroSeguro<=90)worker.numeroSeguro=100;
        
        System.out.println("El nombre es "+ worker.nombre);
        System.out.println("\nEl numero de seguro es "+ worker.numeroSeguro);
        
    }
    
}
