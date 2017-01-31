

package constructores;


public class Nomina {
    
    private String tipo;
    private float saldo;
    private int horaLaboradas;

    public Nomina(){



}
    public Nomina(String tipo){
        this.tipo=tipo;
        
    
    }
    
    public Nomina(float saldo){
        
        this.saldo=saldo;
        
    
    }
    
    public Nomina(int horasLaboradas){
        this.horaLaboradas=horasLaboradas;
        
    
        
    }
    
    public Nomina(String tipo, float saldo, int horasLaboradas){
    
    this.tipo=tipo;
    this.saldo=saldo;
    this.horaLaboradas=horasLaboradas;
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getHoraLaboradas() {
        return horaLaboradas;
    }

    public void setHoraLaboradas(int horaLaboradas) {
        this.horaLaboradas = horaLaboradas;
    }
    
    
}
