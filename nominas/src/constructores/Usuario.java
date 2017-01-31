



package constructores;


public class Usuario {
    private String nombre, paterno;
    private int edad, matricula;
    
    
    
    public Usuario(){
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String paterno, int edad, int matricula) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
        this.matricula = matricula;
    }

    public Usuario(String nombre, String paterno) {
        this.nombre = nombre;
        this.paterno = paterno;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
