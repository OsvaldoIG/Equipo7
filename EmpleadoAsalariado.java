package com.equipo7.nomina;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String numeroSS, double salarioSemanal){
        super(nombre,apellido,numeroSS);
        this.salarioSemanal = salarioSemanal;
    }
    
    public String ingresos(){
        return ""+getSalarioSemanal();
    }
    
    public void setSalarioSemanal(double sueldo){
        this.salarioSemanal = sueldo;
    }
    
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    
}
