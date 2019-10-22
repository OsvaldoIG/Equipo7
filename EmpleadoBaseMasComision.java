package com.equipo7.nomina;

/**
 *
 * @author poo02alu37
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    EmpleadoBaseMasComision(String nombre, String apellido, String numSS, int ventasTotales, double tasaComision, double salarioBase){ 
        super(nombre, apellido, numSS, ventasTotales, tasaComision);
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setSalarioBase(float salario){
        this.salarioBase = salario;
    }
    
    public String ingresos(){
        return ""+((super.getTasaComision() * super.getVentasTotales()) + salarioBase);
    }
    
}
