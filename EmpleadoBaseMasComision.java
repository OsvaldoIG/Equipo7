package com.equipo7.nomina;

/**
 *
 * @author poo02alu37
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    EmpleadoBaseMasComision(String nombre, String apellido, String numSS, double sueldo){ 
        super(nombre, apellido, numSS, sueldo);
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setSalarioBase(float salario){
        this.salarioBase = salario;
    }
    
    public String ingresos(){
        return "Los ingresos son de : "+((super.getTasaComision() * super.getVentasTotales()) + salarioBase);
    }
    
}
