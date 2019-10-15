package com.equipo7.nomina;

/**
 *
 * @author poo02alu37
 */
public class EmpleadoPorComision extends Empleado{
    private int ventasTotales;
    private float tasaComision;
    
    public EmpleadoPorComision (String nombre,String apellido,String numSS, double sueldo){ 
        super(nombre, apellido, numSS);
        super.sueldo = sueldo;
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
    
    public float getTasaComision(){
        return tasaComision;
    }
    
    public String ingresos(){
        return "Los ingresos son de : "+(ventasTotales * tasaComision);
    }
}
