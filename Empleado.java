package my.equipo7.nomina;

public abstract class Empleado {
    String nombre;
    String apellido;
    String numSS;
    double sueldo;

    public Empleado (String nombre, String apellido, String numSS){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSS = numSS;
    }
    
    public String toString(){
        return "Nombre: "+apellido+" "+nombre+"\nNumero de Seguridad Social: "+numSS;
    }
    
    public abstract void ingresos();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setNumSS(String numSS){
        this.numSS = numSS;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNumSS(){
        return numSS;
    }
}
