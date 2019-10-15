package com.equipo7.nomina;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    public EmpleadoAsalariado(String nombre, String apellido, String numeroSS){
        super(nombre,apellido,numeroSS);
    }
    
    public String ingresos(){
        return "Salario Semanal "+getSalarioSemanal();
    }
    
    public void setSalarioSemanal(double sueldo){
        this.salarioSemanal = sueldo;
    }
    
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    
}

