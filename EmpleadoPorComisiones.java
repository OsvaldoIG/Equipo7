package com.equipo7.nomina;

/**
 *
 * @author poo02alu37
 */
public class EmpleadoPorComision extends Empleado{
    private int ventasTotales;
    private double tasaComision;
    
    public EmpleadoPorComision (String nombre,String apellido,String numSS, int ventasTotales, double tasaComision){ 
        super(nombre, apellido, numSS);
        this.ventasTotales = ventasTotales;
        this.tasaComision = tasaComision;
    }
    
    public void setVentasTotales(int ventas){
        this.ventasTotales = ventas;
    }
    
    public void setTasaComision(float tasa){
        this.tasaComision = tasa;
    }
    
    public int getVentasTotales(){
        return ventasTotales;
    }
    
    public double getTasaComision(){
        return tasaComision;
    }
    
    public String ingresos(){
        return ""+(ventasTotales * tasaComision);
    }
}
