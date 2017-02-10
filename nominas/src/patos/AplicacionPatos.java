
package patos;

public class AplicacionPatos {
    
            public static void main(String[] args){
                
       
                ComportamientoVolar patos[]=new ComportamientoVolar[5];
                patos[0]=new PatoMexicano();
                patos[1]=new PatoMexicano();
                patos[2]=new PatoEuropeo();
                patos[3]=new PatoEuropeo();
                patos[4]=new PatoCanadiense();
                
                
          
                for(ComportamientoVolar p: patos){
                
                    p.volar();
                    
                
                }
                
                
                
            }
    }
    

